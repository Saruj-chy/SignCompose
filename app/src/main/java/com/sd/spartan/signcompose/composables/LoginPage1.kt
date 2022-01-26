package com.sd.spartan.signcompose.composables

import android.media.Image
import androidx.appcompat.widget.ActivityChooserView
import androidx.compose.animation.graphics.vector.AnimatedImageVector
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.key.onKeyEvent
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
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
fun LoginPage1(){
    Box {
        BgCart()
        MainCart()
    }
}

@Composable
fun BgCart(){
    val signUpText = buildAnnotatedString {
        append("Don't have an Account?")
        withStyle(SpanStyle(color = Oranglish)){
            append("Sign up here")
        }
    }
    Surface(color = Purplish, modifier = Modifier.fillMaxSize()) {
        Column(verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.offset(y=(-30).dp)) {
            Row() {
                Image(painter = painterResource(id = R.drawable.ic_fb), contentDescription = "")
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Image(painter = painterResource(id = R.drawable.ic_google), contentDescription = "")
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
                Image(painter = painterResource(id = R.drawable.ic_twitter), contentDescription = "")
            }
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
            Text(text = signUpText, color = Color.White)
        }

    }
}

@Composable
fun MainCart(){
    val emailSate = remember { mutableStateOf(TextFieldValue("")) }
    val passSate = remember { mutableStateOf(TextFieldValue("")) }
    Surface(color = Color.White,
        modifier = Modifier
            .height(600.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(60.dp).copy(topStart = ZeroCornerSize, topEnd = ZeroCornerSize)) {
        Column(modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally )  {


            val modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
            val image: Painter = painterResource(id = R.drawable.ic_vaccum)
            Image(painter = image, contentDescription = "")
            Spacer(modifier = Modifier.padding(16.dp))
//                OutlinedTextField(value = "sarose.datta.cu@gmail.com",
//                    onValueChange ={
//                    emailSate.value = it
//                },label = {
//                    Text(text = "Email Address")
//                }, leadingIcon = { Icon(Icons.Filled.Email) }, )

            OutlinedTextField(
                value = emailSate.value ,
                onValueChange = { emailSate.value = it },
                label = { Text("Email Address") },
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier
            )
            OutlinedTextField(
                value = passSate.value ,
                onValueChange = { passSate.value = it },
                label = { Text("Password") },
                textStyle = TextStyle(
                    color = Color.Black,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier
            )
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
                Text(text="Forget Password", textAlign = TextAlign.End, modifier = modifier)
            }
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            Button(
                onClick = { /*TODO*/ },
                shape = Shapes.medium,
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                modifier = Modifier.fillMaxWidth(),


                ) {
                Text("Log in")
            }
        }


    }


}