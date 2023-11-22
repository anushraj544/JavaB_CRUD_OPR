package com.crud.repository;

import com.crud.entity.TeacherRecord;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TeacherRecordRepo extends JpaRepository<TeacherRecord,Integer> {
}
