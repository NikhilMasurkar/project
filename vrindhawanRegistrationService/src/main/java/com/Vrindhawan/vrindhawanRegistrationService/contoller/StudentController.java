package com.Vrindhawan.vrindhawanRegistrationService.contoller;

import com.Vrindhawan.vrindhawanRegistrationService.model.Student;
import com.Vrindhawan.vrindhawanRegistrationService.repository.StudentRepository;
import com.Vrindhawan.vrindhawanRegistrationService.service.interfaces.IStudentRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    private IStudentRegistration studentRegistration;
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student){
        return  studentRegistration.createStudent(student);
    }

//    @DeleteMapping("/delete/{erpId}")
//    public void deleteStudent(@PathVariable String erpId){
//            studentRepository.deleteById(erpId);
//    }
//
//    @GetMapping("/list")
//    public List<Student> listStudent()
//    {
//        return studentRepository.findAll();
//    }

}
