package nctDeck.shared.pdf.repository.di

import nctDeck.shared.pdf.repository.PdfRepository
import nctDeck.shared.pdf.repository.PdfRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val pdfRepositoryModule = module {
    singleOf(::PdfRepositoryImpl) bind PdfRepository::class
}