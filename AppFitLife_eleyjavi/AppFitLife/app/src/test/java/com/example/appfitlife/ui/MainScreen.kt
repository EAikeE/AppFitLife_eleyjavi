package com.example.appfitlife.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appfitlife.viewmodel.UserViewModel

@Composable
fun MainScreen(viewModel: UserViewModel = UserViewModel()) {
    val user = viewModel.getUserData()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Bienvenidas ${user.name}", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Correo de contacto: ${user.email}")
    }
}