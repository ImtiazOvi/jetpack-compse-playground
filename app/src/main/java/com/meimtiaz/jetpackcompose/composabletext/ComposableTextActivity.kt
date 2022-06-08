package com.meimtiaz.jetpackcompose.composabletext

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.meimtiaz.jetpackcompose.R

class ComposableTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Title()
        }
    }
}

@Composable
fun Title(){
    val context = LocalContext.current
    Text(
        text = "How are you today ?",
        fontSize = 32.sp,
        fontFamily = FontFamily.Cursive,
        color = colorResource(id = R.color.purple_200),
        modifier = Modifier.clickable {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }
    )
}

@Preview
@Composable
fun DefaultPreview(){
//    Surface(Modifier.fillMaxSize()) {
//        Title()
//    }
    Title()
}
