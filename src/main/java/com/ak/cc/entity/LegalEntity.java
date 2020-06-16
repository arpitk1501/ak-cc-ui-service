package com.ak.cc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table("legal_entity")
public class LegalEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column
    @PrimaryKey("le_id")
    private String leId;

    @Column("le_name")
    private String leName;

    @Column("le_type")
    private String leType;

    @Column("created_by")
    private String createdBy;

    @Column("created_ts")
    private LocalDateTime createdTs;

}
