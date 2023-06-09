package com.example.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVariable = findViewById<WebView>(R.id.webView)
        webViewSetUp(webViewVariable)
    }
    @SuppressLint("NewApi")
    private fun webViewSetUp(webView: WebView)
    {
        webView.webViewClient= WebViewClient()
        webView.apply {
            settings.javaScriptEnabled =true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.youtube.com/")
        }
    }


}