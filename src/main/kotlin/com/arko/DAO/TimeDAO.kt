package com.arko.DAO

import java.sql.*

class TimeDAO {


    fun getTimeZoneByGroup(group_id: String): Set<String> {
        var groups: MutableSet<String> = mutableSetOf()
        var statement: PreparedStatement = getConnection().prepareStatement("SELECT * FROM TIMEZONE WHERE GROUP_ID=?")
        statement.setString(1, group_id)
        var rs: ResultSet = statement.executeQuery()
        while (rs.next()) {
            groups.add(rs.getString(3))

        }
        return groups
    }

    fun save(group_id: String, timezone: String) {

        var statement: PreparedStatement =
            getConnection().prepareStatement("INSERT INTO TIMEZONE (group_id,timezone) VALUES (?,?)")
        statement.setString(1, group_id)
        statement.setString(2, timezone)
        statement.executeUpdate();

    }


}