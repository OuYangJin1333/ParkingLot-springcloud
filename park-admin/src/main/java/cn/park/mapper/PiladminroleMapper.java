package cn.park.mapper;

import org.apache.ibatis.annotations.Param;

public interface PiladminroleMapper {
      //添加角色外键表
      int add(@Param("aid") int aid, @Param("rid") int rid);

      //修改角色外键表
       int  update(@Param("aid") int aid, @Param("rid") int rid);
}
