package nct_deck.shared.pdf.usecase.di

import nct_deck.shared.pdf.usecase.PdfUseCaseImpl
import nct_deck.shared.pdf.usecase.PdfUseCase
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val pdfUseCaseModule = module {
    singleOf(::PdfUseCaseImpl) bind PdfUseCase::class
}