package com.lab.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Devni-PC on 6/30/2017.
 */
public class LabType {
    @Id
    private String id;

    private String laboratoryTypeName;

    public String getId() {
        return id;
    }

    public String getLaboratoryTypeName() {
        return laboratoryTypeName;
    }

    public void setLaboratoryTypeName(String laboratoryTypeName) {
        this.laboratoryTypeName = laboratoryTypeName;
    }

    public void setId(String id) {
        this.id = id;
    }
}
