package com.ak.cc.dao;

import com.ak.cc.entity.AccountEntity;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CassandraRepository<AccountEntity, String> {
}
