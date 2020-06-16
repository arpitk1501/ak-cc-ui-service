package com.ak.cc.dao;

import com.ak.cc.entity.AssetCompositeEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetCompositeRepository extends CassandraRepository<AssetCompositeEntity, String> {
}
