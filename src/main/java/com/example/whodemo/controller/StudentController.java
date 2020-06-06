package com.example.whodemo.controller;

import com.example.whodemo.entity.Student;
import com.example.whodemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    /**
     * 添加学生
     * @param student 要添加的学生对象
     * @return
     */
    @PostMapping("/add")
    public Student save(Student student){
        return studentService.save(student);
    }

    /**
     * 修改学生
     * @param student
     * @return
     */
    @PostMapping("/update")
    public Student update(Student student){
        return studentService.save(student);
    }

    /**
     * 删除学生
     * @param id 要删除的学生id
     * @return
     */
    @GetMapping("/del/{id}")
    public String del(@PathVariable int id){
        studentService.delete(id);
        return "yes";
    }

    /**
     * 通过姓名找到信息
     * @param name
     * @return
     */
    @GetMapping("/findByName/{name}")
    public List<Student> findByName(@PathVariable String name){
        return studentService.findStuByName(name);
    }

    /**
     * 利用分页查找全部信息
     * @param page
     * @param response
     * @return
     */
    @GetMapping("/query")
    public Page<Student> findByPage(Integer page, HttpServletResponse response){

        //异步请求使用
        response.setHeader("Access-Control-Allow-Origin","*");
        if(page==null || page<=0){
            page = 0;
        }else{
            page -= 1;
        }
        return studentService.findAll(page,5);
    }

}
