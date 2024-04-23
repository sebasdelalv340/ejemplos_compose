import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
fun Ejercicio04() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter

    ){
        Row(
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier =
                Modifier.border(BorderStroke(2.dp, Color.Red))
                    .height(200.dp)
                    .width(100.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Text(
                    text = "Box 1"
                )
            }
            Box(
                modifier =
                Modifier.border(BorderStroke(2.dp, Color.Blue))
                    .height(150.dp)
                    .width(100.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Text(
                    text = "Box 2"
                )
            }
            Box(
                modifier =
                Modifier.border(BorderStroke(2.dp, Color.Red))
                    .height(100.dp)
                    .width(100.dp),
                contentAlignment = Alignment.TopCenter
            ){
                Text(
                    text = "Box 3"
                )
            }
            Box(
                modifier =
                Modifier.border(BorderStroke(2.dp, Color.Blue))
                    .height(50.dp)
                    .width(100.dp),
                contentAlignment = Alignment.TopCenter
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
        Ejercicio04()
    }
}
