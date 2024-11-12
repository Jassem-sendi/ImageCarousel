package com.example.countries.ui.flage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage

@Composable
fun CountryInfoCard(modifier: Modifier){
    AsyncImage(
        model = "https://upload.wikimedia.org/wikipedia/commons/e/ee/Logo_de_Facebook.png",
        contentDescription = "",
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    )
}
@Preview(device = "spec:width=411dp,height=891dp")
@Composable
fun CountryInfoCardPreview(){
    Box (Modifier
        .fillMaxSize()
        .background(Color.White)
    ) {
        CountryInfoCard(Modifier)
    }
}