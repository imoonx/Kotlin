package com.imoonx.kotlin

import com.imoonx.util.BaseApplication
import com.imoonx.util.TDevice
import com.imoonx.util.XLog

/**
 * Created by 36238 on 2019/10/25 星期五
 */
class AppContext : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        XLog.setIsPrint(BuildConfig.DEBUG)
//        val log4jConfig = Log4jConfig()
//        log4jConfig.appName = "Kotlin"
//        log4jConfig.rootLevel = Level.ERROR
//        log4jConfig.configure()
        XLog.e(AppContext::class.java, "应用当前版本：" + TDevice.getVersionName())
    }
}