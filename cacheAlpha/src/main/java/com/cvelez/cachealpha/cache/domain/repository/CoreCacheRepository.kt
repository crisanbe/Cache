package com.cvelez.cachealpha.cache.domain.repository

import com.cvelez.cachealpha.cache.domain.model.CoreAccessToken

interface CoreCacheRepository {
    suspend fun getAccessToken(id: String): CoreAccessToken?
    suspend fun saveAccessToken(token: CoreAccessToken)
}