package com.cvelez.cachealpha.cache.data.repository

import com.cvelez.cachealpha.cache.domain.model.CoreAccessToken
import com.cvelez.cachealpha.cache.domain.repository.CoreCacheRepository
import com.cvelez.cachealpha.cache.data.local.CoreCacheDao

class CoreCacheRepositoryImpl(private val dao: CoreCacheDao) : CoreCacheRepository {
    override suspend fun getAccessToken(id: String): CoreAccessToken? {
        return dao.getAccessToken(id)
    }

    override suspend fun saveAccessToken(token: CoreAccessToken) {
        return dao.saveAccessToken(token)
    }
}