package com.lab.service;

import com.lab.model.LabType;

import java.util.List;

/**
 * Created by Devni-PC on 6/30/2017.
 */
public interface LabTypeService {
    public LabType CreateLabType(LabType labType);
    public List<LabType> listLabTypes();
}
