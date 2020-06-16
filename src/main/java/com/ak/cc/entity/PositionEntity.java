package com.ak.cc.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table("position")
public class PositionEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryKeyColumn(value = "account_id",ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column
    private String accountId;

    @PrimaryKeyColumn(value = "asset_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @Column
    private String assetId;

    @Column("quantity")
    private BigDecimal quantity;

}
