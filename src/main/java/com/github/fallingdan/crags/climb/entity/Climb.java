package com.github.fallingdan.crags.climb.entity;

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
@Table(name = "CLIMB")
public class Climb {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "ROUTE_ID")
    private UUID routeId;

    @Column(name = "BLACK_POINT")
    private boolean blackPoint;

    @Column(name = "RED_POINT")
    private boolean redPoint;

    @Column(name = "FLASH")
    private boolean flash;

    @Column(name = "ON_SIGHT")
    private boolean onSight;

    @Column(name = "NOTES")
    private String notes;

    @Column(name = "BLACK_POINT_DATE")
    private Instant blackPointDate;

    @Column(name = "RED_POINT_DATE")
    private Instant redPointDate;

    @Column(name = "FLASH_DATE")
    private Instant flashDate;

    @Column(name = "ON_SIGHT_DATE")
    private Instant onSightDate;

    @UpdateTimestamp
    @Column(name = "UPDATED_DATE")
    private Instant updatedDate;

    @CreationTimestamp
    @Column(name = "CREATED_DATE")
    private Instant createdDate;
}
