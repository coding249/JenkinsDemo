package com.example.whodemo.dao;

import com.example.whodemo.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDao extends JpaRepository<Goods, Long> {

    Goods findById(int id);

}
