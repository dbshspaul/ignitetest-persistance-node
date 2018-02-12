package com.igniteCacheEvtTracker;

import com.model.Account1;
import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.QueryEntity;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.DataStorageConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;
import org.apache.ignite.transactions.Transaction;

import javax.cache.Cache;
import javax.cache.configuration.FactoryBuilder;
import java.util.Arrays;
import java.util.UUID;

/**
 * Created by debasish paul on 08-11-2017.
 */
public class Main {
    private static final Long id = Math.abs(UUID.randomUUID().getLeastSignificantBits());

    public static void main(String[] args) {
        Ignition.setClientMode(true);
        IgniteConfiguration igniteConfiguration = new IgniteConfiguration();

        DataStorageConfiguration storageCfg = new DataStorageConfiguration();
        storageCfg.getDefaultDataRegionConfiguration().setPersistenceEnabled(true);
        igniteConfiguration.setDataStorageConfiguration(storageCfg);

        TcpDiscoverySpi tcpDiscoverySpi = new TcpDiscoverySpi();
        TcpDiscoveryMulticastIpFinder ipFinder = new TcpDiscoveryMulticastIpFinder();
        ipFinder.setAddresses(Arrays.asList("127.0.0.1:47500..47502"));
        tcpDiscoverySpi.setIpFinder(ipFinder);
        igniteConfiguration.setDiscoverySpi(tcpDiscoverySpi);

        Ignite ignite = Ignition.start(igniteConfiguration);
        ignite.active(true);


        CacheConfiguration cfg = new CacheConfiguration();
        cfg.setName("myCache");
        cfg.setReadThrough(true);
        cfg.setWriteThrough(true);
        cfg.setCacheMode(CacheMode.PARTITIONED);
        QueryEntity entity = new QueryEntity();
        entity.setKeyType(String.class.getName());
        entity.setKeyType(Account1.class.getName());
        cfg.setCacheStoreFactory(FactoryBuilder.factoryOf(CacheStore.class));
        IgniteCache<String, Account1> cache = ignite.getOrCreateCache(cfg);

        cache.clear();
        cache.loadCache(null);
        System.out.println("<<<<<<<<<<<<<<<all done");
    }

}
