package com.igniteCacheEvtTracker;

import com.model.Account1;
import org.apache.ignite.cache.store.CacheStoreAdapter;
import org.apache.ignite.lang.IgniteBiInClosure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.cache.Cache;
import javax.cache.integration.CacheLoaderException;
import javax.cache.integration.CacheWriterException;

/**
 * Created by debasish paul on 08-11-2017.
 */
public class CacheStore extends CacheStoreAdapter<String, Account1> {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheStore.class);

    @Override
    public Account1 load(String s) throws CacheLoaderException {
        LOGGER.info("in load(String s) method");
        return null;
    }

    @Override
    public void write(Cache.Entry<? extends String, ? extends Account1> entry) throws CacheWriterException {
        LOGGER.info("in write(Cache method");

    }

    @Override
    public void delete(Object o) throws CacheWriterException {
        LOGGER.info("in delete(Object o) method");
    }

    @Override
    public void loadCache(IgniteBiInClosure<String, Account1> clo, Object... args) {
        LOGGER.info("in loadCache(IgniteBiInClosure<String, Account1> method");
    }
}
