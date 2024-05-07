package com.example

import com.lustyflix.streamverse.plugins.StreamversePlugin
import com.lustyflix.streamverse.plugins.Plugin
import com.lustyflix.streamverse.APIHolder
import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

@StreamversePlugin
class TestPlugin: Plugin() {
    var activity: AppCompatActivity? = null

    override fun load(context: Context) {
        activity = context as AppCompatActivity
        // All providers should be added in this manner
        registerMainAPI(ExampleProvider(this))

        openSettings = { ctx ->
            val frag = BlankFragment(this)
            frag.show(activity!!.supportFragmentManager, "Frag")
        }
    }
}