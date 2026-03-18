package com.example.firstscreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.firstscreen.R

@Composable
fun contact(name: String, phone: String){

    Row{
        Image(
            painter = painterResource(id = R.drawable.movil),
            contentDescription = null,
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Column{
            Text(
                text = name,
                fontSize = 17.sp
            )
            Text(
                text = phone,
                fontSize = 15.sp
            )
        }
    }

}