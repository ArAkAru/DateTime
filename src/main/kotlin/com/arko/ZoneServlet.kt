package com.arko

import org.springframework.stereotype.Component
import java.time.OffsetDateTime
import java.time.ZoneOffset
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class ZoneServlet : HttpServlet() {
    override fun doGet(request: HttpServletRequest?, response: HttpServletResponse?) {
        response?.status = HttpServletResponse.SC_OK;
        response?.contentType = "text/html";
        response?.characterEncoding = "utf-8";
        var param: String? = request?.pathInfo
        response?.writer?.println("<h1>Time is :</h1>");
        response?.writer?.println("<h1>${timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(isValidTime(param))))} </h1>")
    }

}