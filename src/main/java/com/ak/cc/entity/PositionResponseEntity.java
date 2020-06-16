package com.ak.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table("position_calc")
public class PositionResponseEntity {

    @PrimaryKeyColumn(value = "account_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
    @Column
    private String accountId;

    @Column("account_name")
    private String accountName;

    @Column("account_type")
    private String accountType;

    @PrimaryKeyColumn(value = "le_id",ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    @Column
    private String leId;

    @Column("le_name")
    private String leName;

    @Column("le_type")
    private String leType;

    @PrimaryKeyColumn(value = "asset_id", ordinal = 3, type = PrimaryKeyType.CLUSTERED)
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

    @Column("quantity")
    private BigDecimal quantity;

    @Column("market_value")
    private BigDecimal marketValue;

}
