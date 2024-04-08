package com.example.allanapp52

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ContentScale.Companion.FillBounds
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.allanapp52.ui.theme.AllanApp52Theme
import com.example.allanapp52.ui.theme.Blue
import com.example.allanapp52.ui.theme.Grey
import com.example.allanapp52.ui.theme.Blue
import com.example.allanapp52.ui.theme.piink
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splashscreen : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Myslash()

            val mContext = LocalContext.current
            val coroutineScope = rememberCoroutineScope()
            coroutineScope.launch {
                delay(9000)
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
                finish()

            }

        }
    }
}

@Composable
fun Myslash(){
    Column(modifier = Modifier
        .fillMaxSize()
        .fillMaxSize()
        .fillMaxWidth()
        .paint(
            painterResource(id = R.drawable.bmw),
            contentScale = FillBounds

        )) {

        val mContext = LocalContext.current

        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.car))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(350.dp)
        )
        //End of Lottie animation

Text(text = "Welcome to A-app." +
        "Here you will find the automobile you are lookin for.",
    textAlign = TextAlign.Center,
    color = Blue,
    fontSize = 29.sp,
    fontWeight = FontWeight.ExtraBold)


        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext,Act1::class.java)) }, shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(piink),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)) {
            Text(text = "Preview")
        }





    }

}

@Preview(showBackground = true)
@Composable
fun Splashpreview(){
    Myslash()

}