package com.example.jetpackcomposeperformance

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun JetpackComposeUnStableExample(
    modifier: Modifier = Modifier,
) {
    val (isChecked, onChecked) = remember { mutableStateOf(false) }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Switch(checked = isChecked, onCheckedChange = onChecked)
        ListCreator(
            UnStableExampleClass(
                exampleList = listOf("recompose", "list", "test", "values")
            )
        )
    }
}

@Composable
fun ListCreator(
    testClass: UnStableExampleClass
) {
    Text(text = testClass.exampleList.toString())
}

@Stable
data class UnStableExampleClass(
    val exampleList: List<String>
)