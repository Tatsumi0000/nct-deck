package nctDeck.shared.pdf.repository

interface PdfRepository {
    fun sayHello(): String
}

class PdfRepositoryImpl : PdfRepository {
    override fun sayHello(): String = "Hello from PdfRepositoryImpl"
}
