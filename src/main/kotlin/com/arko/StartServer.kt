package com.arko

import com.arko.DAO.TimeDAO
import com.arko.config.Configuration
import com.arko.utils.timeFormater
import org.eclipse.jetty.server.Server
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement
import java.time.OffsetDateTime
import java.time.ZoneOffset


fun main(args: Array<String>) {

    var context: ApplicationContext = AnnotationConfigApplicationContext(Configuration::class.java)
    var serverJetty: Server = context.getBean(Server::class.java)
    serverJetty.start()
    serverJetty.join()

}


