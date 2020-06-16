package com.ak.cc.dao;

import com.ak.cc.entity.PositionEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends CassandraRepository<PositionEntity, String> {
}
