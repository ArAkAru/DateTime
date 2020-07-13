package com.arko.servlets

import com.arko.cities.Cities
import com.arko.utils.timeFormater
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
open class TimeServlet : HttpServlet() {
    override fun doGet(request: HttpServletRequest?, response: HttpServletResponse?) {
        response?.status = HttpServletResponse.SC_OK;
        response?.contentType = "text/html";
        response?.characterEncoding = "utf-8";
        response?.writer?.println("<h1>City And Date</h1>");
        response?.writer?.println("<h1>")
        for (city in Cities.values()) {
            response?.writer?.println("${city.name} ${timeFormater(city.time)} <br>")
        }
        response?.writer?.println("</h1>")
    }
}
