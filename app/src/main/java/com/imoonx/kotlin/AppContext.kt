package com.imoonx.kotlin

import com.imoonx.util.BaseApplication
import com.imoonx.util.XLog

/**
 * Created by 36238 on 2019/10/25 星期五
 */
class AppContext : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        XLog.setIsPrint(BuildConfig.DEBUG)
    }

}