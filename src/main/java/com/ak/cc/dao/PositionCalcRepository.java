package com.ak.cc.dao;

import com.ak.cc.entity.PositionResponseEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PositionCalcRepository extends CassandraRepository<PositionResponseEntity, String> {

    List<PositionResponseEntity> findByLeId(String leId);

}

