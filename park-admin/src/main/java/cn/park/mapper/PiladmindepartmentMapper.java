package cn.park.mapper;

import org.apache.ibatis.annotations.Param;

public interface PiladmindepartmentMapper {
   //添加部门外键表
   int  add(@Param("aid") int aid, @Param("did") int did);

   //修改部门外键表
   int update(@Param("aid") int aid, @Param("did") int did);

}
