package com.fizahra.fiifloristcompose.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fizahra.fiifloristcompose.R
import com.fizahra.fiifloristcompose.model.Flower

@Composable
fun ItemFlower(
    flower : Flower,
    modifier: Modifier = Modifier,
){
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row {
            Image(
                painter = painterResource(flower.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(100.dp)
                    .width(100.dp)
                    .clip(RoundedCornerShape(8.dp)),
            )
            Spacer(modifier = Modifier.width(width = 20.dp))
            Column {
                Text(
                    text = flower.name,
                    style = MaterialTheme.typography.h2.copy(
                        fontWeight = FontWeight.ExtraBold
                    ),
                )
                Spacer(modifier = Modifier.height(height = 8.dp))
                Text(
                    text = flower.shortdesc,
                    style = MaterialTheme.typography.subtitle2,
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ItemFlowerPrev(){
    MaterialTheme{
        ItemFlower(
            flower = Flower(R.drawable.baby_breath, "Baby's Breath","Bunga klasik yang melambangkan cinta sejati, kemurnian dan perasaan tulus", """
                            Baby breath memiliki kelopak berukuran mungil dan banyak tumbuh di kawasan Asia, Mediterania Timur, dan juga Eropa. Bunga ini memiliki rentang mekar yang lumayan lama, yaitu pada awal musim semi hingga di penghujung musim gugur. Sementara waktu tumbuh bunga ini memerlukan rentang antara 8 hingga 12 minggu. 
                            Baby breath atau napas bayi ini dapat didefinisikan sebagai sebuah ketulusan dan cinta abadi. Karena itu, banyak yang memakainya sebagai bouquet untuk acara pernikahan.
                        """.trimIndent(), "Gypsophila"),
            modifier = Modifier.padding(8.dp)
        )
    }
}