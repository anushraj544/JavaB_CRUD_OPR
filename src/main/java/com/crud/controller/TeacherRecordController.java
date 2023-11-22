package com.crud.controller;

import com.crud.entity.TeacherRecord;
import com.crud.service.TeacherRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
@CrossOrigin("*")
public class TeacherRecordController {
    @Autowired
    private TeacherRecordService teacherRecordService;
    //create
    @PostMapping("/create")
    public TeacherRecord createTeacher(@RequestBody TeacherRecord teacherRecord){
        return  this.teacherRecordService.createTeacher(teacherRecord);
    }

    //read
    @GetMapping("/getTeacher/{tId}")
    public TeacherRecord getTeacherById(@PathVariable Integer tecId){
        return this.teacherRecordService.teacherById(tecId);
    }

    //update
    @PutMapping("/update/{tId}")
    public TeacherRecord updateTeacherRecord(@RequestBody TeacherRecord teacherRecord,@PathVariable Integer tecId){
        return  this.teacherRecordService.updateTeacher(tecId,teacherRecord);
    }

    //delete
    @DeleteMapping("/delete/{tId}")
    public String deleteTeacher(@PathVariable Integer tId){
        return this.teacherRecordService.deleteTeacher(tId);
    }
}
