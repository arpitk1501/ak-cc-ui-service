package com.ak.cc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages  = "com.ak.cc.dao")
@EntityScan("com.ak.cc.entity")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.contact-points:placeholder}")
    private String contactPoints;

    @Value("${spring.data.cassandra.port:0000}")
    private int port;

    @Value("${spring.data.cassandra.keyspace:placeholder}")
    private String keySpace;

    @Value("${spring.data.cassandra.schema-action}")
    private String schemaAction;


    @Override
    protected String getKeyspaceName() {
        return keySpace;
    }

    @Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster =
                new CassandraClusterFactoryBean();
        cluster.setContactPoints(contactPoints);
        cluster.setPort(port);
        cluster.setJmxReportingEnabled(false);
        return cluster;
    }

    @Bean
    public CassandraMappingContext cassandraMapping()
            throws ClassNotFoundException {
        return new BasicCassandraMappingContext();
    }
}
