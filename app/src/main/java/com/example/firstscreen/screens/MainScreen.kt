package com.example.firstscreen.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.firstscreen.components.contact

@Composable
fun MainScreen (navController: NavController){

    val telefonos = listOf( Pair("carlos", "6121219988"))

    var nameContact by remember { mutableStateOf("") }
    var phoneContact by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = nameContact,
            onValueChange = { nameContact = it },
            label = { Text("name") },
            modifier = Modifier.width(300.dp)
        )

        Spacer(modifier = Modifier.width(20.dp))

        OutlinedTextField(
            value = phoneContact,
            onValueChange = { phoneContact = it },
            label = { Text("Phone") },
            modifier = Modifier.width(300.dp)
        )
    }



    LazyColumn{

        items(telefonos){
            contact -> contact(name = contact.first, phone = contact.second)
        }

    }
}