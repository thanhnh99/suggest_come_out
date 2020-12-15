package com.k62j.uet.suggest_come_out.models.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity {
    @Id
    private String id = UUID.randomUUID().toString();
    private Date createdAt = new Date();
    private String createdBy;
    private Date updatedAt = new Date();
    private String updatedBy;
    private Boolean isActive = true;
}