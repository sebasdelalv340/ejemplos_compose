import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
fun Ejercicio02() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Box(
            modifier =
            Modifier.size(250.dp)
                .background(Color.Cyan)
                .wrapContentSize(Alignment.BottomCenter)
                .padding(bottom = 20.dp)
        ){
            Text(
                text = "Esto es un ejemplo del uso de box"
            )
        }
    }

}

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(1200.dp, 800.dp))

    Window(
        onCloseRequest = ::exitApplication,
        title = "MyBox",
        state = windowState
    ) {
        Ejercicio02()
    }
}