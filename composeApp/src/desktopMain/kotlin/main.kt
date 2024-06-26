import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import love.aespa.nct_deck.shared.pdf.Hoge

fun main() = application {
    val a = Hoge()
    a.fuga()
    Window(
        onCloseRequest = ::exitApplication,
        title = "nct-deck",
    ) {
        App()
    }
}