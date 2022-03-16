package com.Vrindhawan.vrindhawanRegistrationService.model;

import  org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document (collection = "Students")

public class Student {
        @Id
        private String erpId;
        private String adharId;
        private String firstName;
        private String middleName;
        private String lastName;
        private int dateOfBirth;
        private String address;
        private String gender;
        private String mobileNo;


        Student()
        {
        }
        public String getErpId(){return erpId;}
        public void setErpId(String erpId){this.erpId=erpId;}

        public String getAdharId(){return adharId;}
        public void setAdharId(String adharId){this.adharId=adharId;}

        public String getFirstName(){return firstName;}
         public void setFirstName(String firstName){this.firstName=firstName;}

        public String getMiddleName(){return middleName;}
        public void setMiddleName(String middleName){this.middleName=middleName;}

        public String getLastName(){return lastName;}
        public void setLastName(String lastName){this.lastName=lastName;}

        public int getDateOfBirth(){return dateOfBirth;}
        public void setDateOfBirth(int dateOfBirth){this.dateOfBirth=dateOfBirth;}

        public String getAddress(){return address;}
        public void setAddress(String address){this.address=address;}

        public String getGender(){return gender;}
        public void setGender(String gender){this.gender=gender;}

        public String getMobileNo(){return mobileNo;}
        public void setMobileNo(String mobileNo){this.mobileNo=mobileNo;}
}

