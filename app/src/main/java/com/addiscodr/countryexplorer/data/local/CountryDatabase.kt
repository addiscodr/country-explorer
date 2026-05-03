package com.addiscodr.countryexplorer.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.addiscodr.countryexplorer.data.model.CountryEntity

@Database(
    entities = [CountryEntity::class],
    version = 1
)
abstract class CountryDatabase: RoomDatabase() {
    abstract fun countryDao(): CountryDao
}