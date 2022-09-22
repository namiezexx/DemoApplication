package com.springfield.demo.entity;

import lombok.Getter;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Getter

public class Transport {

    @Id
    private Long partitionId;
    private String transType;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Timestamp cTime;
    private Timestamp createAt;

    public Transport() {

    }

    public Transport(Long partitionId, String transType, BigDecimal latitude, BigDecimal longitude, Timestamp cTime, Timestamp createAt) {
        this.partitionId = partitionId;
        this.transType = transType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cTime = cTime;
        this.createAt = createAt;
    }

    
}
