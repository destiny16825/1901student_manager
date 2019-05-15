package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysTeacher {

    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private Integer classId;

}
