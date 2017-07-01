package com.lab.repository;

import com.lab.model.LabType;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Devni-PC on 6/30/2017.
 */
public interface LabTypeRepository extends MongoRepository<LabType,String> {
}
