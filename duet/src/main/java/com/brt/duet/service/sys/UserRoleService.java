package com.brt.duet.service.sys;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.pagehelper.Page;

/**
 * @author 方杰
 * @date 2019年7月23日
 * @description 用户组表Service接口
 */
public interface UserRoleService {

    int insert(Map<String, Object> mapInsert);

    int delete(Map<String, List<Map<String, Object>>> mapWhere);

    int update(Map<String, Object> mapUpdate, Map<String, List<Map<String, Object>>> mapWhere);

    Page<Map<String, Object>> select(Set<String> columns, Map<String, List<Map<String, Object>>> mapWhere);

}
