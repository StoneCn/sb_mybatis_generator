package com.stone.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author stone
 * @date 2018/1/25 12:44
 */

public interface BaseMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
