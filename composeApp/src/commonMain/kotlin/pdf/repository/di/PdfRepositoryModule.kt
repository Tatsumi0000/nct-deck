package pdf.repository.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import pdf.repository.PdfRepository
import pdf.repository.PdfRepositoryImpl

val pdfRepositoryModule = module {
    singleOf(::PdfRepositoryImpl) bind PdfRepository::class
}