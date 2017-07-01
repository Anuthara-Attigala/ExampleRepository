package com.lab.controller;

import com.lab.model.LabType;
import com.lab.service.LabTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Devni-PC on 6/30/2017.
 */
@RestController
public class LabTypeController {
    @Autowired
    LabTypeService labTypeService;

    @CrossOrigin
    @RequestMapping(value="/labtypes",method = RequestMethod.GET, produces="application/json")
    public List<LabType> getLabTypes(){
        return labTypeService.listLabTypes();
    }
    @CrossOrigin
    @RequestMapping(value="/labtypes", method = RequestMethod.POST, consumes = "application/json")
        public LabType CreateLabType(@Validated @RequestBody LabType labType){
            return labTypeService.CreateLabType(labType);
        }

}
