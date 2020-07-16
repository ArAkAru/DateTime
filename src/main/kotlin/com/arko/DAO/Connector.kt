package com.arko.DAO

import java.io.FileInputStream
import java.sql.Connection
import java.sql.DriverManager
import java.util.*

val prop: Properties = Properties()

fun getConnection(): Connection {

    val prop: Properties = Properties()
    prop.load(FileInputStream("database.properties"))
    return DriverManager.getConnection(
        prop.getProperty("db.url"),
        prop.getProperty("db.user"),
        prop.getProperty("db.password")
    )

}

