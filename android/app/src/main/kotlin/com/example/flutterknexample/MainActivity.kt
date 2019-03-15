package com.example.flutterknexample

import android.os.Bundle

import io.flutter.app.FlutterActivity
import io.flutter.plugins.GeneratedPluginRegistrant
import io.flutter.plugin.common.MethodChannel
import io.flutter.plugin.common.MethodChannel.Result
import io.flutter.plugin.common.MethodCall

import com.olxgroup.kotlinmultiplatformworkshop.*

class MainActivity : FlutterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GeneratedPluginRegistrant.registerWith(this)

        var channel = MethodChannel(flutterView, "/api")
        channel.setMethodCallHandler { methodCall, result ->
            processMethodChannel(methodCall.method ?: "",
                    methodCall.arguments ?: emptyList<String>(),
                    { s -> result.success(s) },
                    { e, e1, e2 -> result.error(e, e1, e2) }
            )}
    }
}
