package com.arko.servlets

import com.arko.cities.Cities
import com.arko.utils.timeFormater
import freemarker.template.Configuration
import freemarker.template.Template
import org.eclipse.jetty.util.Loader.getResource
import org.springframework.stereotype.Component
import java.io.Writer
import java.time.OffsetDateTime
import java.time.ZoneOffset
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
open class TimeServlet : HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        val cfg: Configuration = Configuration()
        val temp: Template =cfg.getTemplate("src/main/webapp/cities.ftl")
        var AM=request.getParameter("am")?.toBoolean()?:false
        val writer: Writer =response.getWriter()
        response.status = HttpServletResponse.SC_OK;
        response.contentType = "text/html";
        response.characterEncoding = "utf-8";
        val data= mapOf<String,Any?>("cities" to Cities.values(),"AM" to AM)
        temp.process(data,writer)
    }
}
