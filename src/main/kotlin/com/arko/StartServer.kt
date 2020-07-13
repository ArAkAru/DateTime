package com.arko

import com.arko.config.Configuration
import org.eclipse.jetty.server.Server
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext


fun main(args: Array<String>) {
    var context: ApplicationContext = AnnotationConfigApplicationContext(Configuration::class.java)
    var serverJetty: Server = context.getBean(Server::class.java)
    serverJetty.start()
    serverJetty.join()

}


