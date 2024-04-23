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
fun Ejercicio03() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center

    ){
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            Box(
                modifier =
                Modifier.background(Color.Red)
                    .height(100.dp)
            ){
                Text(
                    text = "Box 1"
                )
            }
            Box(
                modifier =
                Modifier.background(Color.Gray)
                    .height(200.dp)
            ){
                Text(
                    text = "Box 2"
                )
            }
            Box(
                modifier =
                Modifier.background(Color.Cyan)
                    .height(200.dp)
            ){
                Text(
                    text = "Box 3"
                )
            }
            Box(
                modifier =
                Modifier.background(Color.Green)
                    .height(100.dp)
            ){
                Text(
                    text = "Box 4"
                )
            }
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
        Ejercicio03()
    }
}