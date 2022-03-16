package com.Vrindhawan.vrindhawanRegistrationService.repository;

import com.Vrindhawan.vrindhawanRegistrationService.model.Student;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>
{

}
