package com.olxgroup.kotlinmultiplatformworkshop

expect fun platformName(): String

fun printOnConsole() : String {
  return "Hello World on ${platformName()}"
}