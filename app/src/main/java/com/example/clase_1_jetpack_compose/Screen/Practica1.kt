/*import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clase_1_jetpack_compose.R

@Composable
fun Main () {
    Box(modifier = Modifier.fillMaxSize()){
        Content()
    }
}
@Composable
fun Content(){
    Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.SpaceEvenly){
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Image_1()
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Texto();
        }

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Image_1(R.drawable.ic_ola);
        }
    }
}

@Composable
fun Fila(Info: Unit){

}

@Composable
fun Image_1(data: Int = R.drawable.ic_deku) {
    Image(painter = painterResource(id = data), contentDescription = null)
}

@Composable
fun Texto() {
    Text(text = "chochona")
}



@Preview ( name = "Practica_1",showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    Main()
}

*/

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_1_jetpack_compose.R
import org.w3c.dom.Text

@Composable
fun Main () {
    Box(modifier = Modifier.fillMaxSize()){
        Content()
    }
}
@Composable
fun Content() {
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement =
    Arrangement.SpaceAround) {
        Filas(img = R.drawable.ic_ola, Descript = "###" )
        Text(
            text = "Huele a otaku",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )
        Button(onClick = { /*TODO*/ },) {

            Text(text = "Bañar",  fontSize = 25.sp)
        }
        Filas(img = R.drawable.ic_deku, Descript = "###" )


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

@Preview ( name = "Practica_1",showSystemUi = true,
    device = Devices.DEFAULT)
@Composable
fun PreviewMain() {
    Main()
}