package com.crud.service;

import com.crud.entity.TeacherRecord;
import com.crud.repository.TeacherRecordRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherRecordService {

    //create
    @Autowired
    public TeacherRecordRepo teacherRecordRepo;
    public TeacherRecord createTeacher(TeacherRecord saveData){

        TeacherRecord teacherData = new TeacherRecord();
        teacherData.setName(saveData.getName());
        teacherData.setEmail(saveData.getEmail());
        teacherData.setNumber(saveData.getNumber());
        TeacherRecord dataSaved = this.teacherRecordRepo.save(teacherData);
        return dataSaved;
    }

    //read  tId = 10  -> customerRecord : name,email,number
    public TeacherRecord teacherById(int tId){

        TeacherRecord teacherData =  this.teacherRecordRepo.findById(tId).get();
        return teacherData;
    }

    //UPDATE DATA BY TID
    public TeacherRecord updateTeacher(int tId, TeacherRecord updateData){
        //first of all to check the teacher id available in db
        TeacherRecord data = this.teacherRecordRepo.findById(tId).get();
        TeacherRecord newData = new TeacherRecord();
        if(data.getName()!=null){
            newData.setTId(tId);
            newData.setName(updateData.getName());
            newData.setEmail(updateData.getEmail());
            this.teacherRecordRepo.save(newData);
        }
        else {
            System.out.println("Teacher id:"+tId+" is not found in Database");
        }
        return newData;
    }

    //delete
     public String deleteTeacher(int tId){
        this.teacherRecordRepo.deleteById(tId);
        return "user deleted with id :"+tId+"Successfully !!!!";
     }

}
