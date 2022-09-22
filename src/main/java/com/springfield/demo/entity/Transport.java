package com.springfield.demo.entity;

import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Getter
@Table(name = "springfield_transport")
public class Transport {

    @Id
    private Long partitionid;
    private String transType;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Timestamp cTime;
    private Timestamp createAt;

    public Transport() {

    }

    public Transport(Long partitionid, String transType, BigDecimal latitude, BigDecimal longitude, Timestamp cTime, Timestamp createAt) {
        this.partitionid = partitionid;
        this.transType = transType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cTime = cTime;
        this.createAt = createAt;
    }

    
}
