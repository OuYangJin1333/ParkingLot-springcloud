package cn.park.mapper;

import cn.park.pojo.Part;

import java.util.List;

public interface PartMapper {
    List<Part> findAllPart();

    List<Part> findAllName();

    List<Part> findAllType();
}
