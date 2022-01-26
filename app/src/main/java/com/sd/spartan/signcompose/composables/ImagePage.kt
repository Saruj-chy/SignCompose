package com.sd.spartan.signcompose.composables

import android.media.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.sd.spartan.signcompose.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

@Preview(showBackground = true)
@Composable
fun ImagePage(){
    val image: Painter = painterResource(id = R.drawable.ic_email)
    Image(painter = image, contentDescription = "")
}