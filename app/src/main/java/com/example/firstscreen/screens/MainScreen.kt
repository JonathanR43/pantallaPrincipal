package com.example.firstscreen.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.firstscreen.components.contact

@Composable
fun MainScreen(navController: NavController) {

    var telefonos by remember { mutableStateOf(listOf<Pair<String, String>>()) }

    var nameContact by remember { mutableStateOf("") }
    var phoneContact by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = nameContact,
            onValueChange = { nameContact = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = phoneContact,
            onValueChange = { phoneContact = it },
            label = { Text("Telefono") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                if (nameContact.isNotEmpty() && phoneContact.isNotEmpty()) {
                    telefonos = telefonos + Pair(nameContact, phoneContact)
                    nameContact = ""
                    phoneContact = ""
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Agregar contacto")
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(telefonos) { contacto ->
                contact(name = contacto.first, phone = contacto.second)
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
}