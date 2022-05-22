package com.dove.chromebookmanagementsystem.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Chromebook {

    private String serialNumber;

    private String funding;

    private String status;

    private String assignedTo;
    
    
}
