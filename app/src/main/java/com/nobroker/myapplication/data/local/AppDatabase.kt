package com.nobroker.myapplication.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [], version = 3)
//@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {


}