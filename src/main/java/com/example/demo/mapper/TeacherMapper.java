package com.example.demo.mapper;

import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author:hxx
 * @Description:
 * @Date:Create in 15:17 2020/4/11
 */
@Mapper
@Repository
public interface TeacherMapper {

    /**
     * 查询所有的老师
     *
     * @return 所有老师的列表
     */
    public List<Teacher> queryAllTeacher();






}
