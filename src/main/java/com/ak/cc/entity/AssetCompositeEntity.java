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
@Table("asset_composite")
public class AssetCompositeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @PrimaryKeyColumn(value = "asset_id",ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column
    private String assetId;

    @Column("asset_name")
    private String assetName;

    @Column("country_code")
    private String countryCode;

    @Column("currency_code")
    private String currencyCode;

    @Column("market_code")
    private String marketCode;

    @Column("price")
    private BigDecimal price;

}
