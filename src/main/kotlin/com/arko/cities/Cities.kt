package com.arko.cities

import java.time.*


enum class Cities(val time: OffsetDateTime) {
    MOSCOW(OffsetDateTime.now(ZoneOffset.ofHours(3))),
    LONDON(OffsetDateTime.now(ZoneOffset.ofHours(1))),
    SYDNEY(OffsetDateTime.now(ZoneOffset.ofHours(10))),
    NEW_YORK(OffsetDateTime.now(ZoneOffset.ofHours(-4))),
    CALIFORNIA(OffsetDateTime.now(ZoneOffset.ofHours(-7))),
    VLADIVOSTOK(OffsetDateTime.now(ZoneOffset.ofHours(10))),
    TOKYO(OffsetDateTime.now(ZoneOffset.ofHours(9)))

}


