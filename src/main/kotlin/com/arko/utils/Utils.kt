package com.arko.utils

import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.regex.Matcher
import java.util.regex.Pattern

fun timeFormater(cityTime: OffsetDateTime): String = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm").format(cityTime)

fun isValidTime(param: String?): String {

    var count: String = "Incorrect UTC"
    if (param?.let { Regex("/UTC(\\-{1}|\\+{1})\\d{1,2}").matchEntire(it) } != null) {
        var matcher: Matcher = Pattern.compile("(\\-{1}|\\+{1})\\d{1,2}").matcher(param)
        matcher.find();
        count = matcher.group()

    }
    return count
}



