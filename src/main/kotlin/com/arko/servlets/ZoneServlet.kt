package com.arko.servlets

import com.arko.utils.isValidTime
import com.arko.utils.timeFormater
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

        val num:Int? = try {
            val c=isValidTime(param).toInt()
            if(c !in -15..15){
                throw NumberFormatException()
            }else c

        }catch (e: NumberFormatException){null}
        num?.let {response?.writer?.println(
                "<h1>${timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(num)))}</h1>")
        }?: response?.writer?.println("<h1>Incorrect UTC</h1>")

    }
}