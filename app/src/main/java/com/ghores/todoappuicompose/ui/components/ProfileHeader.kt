package com.ghores.todoappuicompose.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Badge
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ghores.todoappuicompose.R
import com.ghores.todoappuicompose.ui.theme.Orange

@Composable
fun ProfileHeader() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(30.dp)
                .clip(CircleShape)
        )
        BadgedBox(
            badge = {
                Badge(
                    backgroundColor = Orange,
                    contentColor = Color.White,
                    modifier = Modifier.offset(y = 7.dp, x = (-6).dp)
                )
            },
            modifier = Modifier.padding(end = 16.dp)
        ) {
            Icon(
                imageVector = Icons.Filled.Notifications,
                contentDescription = "Notification Icon"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileHeaderPreview() {
    ProfileHeader()
}