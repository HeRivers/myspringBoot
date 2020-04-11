package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:hxx
 * @Description:
 * @Date:Create in 14:29 2020/4/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;

    private String name;

    private Integer age;

    private String sex;

}
