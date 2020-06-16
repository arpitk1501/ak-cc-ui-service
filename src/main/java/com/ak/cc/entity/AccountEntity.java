package com.ak.cc.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table("account")
public class AccountEntity  implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryKeyColumn(value = "le_id",ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column
    private String leId;

    @PrimaryKeyColumn(value = "account_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @Column
    private String accountId;

    @Column("account_name")
    private String accountName;

    @Column("account_type")
    private String accountType;

    @Column("created_by")
    private String createdBy;

    @Column("created_ts")
    private LocalDateTime createdTs;

}
