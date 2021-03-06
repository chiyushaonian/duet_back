package com.brt.duet.dao.sys;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;

/**
 * @author 方杰
 * @date 2019年7月22日
 * @description 用户表Dao
 */
public interface UserDao {

    int insert(@Param("mapInsert") Map<String, Object> mapInsert);

    int delete(@Param("mapWhere") Map<String, List<Map<String, Object>>> mapWhere);

    int update(@Param("mapUpdate") Map<String, Object> mapUpdate, @Param("mapWhere") Map<String, List<Map<String, Object>>> mapWhere);

    Page<Map<String, Object>> select(@Param("columns") Set<String> columns, @Param("mapWhere") Map<String, List<Map<String, Object>>> mapWhere);

	Page<Map<String, Object>> selectWithRole(Set<String> columns, Map<String, List<Map<String, Object>>> mapWhere);

}
