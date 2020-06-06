package com.example.whodemo.Impl;

import com.example.whodemo.dao.StudentDao;
import com.example.whodemo.entity.Student;
import com.example.whodemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentDao.save(student);//调用save如果传入的id已经存在那么会把之前的信息进行覆盖。
    }

    @Override
    public void delete(Integer sid) {
        studentDao.deleteById(sid);
    }

    @Override
    public Student findStuById(Integer sid) {
        return studentDao.findStudentById(sid);
    }

    @Override
    public List<Student> findStuByName(String name) {
        return studentDao.findStuByName(name);
    }

    @Override
    public Page<Student> findAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page,pageSize);
        return studentDao.findAll(pageable);
    }
}