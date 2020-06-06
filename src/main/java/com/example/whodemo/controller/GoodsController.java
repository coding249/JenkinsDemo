package com.example.whodemo.controller;


import com.example.whodemo.dao.GoodsDao;
import com.example.whodemo.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsDao goodsRepository;

    @RequestMapping("/list")
    public List<Goods> findAll(){
        List<Goods> list = new ArrayList<Goods>();
        list = goodsRepository.findAll();
        return list;
    }
}
