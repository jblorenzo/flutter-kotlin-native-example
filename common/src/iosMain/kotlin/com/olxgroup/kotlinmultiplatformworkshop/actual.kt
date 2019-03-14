package com.olxgroup.kotlinmultiplatformworkshop

import platform.UIKit.UIDevice
import platform.darwin.*

actual fun platformName(): String {
    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}
