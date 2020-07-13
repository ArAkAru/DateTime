package com.arko

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.regex.Matcher
import java.util.regex.Pattern

fun timeFormater(cityTime: OffsetDateTime):String= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(cityTime)

fun isValidTime(param:String?):Int{
    var count=""
    if(param?.let { Regex("/UTC(\\-{1}|\\+{1})\\d{1,2}").find(it) }!=null){
        var matcher: Matcher = Pattern.compile("(\\-{1}|\\+{1})\\d{1,2}").matcher(param)
        matcher.find();
         count = matcher.group()
    }
    return count.toInt()
}



