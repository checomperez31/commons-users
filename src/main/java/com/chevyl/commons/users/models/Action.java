package com.chevyl.commons.users.models;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="actions")
public class Action {
    
    @GeneratedValue(generator="uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Id
    private String id;

    private String description;

    private String status = "A";

    @CreatedDate
    @Column(name="insert_date")
    private ZonedDateTime insertDate;
    
    @LastModifiedDate
    @Column(name="update_date")
    private ZonedDateTime updateDate;
    
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInsertDate(ZonedDateTime insertDate) {
        this.insertDate = insertDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ZonedDateTime getInsertDate() {
        return insertDate;
    }

    public ZonedDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(ZonedDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
