/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.MyTheme


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val puppies = Data().populateData()
        setContent {
            MyTheme {
                MyApp(puppies = puppies)
            }
        }
    }


    @Composable
    fun MyApp(
        modifier: Modifier = Modifier,
        puppies: ArrayList<PuppyModel>
    ) {

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.fillMaxWidth()
        ) {


            items(puppies) { puppy ->
                PuppyRow(puppy)

            }
        }
    }

    @Composable
    fun PuppyRow(
        puppy: PuppyModel
    ) {


        Card(
            shape = RoundedCornerShape(4.dp),
            backgroundColor = Color(0xFFF0D6D6),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clickable(onClick = {
                    val intent = Intent(this@MainActivity, PuppyDesc::class.java)
                    Data.curr = puppy
                    startActivity(intent)
                })
        ) {
            Row {

                Image(
                    painter = painterResource(R.drawable.dogimg),
                    contentDescription = "dog image",
                    modifier = Modifier
                        .height(130.dp)
                        .width(130.dp)
                        .padding(5.dp),
                    contentScale = ContentScale.Crop,
                )

                Text(
                    text = "Name: ${puppy.name}",
                    modifier = Modifier.padding(8.dp),
                    style = TextStyle(
                        fontSize = 24.sp, color = Color.Black
                    ),
                    textAlign = TextAlign.Center
                )

            }
        }

    }


    @Composable
    fun MyDescription(puppy: PuppyModel) {
        Card(
            shape = RoundedCornerShape(4.dp),
            backgroundColor = Color(0xFFF0D6D6),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Column {

                Image(
                    painter = painterResource(R.drawable.dogimg),
                    contentDescription = "dog image",
                    modifier = Modifier
                        .height(130.dp)
                        .width(130.dp)
                        .padding(5.dp),
                    contentScale = ContentScale.Crop,
                    alignment = Alignment.TopCenter
                )

                Row {
                    Text(
                        text = "Name: ${puppy.name}",
                        modifier = Modifier.padding(8.dp),
                        style = TextStyle(
                            fontSize = 24.sp, color = Color.Black
                        ),
                        textAlign = TextAlign.Center
                    )
                }


            }
        }
    }


    @Preview("Light Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun LightPreview() {
        val puppies = Data().populateData()
        MyTheme {
            MyApp(puppies = puppies)
        }
    }

    @Preview("Dark Theme", widthDp = 360, heightDp = 640)
    @Composable
    fun DarkPreview() {
        val puppies = Data().populateData()
        MyTheme(darkTheme = true) {
            MyApp(puppies = puppies)
        }
    }
}
