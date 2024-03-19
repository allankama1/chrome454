package com.example.allanapp52


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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.TestModifierUpdaterLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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

       Button(onClick = { /*TODO*/ }, shape = RectangleShape
           , colors = ButtonDefaults.buttonColors(Color.Black),
           modifier = Modifier.align(Alignment.CenterHorizontally)) {
           Text(text = "See more")
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
       Text(text = "3.Ferrari")
       Text(text = "4.Bugatti")

       Spacer(modifier= Modifier.height(20.dp))

       Text(text = "Best Football clubs in Europe", fontSize = 30.sp,
           color = Color.Blue,
           textAlign = TextAlign.Center,
           textDecoration = TextDecoration.Underline)
       Text(text = "Here are some of the top clubs that play excellent football: ")
       Text(text = "1.Liverpool")
       Text(text = "2.Manchester United")
       Text(text = "3.PSG")
       Text(text = "4.Real Madrid")

       Spacer(modifier= Modifier.height(20.dp))
       Divider()
       Spacer(modifier= Modifier.height(20.dp))

       Box (modifier = Modifier.fillMaxWidth(),
           contentAlignment = Alignment.Center
       ) {
           Image(painter = painterResource(id = R.drawable.dog2),
               contentDescription = "dog",
               modifier = Modifier.size(350.dp))
       }



       Text(text = "eMobilis Mobile Training Institute",
           fontSize = 20.sp,
           fontWeight = FontWeight.Bold)

       Spacer(modifier= Modifier.height(10.dp))  
       
       Button(onClick = { /*TODO*/ }, shape = RoundedCornerShape(5.dp),
           colors = ButtonDefaults.buttonColors(Color.Blue),
           modifier = Modifier
               .fillMaxWidth()
               .padding(start = 30.dp, end = 30.dp)) {
           Text(text = "Continue")
       }
       
       
   }
}



@Preview(showBackground = true)
@Composable

fun Demopreview(){
    Demo()
}