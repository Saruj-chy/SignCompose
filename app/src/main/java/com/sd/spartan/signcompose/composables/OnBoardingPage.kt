package com.sd.spartan.signcompose.composables


import android.graphics.drawable.shapes.OvalShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sd.spartan.signcompose.R
import com.sd.spartan.signcompose.ui.theme.*

@Preview(showBackground = true)
@Composable
fun OnBoardingPage() {
    Box {
        BgCart2()
        MainCart2()
    }
}


@Composable
fun BgCart2(){

    Surface(color = Purplish, modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.offset(y=(-30).dp)) {
            Row() {
                Box(
                    Modifier
                        .background(Color.Gray)
                        .size(10.dp)
                        .clip(CircleShape) )
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Box(
                    Modifier
                        .background(Color.White)
                        .size(10.dp)
                        .clip(CircleShape)  )
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Box(
                    Modifier
                        .background(Color.Gray)
                        .size(10.dp)
                        .clip(CircleShape)  )
            }
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().padding(16.dp) ){
                TextButton(onClick = { /*TODO*/ }) {
                    Text(text = "Skip", color = Color.White)
                    
                }
                Row(verticalAlignment = Alignment.CenterVertically){
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "Next", color = Color.White)
                        Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                        Image(painter = painterResource(id = R.drawable.ic_next), contentDescription = "" )

                    }
                }
            }
        }

    }
}

@Composable
fun MainCart2(){

    Surface(color = Color.White,
        modifier = Modifier
            .height(600.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(60.dp).copy(topStart = ZeroCornerSize, topEnd = ZeroCornerSize)) {

        Column(modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally )  {

            Image(painter = painterResource(id = R.drawable.ic_cleaning), contentDescription = "")
            Spacer(modifier = Modifier.padding(32.dp))
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text="Cleaning on Demand", style = MaterialTheme.typography.h6 )
            }
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text="Book an appointment in less than 60 seconds and get on the schedule as early as possible",
                    style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center)
            }

        }


    }


}