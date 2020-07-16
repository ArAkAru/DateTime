package com.arko.servlets

import com.arko.cities.Cities
import com.arko.config.getTemplate
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
open class UtcServlet : HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        response.status = HttpServletResponse.SC_OK;
        response.contentType = "text/html";
        response.characterEncoding = "utf-8";
        val data= mapOf<String,Any?>()
       getTemplate("src/main/webapp/utc.ftl").process(data, response.getWriter())

    }
}