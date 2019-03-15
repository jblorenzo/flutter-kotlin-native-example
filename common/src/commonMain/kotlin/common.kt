package com.olxgroup.kotlinmultiplatformworkshop

expect fun platformName(): String

fun printOnConsole() : String {
    return "Hello World on ${platformName()}"
}

fun processMethodChannel(method: String,
                         params: Any,
                         success: (Any) -> Unit,
                         error: (String?, String?, String?) -> Unit) {
    if (method == "platformName") {
        var name = platformName()
        success(name)
    } else {
        error("unknown method", "unknown method", "unknown method")
    }
}