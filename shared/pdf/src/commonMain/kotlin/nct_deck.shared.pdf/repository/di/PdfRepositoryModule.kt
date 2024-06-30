package nct_deck.shared.pdf.repository.di

import nct_deck.shared.pdf.repository.PdfRepository
import nct_deck.shared.pdf.repository.PdfRepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val pdfRepositoryModule = module {
    singleOf(::PdfRepositoryImpl) bind PdfRepository::class
}