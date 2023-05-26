package com.fizahra.fiifloristcompose.ui.detail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fizahra.fiifloristcompose.R
import com.fizahra.fiifloristcompose.ui.theme.FiiFloristComposeTheme

@Composable
fun DetailActivity() {
}

@Composable
fun DetailFlower(
    @DrawableRes image: Int,
    name: String,
    longdesc : String,
    ilmiah : String,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Box{
            Image(
                painter = painterResource(image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .height(400.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
            )
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back",
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { onBackClick() }
            )
        }
        Column(
            modifier = Modifier.padding(16.dp)
        ){
            Text(
                text = name,
                style = MaterialTheme.typography.h5.copy(
                    fontWeight = FontWeight.ExtraBold
                ),
            )
            Text(
                text = ilmiah,
                style = MaterialTheme.typography.subtitle1.copy(
                    fontWeight = FontWeight.ExtraBold
                ),
            )
            Text(
                text = longdesc,
                style = MaterialTheme.typography.body2,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun DetailFlowerPrev(){
    FiiFloristComposeTheme {
        DetailFlower(
            R.drawable.baby_breath,
            "Baby Breath",
            """Baby breath memiliki kelopak berukuran mungil dan banyak tumbuh di kawasan Asia, Mediterania Timur, dan juga Eropa. Bunga ini memiliki rentang mekar yang lumayan lama, yaitu pada awal musim semi hingga di penghujung musim gugur. Sementara waktu tumbuh bunga ini memerlukan rentang antara 8 hingga 12 minggu.
                    Baby breath atau napas bayi ini dapat didefinisikan sebagai sebuah ketulusan dan cinta abadi. Karena itu, banyak yang memakainya sebagai bouquet untuk acara pernikahan.
            """.trimIndent(),
            "Gypsophila",
            onBackClick = {},
        )
    }
}