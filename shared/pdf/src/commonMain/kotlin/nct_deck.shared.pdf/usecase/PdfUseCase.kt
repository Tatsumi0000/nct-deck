package nct_deck.shared.pdf.usecase

import nct_deck.shared.pdf.repository.PdfRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject


interface PdfUseCase {
    fun sayHello(): String
}

class PdfUseCaseImpl : PdfUseCase, KoinComponent {
    private val repository: PdfRepository by inject()
    override fun sayHello(): String {
        println("PdfUseCaseImpl: ${repository.sayHello()}")
        return "Hello from PdfUseCaseImpl"
    }
}
