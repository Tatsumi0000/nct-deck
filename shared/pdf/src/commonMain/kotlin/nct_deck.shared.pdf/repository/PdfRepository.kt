package nct_deck.shared.pdf.repository

interface PdfRepository {
    fun sayHello(): String
}

class PdfRepositoryImpl: PdfRepository {
    override fun sayHello(): String {
        return "Hello from PdfRepositoryImpl"
    }
}