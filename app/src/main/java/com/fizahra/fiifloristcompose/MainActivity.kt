package com.fizahra.fiifloristcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fizahra.fiifloristcompose.model.Flower
import com.fizahra.fiifloristcompose.model.Flowers
import com.fizahra.fiifloristcompose.ui.component.ItemFlower
import com.fizahra.fiifloristcompose.ui.theme.FiiFloristComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FiiFloristComposeTheme {
                FiiFloristApp()
            }
        }
    }
}

@Composable
fun FiiFloristApp(){
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        FlowerList(Flowers)
    }
}

@Composable
fun FlowerList(
    listFlower: List<Flower>,
    modifier: Modifier = Modifier
){
    LazyColumn(
        verticalArrangement = Arrangement.SpaceEvenly,
        contentPadding = PaddingValues(vertical = 10.dp),
        modifier = modifier
    ){
        items(listFlower){ flower ->
            ItemFlower(flower)
        }
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun DefaultPreview() {
    FiiFloristComposeTheme {
        FiiFloristApp()
    }
}