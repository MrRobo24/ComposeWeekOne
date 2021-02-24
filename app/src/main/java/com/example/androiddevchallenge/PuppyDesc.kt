package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.MyTheme

class PuppyDesc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val puppy = Data.curr
        setContent {
            MyTheme {
                Desc(puppy = puppy!!)
            }
        }
    }

    @Composable
    fun Desc(puppy: PuppyModel, modifier: Modifier = Modifier) {
        Card(
            shape = RoundedCornerShape(4.dp),
            backgroundColor = Color(0xFFF0D6D6),
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.dogimg),
                    contentDescription = "dog image",
                    modifier = Modifier
                        .height(200.dp)
                        .fillMaxWidth()
                        .padding(5.dp),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = "Name: ${puppy.name}",
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 24.sp, color = Color.Black
                    ),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "Breed: ${puppy.breed}",
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 24.sp, color = Color.Black
                    ),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Color: ${puppy.color}",
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 24.sp, color = Color.Black
                    ),
                    textAlign = TextAlign.Center
                )

                Text(
                    text = "Age: ${puppy.age}",
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    style = TextStyle(
                        fontSize = 24.sp, color = Color.Black
                    ),
                    textAlign = TextAlign.Center
                )

            }
        }
    }

}
