package com.arko.config

import com.arko.servlets.InfoServlet
import com.arko.servlets.TimeServlet
import com.arko.servlets.UtcServlet
import com.arko.servlets.ZoneServlet
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.ServletHandler
import org.eclipse.jetty.servlet.ServletHolder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.arko")
open class Configuration {
    @Autowired
    lateinit var timeServlet: TimeServlet

    @Autowired
    lateinit var zoneServlet: ZoneServlet

    @Autowired
    lateinit var infoServlet: InfoServlet

    @Autowired
    lateinit var utcServlet: UtcServlet

    @Bean
    open fun server(): Server {
        var server: Server = Server(9876)
        server.handler = servletHandler()
        return server
    }

    @Bean
    open fun servletHandler(): ServletHandler {
        val servletHandler: ServletHandler = ServletHandler()
        servletHandler.addServletWithMapping(ServletHolder(timeServlet), "/times")
        servletHandler.addServletWithMapping(ServletHolder(zoneServlet), "/times/*")
        servletHandler.addServletWithMapping(ServletHolder(infoServlet), "/times/info/")
        servletHandler.addServletWithMapping(ServletHolder(utcServlet), "/times/group")
        return servletHandler
    }
}