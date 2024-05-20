package com.example.paginacion.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalTest(){
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    Box(modifier = Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
            page ->  when(page){
                0 -> FirstOne(page)
                1 -> SecondtOne(page)
                2 -> ThirdOne(page)
            }
        }
    }
}

@Composable
fun FirstOne(page: Int){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Caja No. " + (page + 1))
        }
    }
}
@Composable
fun SecondtOne(page: Int){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Caja No. " + (page + 1))
        }
    }
}
@Composable
fun ThirdOne(page: Int){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(text = "Caja No. " + (page + 1))
        }
    }
}

@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun PageSlider(){
    HorizontalTest()
}