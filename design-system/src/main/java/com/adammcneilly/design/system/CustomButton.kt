package com.adammcneilly.design.system

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CustomButton(
    buttonText: String,
) {
    Button(
        onClick = {},
    ) {
        Text(
            text = buttonText,
        )
    }
}

@Preview
@Composable
fun CustomButtonPreview() {
    CustomButton("Test Button")
}
