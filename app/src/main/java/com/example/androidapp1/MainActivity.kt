package com.example.androidapp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidapp1.ui.theme.AndroidApp1Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidApp1Theme {
                        TopImage()
                        ArticleTitle(
                            Title = stringResource(R.string.Title),
                            FirstParagraph = stringResource(R.string.FirstParagraph),
                            SecondParagraph = stringResource(R.string.SecondParagraph)
                        )
                    }
                }
            }
        }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TopImage(modifier: Modifier = Modifier){
    Box(modifier) {
        val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null
        )
    }
}

@Composable
fun ArticleTitle(Title: String, FirstParagraph: String,
                 SecondParagraph: String,
                 modifier: Modifier = Modifier) {
        Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
            Text(
                text = Title,
                fontSize = 25.sp,
                lineHeight = 50.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 20.dp, top = 120.dp)
            )
            Text(
                text = FirstParagraph,
                fontSize = 20.sp,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
            )
            Text(
                text = SecondParagraph,
                fontSize = 20.sp,
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(start = 20.dp, top = 50.dp, end = 20.dp)
            )

        }
    }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AndroidApp1Theme {
        ArticleTitle(Title = stringResource(R.string.Title),
            FirstParagraph = stringResource(R.string.FirstParagraph),
            SecondParagraph = stringResource(R.string.SecondParagraph))
        TopImage()
    }
}