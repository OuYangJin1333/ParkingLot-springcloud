package cn.park.service;

import cn.park.pojo.Part;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PartService {
    public void deleteAll();
    public void importAll();
    public Page<Part> findListByEs(Integer pageNumber, Integer pageSize, Part part);
    public List<Part> getAll();
    public List<Part> getAllName();
    public List<Part> getAllType();
}
