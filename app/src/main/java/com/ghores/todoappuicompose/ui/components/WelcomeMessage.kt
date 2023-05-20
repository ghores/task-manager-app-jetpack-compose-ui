package com.ghores.todoappuicompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ghores.todoappuicompose.R
import com.ghores.todoappuicompose.ui.theme.LightGray

@Composable
fun WelcomeMessage() {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Text(
            text = "Hi Amin!",
            fontFamily = FontFamily(Font(R.font.nunito_extrabold)),
            fontSize = 22.sp
        )

        Text(
            text = "8 tasks for today Monday",
            fontFamily = FontFamily(Font(R.font.nunito_regular)),
            fontSize = 18.sp,
            color = LightGray
        )
    }
}