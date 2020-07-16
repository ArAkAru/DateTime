package com.arko.servlets


import com.arko.DAO.TimeDAO
import org.springframework.stereotype.Component

import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
open class InfoServlet : HttpServlet() {
    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {
        response.status = HttpServletResponse.SC_OK;
        response.contentType = "text/html";
        response.characterEncoding = "utf-8";
        var param: String? = request?.pathInfo
        response.writer?.println("<h1>TimeZone with ID:${request.getParameter("id")} ${TimeDAO().getTimeZoneByGroup(request.getParameter("id"))}</h1>");
    }
}
