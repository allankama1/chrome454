package com.example.allanapp52


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.TestModifierUpdaterLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.allanapp52.ui.theme.AllanApp52Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Demo()
        }
    }
}

@Composable
fun Demo(){

   Column(modifier = Modifier.fillMaxSize() ) {

       val mContext = LocalContext.current


       Text(
           text = "Welcome to Android",
           color = androidx.compose.ui.graphics.Color.Red,
           fontSize = 30.sp,
           fontStyle = FontStyle.Italic,
           fontWeight = FontWeight.Bold
       )
       Text(
           text = "Android is android"

       )



       Button(onClick = {
           mContext.startActivity(Intent(mContext, DestinationKActivity::class.java))
       }, shape = RectangleShape
           , colors = ButtonDefaults.buttonColors(Color.Black),
           modifier = Modifier.align(Alignment.CenterHorizontally )) {
           Text(text = "Destination")
       }

       Spacer(modifier= Modifier.height(20.dp))

       Text(text = "Types of cars",
           fontSize = 30.sp,
           modifier = Modifier
               .fillMaxWidth()
               .background(androidx.compose.ui.graphics.Color.Red)
               .height(40.dp),
           textAlign = TextAlign.Center,
           textDecoration = TextDecoration.Underline,
           color = androidx.compose.ui.graphics.Color.White,
           fontWeight = FontWeight.Bold

           )
       Text(text = "1.BMW")
       Text(text = "2.Mercedes")



       //Lottie Animation
       val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.car))
       val progress by animateLottieCompositionAsState(composition)
       LottieAnimation(composition, progress,
           modifier = Modifier.size(150.dp)
       )
       //End of Lottie animation





       Spacer(modifier= Modifier.height(10.dp))

       Text(text = "Best Football clubs in Europe", fontSize = 30.sp,
           color = Color.Blue,
           textAlign = TextAlign.Center,
           textDecoration = TextDecoration.Underline)
       Text(text = "Here are some of the top clubs that play excellent football: ")
       Text(text = "1.Liverpool")
       Text(text = "2.Manchester United")

       Spacer(modifier= Modifier.height(10.dp))
       Divider()
       Spacer(modifier= Modifier.height(10.dp))

       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center
       ) {
           Image(painter = painterResource(id = R.drawable.dog2),
               contentDescription = "dog",
               modifier = Modifier
                   .size(200.dp)
                   .clip( shape = CircleShape),
               contentScale = ContentScale.Crop

           )
       }



       Text(text = "eMobilis Mobile Training Institute",
           fontSize = 20.sp,
           fontWeight = FontWeight.Bold)

       Spacer(modifier= Modifier.height(10.dp))  
       
       Button(onClick = { mContext.startActivity(Intent(mContext,LayoutActivity2::class.java)) }, shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Blue),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp)) {
           Text(text = "Continue")
       }

       Button(onClick = {
           mContext.startActivity(Intent(mContext, Splashscreen::class.java))
       }, shape = RectangleShape
           , colors = ButtonDefaults.buttonColors(Color.Black),
           modifier = Modifier.align(Alignment.CenterHorizontally )) {
           Text(text = "Splashscreen")
       }
       
   }
}



@Preview(showBackground = true)
@Composable

fun Demopreview(){
    Demo()
}