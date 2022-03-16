package com.Vrindhawan.vrindhawanRegistrationService.config;

import com.Vrindhawan.vrindhawanRegistrationService.service.implementation.StudentRegistration;
import com.Vrindhawan.vrindhawanRegistrationService.service.interfaces.IStudentRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigration  {
    @Bean
    public IStudentRegistration studentRegistration(){
        return new StudentRegistration();
    }
}
