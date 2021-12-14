package com.cvelez.cachealpha.cache.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cvelez.cachealpha.cache.domain.model.CoreAccessToken
import java.lang.Exception


@Database(
    entities = [CoreAccessToken::class],
    version = 1
)
abstract class CacheDatabase : RoomDatabase() {
    abstract fun cacheDao(): CoreCacheDao

    companion object {
        const val DATABASE_NAME = "cache_db_core"
    }
}

class InvalidCacheException(message: String) : Exception(message)
