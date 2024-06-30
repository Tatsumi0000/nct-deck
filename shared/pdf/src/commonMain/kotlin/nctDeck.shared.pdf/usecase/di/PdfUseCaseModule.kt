package nctDeck.shared.pdf.usecase.di

import nctDeck.shared.pdf.usecase.PdfUseCaseImpl
import nctDeck.shared.pdf.usecase.PdfUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val pdfUseCaseModule = module {
    singleOf(::PdfUseCaseImpl) bind PdfUseCase::class
}