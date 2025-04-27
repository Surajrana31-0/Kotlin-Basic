package com.example.myapplication

import android.R.attr.fontWeight
import android.R.attr.text
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import java.nio.file.WatchEvent

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold{ innerPadding->

                    LoginBody(innerPadding)

                }



            }

        }
    }

@Composable
fun LoginBody(innerPadding: PaddingValues){
    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Row (
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
            ){
            //Methode 1
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.height(30.dp).width(30.dp)
            )
            Text(text = "Andrew",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    /*fontStyle = FontStyle.Italic,
                    textDecoration = TextDecoration.Underline*/

                )
            )
            //Methode 2
            Icon(
                painter= painterResource(R.drawable.baseline_more_horiz_24),
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.height(30.dp).width(30.dp)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){

            Image(
                painter= painterResource(R.drawable.slow),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp).clip(
                        shape = RoundedCornerShape(20.dp)
                    )
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "174")
                Text(text = "Posts")
            }


            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "1740K")
                Text(text = "Followers")
            }
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "174")
                Text(text = "Following")
            }
        }

        Column(
            modifier =
                Modifier.padding(
                    horizontal = 10.dp,
                    vertical = 15.dp
                )
        ) {
            Text("Andrew Queo", style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = Color.Red,
                fontSize = 19.sp
            )
            )
            Text("Artist", modifier = Modifier.alpha(0.5f))
            Text("DESIGNER", style = TextStyle(
                fontWeight = FontWeight.SemiBold,

            )
            )
            Text("isabella@art.design")
            Text("Followed by jeena and anna", style = TextStyle(
                fontWeight = FontWeight.ExtraLight
            )
            )
        }
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Button(onClick = {
                //Action done when user clicked the button

            },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.Black
                )
            )
            {
                Text("Follow")
            }
            OutlinedButton(
                onClick = {

                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Text("Message")
            }
            OutlinedButton(
                onClick = {

                },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Text("Email")
            }
            OutlinedButton(
                onClick = {

                },
                shape = RoundedCornerShape(10.dp),
//                border = BorderStroke(1.dp,Color.Red),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = Color.Black
                )
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null
                )
            }


        }

        Spacer(modifier = Modifier.height(50.dp))
        Row {
            Card(
                modifier = Modifier.height(300.dp).weight(1f)
            ) {

            }
            Spacer(modifier = Modifier.width(50.dp))
            val Green40 = null
            Card(
                modifier = Modifier.height(300.dp).weight(3f),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Green
                )
            ) {

            }
        }


    }




}

@Preview
@Composable
fun PreviewBody(){
    LoginBody(innerPadding = PaddingValues(0.dp))
}

