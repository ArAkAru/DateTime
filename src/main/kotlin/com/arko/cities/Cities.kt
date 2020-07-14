package com.arko.cities

import com.arko.utils.timeFormater
import java.time.*


enum class Cities(var time: String) {
    MOSCOW(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(3)))),
    LONDON(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(1)))),
    SYDNEY(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(10)))),
    NEW_YORK(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(-4)))),
    CALIFORNIA(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(-7)))),
    VLADIVOSTOK(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(10)))),
    TOKYO(timeFormater(OffsetDateTime.now(ZoneOffset.ofHours(9))))

}


