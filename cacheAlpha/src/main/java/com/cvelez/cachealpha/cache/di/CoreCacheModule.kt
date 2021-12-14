package com.cvelez.cachealpha.cache.di

import android.app.Application
import androidx.room.Room
import com.cvelez.cachealpha.cache.data.local.CoreCacheDao
import com.cvelez.cachealpha.cache.data.local.CacheDatabase
import com.cvelez.cachealpha.cache.data.repository.CoreCacheRepositoryImpl
import com.cvelez.cachealpha.cache.domain.repository.CoreCacheRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CoreCacheModule {

    @Provides
    @Singleton
    fun provideCacheDatabase(app: Application) : CacheDatabase {
        return Room.databaseBuilder(app, CacheDatabase::class.java, CacheDatabase.DATABASE_NAME).build()
    }

    @Provides
    @Named("db_dao_core")
    fun provideCacheDao(db: CacheDatabase): CoreCacheDao {
        return db.cacheDao()
    }

    @Provides
    @Singleton
    fun provideCacheRepository(db: CacheDatabase): CoreCacheRepository {
        return CoreCacheRepositoryImpl(db.cacheDao())
    }
}