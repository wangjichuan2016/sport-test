package com.lesports.wangjichuan.dao;

import com.lesports.wangjichuan.po.Category;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangjichuan on 16-7-7.
 */
@Repository("categoryDao")
public interface CategoryDao {
    public List<Category> get(@Param("id")int id,@Param("name")String name);
}
