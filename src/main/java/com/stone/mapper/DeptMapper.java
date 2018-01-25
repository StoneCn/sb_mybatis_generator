package com.stone.mapper;

import com.stone.model.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 这个是集成了通用mapper后的用法
 */
@Mapper
@Component
public interface DeptMapper extends BaseMapper<Dept>{
}