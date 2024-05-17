package com.example.clase_1_jetpack_compose.Duplicado

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_1_jetpack_compose.R





@Composable
fun Main() {
    Box(modifier = Modifier.fillMaxSize()){
        Contenido()
    }
}

@Composable
fun Contenido() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Filas(img = R.drawable.lc_icono, Descript = "###")
        Text(
            text = "Bienvenido a la APP de citas",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
        )

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),colors= ButtonDefaults.buttonColors(
                        Color.Yellow))
            
            {
                Text(text = "Verifique su Correo", fontSize = 25.sp, color= Color.Black)
            }
            
             Column(modifier = Modifier){
                 Text(text = "Crear cuenta",
                 modifier = Modifier.fillMaxWidth(),
                  textAlign = TextAlign.Center,
                     fontSize = 20.sp
                     )
             }

                }

            }

            
        




@Composable
fun Filas(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img),
          contentDescription = Descript,
            modifier = imgmodifier
                .width(400.dp)
                .height(400.dp))

    }
}

@Preview ( name = "Actividad", showSystemUi = true,
    device = Devices.DEFAULT)
@Composable
fun PreviewMain(){
    Main()
}
