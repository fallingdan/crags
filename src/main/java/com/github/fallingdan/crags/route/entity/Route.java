package com.github.fallingdan.crags.route.entity;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ROUTE")
public class Route {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "NAME")
    private String name;

    @Column(name = "AREA_ID")
    private UUID areaId;

    @Column(name = "HEIGHT")
    private Integer height;

    @Column(name = "NUM_BOLTS")
    private Integer numBolts;

    @UpdateTimestamp
    @Column(name = "UPDATED_DATE")
    private Instant updatedDate;

    @CreationTimestamp
    @Column(name = "CREATED_DATE")
    private Instant createdDate;
}
