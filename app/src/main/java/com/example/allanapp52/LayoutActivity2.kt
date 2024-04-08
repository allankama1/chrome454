package com.example.allanapp52

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.allanapp52.ui.theme.AllanApp52Theme

class LayoutActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){

    Column(modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Home", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription ="arrowback", tint = Color.White )
                }

            },
            actions = {
                IconButton(onClick = {     val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))}) {
                    Icon(
                        imageVector = Icons.Default.Share,
                        contentDescription = "Share", tint = Color.White
                    )
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = "Search", tint = Color.White
                    )
                }

            }

        )
// End of TopAppbar
          Spacer(modifier = Modifier.height(5.dp))


                Text(text = "BREEDS OF DOGS",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

        //Row1
        Row{

            Image(painter = painterResource(id = R.drawable.huskky),
                contentDescription = "Pitbull",
                modifier = Modifier.size(width = 250.dp, height = 100.dp))

          Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Husky", fontWeight = FontWeight.Bold)
                Text(text = "Husky is a general term for a dog used in the polar regions, primarily and specifically for work as sled dogs. It refers to a traditional northern type, notable for its cold-weather tolerance and overall hardiness ",)

            }

        }
        //End of Row

        Spacer(modifier = Modifier.height(5.dp))

        //Row2
        Row{

            Image(painter = painterResource(id = R.drawable.pitbull),
                contentDescription = "Pitbull",
                modifier = Modifier.size(width = 250.dp, height = 100.dp))

            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "Pitbull", fontWeight = FontWeight.Bold)
                Text(text = "Pit bull fighting dog developed in 19th-century England, Scotland, and Ireland from Bulldog and terrier ancestry for hunting, specifically for capturing and restraining semi-feral livestock. ", )

            }

        }
        //End of Row

        Spacer(modifier = Modifier.height(5.dp))


        //Row3
        Row{

            Image(painter = painterResource(id = R.drawable.gs),
                contentDescription = "Pitbull",
                modifier = Modifier.size(width = 250.dp, height = 100.dp))

            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(text = "German Shepherd", fontWeight = FontWeight.Bold)
                Text(text = "Old German herding dogs (German: altdeutsche Hütehunde), including old German sheep dogs or old German shepherd dogs (altdeutsche Schäferhunde) are a group of traditional types of working, herding dogs from Germany. ", )

            }

        }
        //End of Row

        Spacer(modifier = Modifier.height(5.dp))


        Button(onClick = { mContext.startActivity(Intent(mContext,IntentActivity::class.java))}, shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier
                .fillMaxWidth()
                ) {
            Text(text = "Continue")
        }





    }

}

@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}