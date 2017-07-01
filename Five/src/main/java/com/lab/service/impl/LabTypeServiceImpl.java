package com.lab.service.impl;

import com.lab.model.LabType;
import com.lab.repository.LabTypeRepository;
import com.lab.service.LabTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by Devni-PC on 6/30/2017.
 */
@Service
public class LabTypeServiceImpl implements LabTypeService {
    @Autowired
    LabTypeRepository labTypeRepository;
    @Override
    public LabType CreateLabType(LabType labType){
        labType.setId(UUID.randomUUID().toString());
        return labTypeRepository.save(labType);
    }
    @Override
    public List<LabType> listLabTypes(){
        return labTypeRepository.findAll();
    }

}
