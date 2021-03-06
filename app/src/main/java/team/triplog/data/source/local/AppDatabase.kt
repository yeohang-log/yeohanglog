package team.triplog.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import team.triplog.data.source.local.AppDatabase.Companion.DB_VERSION
import team.triplog.data.source.local.dao.TripDao
import team.triplog.data.source.local.dao.TripLogDao
import team.triplog.data.source.local.dao.UserDao
import team.triplog.data.source.local.entity.Trip
import team.triplog.data.source.local.entity.TripLog
import team.triplog.data.source.local.entity.User

@Database(
    entities = [
        User::class,
        Trip::class,
        TripLog::class
    ],
    version = DB_VERSION
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun tripDao(): TripDao
    abstract fun tripLogDao(): TripLogDao

    companion object {
        const val DB_NAME = "yeohanglog"
        const val DB_VERSION = 1
    }
}