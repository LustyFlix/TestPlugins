package com.example

import androidx.appcompat.app.AppCompatActivity
import com.lustyflix.streamverse.TvType
import com.lustyflix.streamverse.MainAPI
import com.lustyflix.streamverse.SearchResponse

class ExampleProvider(val plugin: TestPlugin) : MainAPI() { // all providers must be an intstance of MainAPI
    override var mainUrl = "https://example.com/" 
    override var name = "Example provider"
    override val supportedTypes = setOf(TvType.Movie)

    override var lang = "en"

    // enable this when your provider has a main page
    override val hasMainPage = true

    // this function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf<SearchResponse>()
    }
}