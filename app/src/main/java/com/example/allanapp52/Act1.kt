package com.example.allanapp52

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allanapp52.ui.theme.AllanApp52Theme
import com.example.allanapp52.ui.theme.piink

class Act1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Act()




        }
    }
}

@Composable
fun Act(){
    Column (

        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val mContext = LocalContext.current

        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(painter = painterResource(id = R.drawable.shopping1),
                contentDescription = "dog",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop

            )
        }
        Spacer(modifier = Modifier.height(15.dp))
Text(text = "Choose your product",
        fontSize = 30.sp,
    fontStyle = FontStyle.Italic,
    fontWeight = FontWeight.Bold
)
        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "The product you sell online is the identity of your online brand. " +
                "Many eCommerce beginners invest a lot of time wondering how to make the right decision. ",
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { mContext.startActivity(Intent(mContext,Act2::class.java)) }, shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(piink),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)) {
            Text(text = "Next")
        }

    }
}

@Preview(showBackground = true,showSystemUi = true)
@Composable
fun Actpreview(){
Act()
}