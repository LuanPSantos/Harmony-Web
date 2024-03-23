package com.luan.harmony

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.ApplicationPidFileWriter

@SpringBootApplication
class HarmonyApplication

fun main(args: Array<String>) {
    val app = SpringApplicationBuilder(HarmonyApplication::class.java)
    app.build().addListeners(ApplicationPidFileWriter("./shutdown.pid"))
    app.run(*args)
}
