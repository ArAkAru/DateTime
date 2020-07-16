package com.arko.config

import freemarker.template.Configuration
import freemarker.template.Template

fun getTemplate(page:String):Template {
    val cfg: Configuration = Configuration()
    return  cfg.getTemplate(page)
}