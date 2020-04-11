package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:hxx
 * @Description:
 * @Date:Create in 14:00 2020/4/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {

    private Long id;

    private String name;

    private String schoolNo;

}
