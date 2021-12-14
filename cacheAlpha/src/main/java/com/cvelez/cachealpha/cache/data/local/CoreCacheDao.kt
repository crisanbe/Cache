package com.cvelez.cachealpha.cache.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cvelez.cachealpha.cache.domain.model.CoreAccessToken

@Dao
interface CoreCacheDao {

    @Query("SELECT * FROM CoreAccessToken WHERE id = :id")
    suspend fun getAccessToken(id: String): CoreAccessToken?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveAccessToken(token: CoreAccessToken)
}