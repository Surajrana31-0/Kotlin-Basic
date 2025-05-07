package com.example.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
//import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.demo.ui.theme.DEMOTheme

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DEMOTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Registration(innerPadding)
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Registration(innerPadding: PaddingValues) {
    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var selectedCountry by remember { mutableStateOf("Select Country") }
    var expanded by remember { mutableStateOf(false) }
    val countries = listOf("Nepal", "India", "USA", "Australia","Canada","Japan")
    var dob by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("Male") }
    var acceptTerms by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(text = "Register", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(16.dp))

        // Firstname and Lastname side by side
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            OutlinedTextField(
                value = firstName,
                onValueChange = { input -> firstName = input },
                label = { Text("Firstname") },
                modifier = Modifier.weight(1f)
            )
            OutlinedTextField(
                value = lastName,
                onValueChange = { input -> lastName = input},
                label = { Text("Lastname") },
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Email
        OutlinedTextField(
            value = email,
            onValueChange = { input -> email = input },
            label = { Text("Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Country Dropdown
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            OutlinedTextField(
                value = selectedCountry,
                onValueChange = {},
                readOnly = true,
                label = { Text("Select Country") },
                modifier = Modifier
                    //.menuAnchor()
                    .fillMaxWidth(),
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                colors = ExposedDropdownMenuDefaults.textFieldColors()
            )
            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                countries.forEach { country ->
                    DropdownMenuItem(
                        text = { Text(country) },
                        onClick = {
                            selectedCountry = country
                            expanded = false
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // DOB
        OutlinedTextField(
            value = dob,
            onValueChange = { dob = it },
            label = { Text("Date of Birth") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Gender radio buttons
        Text(text = "Gender")
        Row(verticalAlignment = Alignment.CenterVertically) {
            RadioButton(selected = gender == "Male", onClick = { gender = "Male" })
            Text("Male")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(selected = gender == "Female", onClick = { gender = "Female" })
            Text("Female")
            Spacer(modifier = Modifier.width(8.dp))
            RadioButton(selected = gender == "Others", onClick = { gender = "Others" })
            Text("Others")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Terms and Conditions
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = acceptTerms, onCheckedChange = { acceptTerms = it })
            Text("I accept terms and conditions")
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Submit button
        Button(
            onClick = { /* Handle registration */ },
            modifier = Modifier.fillMaxWidth(),
            enabled = acceptTerms
        ) {
            Text("Register")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RegistrationPreview() {
    DEMOTheme {
        Registration(innerPadding = PaddingValues(0.dp))
    }
}
