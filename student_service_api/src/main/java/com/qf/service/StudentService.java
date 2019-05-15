package com.qf.service;

import com.qf.entity.SysStudent;

import java.util.List;

public interface StudentService {

    /*添加学生*/
    int insertStudent(SysStudent sysStudent);

    /*展示学生列表*/
    List<SysStudent> queryAll();

}
