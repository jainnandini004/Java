package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.springboot.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer>{

}
