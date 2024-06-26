import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import love.aespa.nct_deck.shared.pdf

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val a = Hoge()
    a.fuga()
    ComposeViewport(document.body!!) {
        App()
    }
}