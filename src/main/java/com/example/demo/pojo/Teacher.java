package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author:hxx
 * @Description:
 * @Date:Create in 14:45 2020/4/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    private Long id;

    private String name;

    private Integer age;

    private Boolean headTeacher;

    private List<Student> students;
}
