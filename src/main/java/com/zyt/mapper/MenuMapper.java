package com.zyt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyt.entity.Menu;

import java.util.List;

/**
 * @className: MenuMapper
 * @author: Tao_zy
 * @date: 2023/7/3
 **/
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}
