package com.cvelez.cachealpha.cache.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CoreAccessToken(
    @PrimaryKey val id:String,
    val accessToken: String
)
