package com.Vrindhawan.vrindhawanRegistrationService.service.implementation;

import com.Vrindhawan.vrindhawanRegistrationService.model.Student;
import com.Vrindhawan.vrindhawanRegistrationService.repository.StudentRepository;
import com.Vrindhawan.vrindhawanRegistrationService.service.interfaces.IStudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.util.Objects;
import java.util.Optional;

public class StudentRegistration implements IStudentRegistration {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student createStudent(Student student) {
        if(isAlreadyExist(student.getMobileNo())){
            return null;
        }
        student.setErpId(student.getMobileNo());
        //return studentRepository.save(student);

        if(isAdharAlreadyExist(student.getAdharId())){
            return null;
        }
        student.setErpId(student.getAdharId());
        return studentRepository.save(student);
    }

    private boolean isAlreadyExist (String mobileNo){
        Optional <Student> existingStudent = studentRepository.findById(mobileNo);
        return Objects.isNull(existingStudent);
    }

    private boolean isAdharAlreadyExist(String adharNo){
        Optional<Student> existingStudent =studentRepository.findById(adharNo);
        return Objects.isNull(existingStudent);
    }
}
