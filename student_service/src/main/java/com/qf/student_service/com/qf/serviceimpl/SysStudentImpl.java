package com.qf.student_service.com.qf.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.qf.entity.SysStudent;
import com.qf.service.StudentService;

import java.util.List;

@Service
public class SysStudentImpl implements StudentService {

    @Override
    public int insertStudent(SysStudent sysStudent) {
        return 0;
    }

    @Override
    public List<SysStudent> queryAll() {
        return null;
    }
}
