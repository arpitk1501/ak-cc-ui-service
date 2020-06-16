package com.ak.cc.dao;

import com.ak.cc.entity.LegalEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegalEntityRepository extends CassandraRepository<LegalEntity, String> {
}
