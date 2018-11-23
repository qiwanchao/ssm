package com.baizhi.service.impl;

import com.baizhi.dao.T_studentDao;
import com.baizhi.entity.T_student;
import com.baizhi.service.T_StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class T_StudentServiceImpl implements T_StudentService {
    @Autowired
    private T_studentDao t_studentDao;



    @Override
    public List<T_student> selectAll() {

        return t_studentDao.selectAll();
    }
}
