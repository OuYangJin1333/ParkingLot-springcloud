package cn.park.service;

import cn.park.pojo.Part;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 停车场查询
 */
public interface PartService {
    public void deleteAll();
    public void importAll();

    /**
     * 条件查询
     * @param pageNumber
     * @param pageSize
     * @param part
     * @return
     */
    public Page<Part> findListByEs(Integer pageNumber, Integer pageSize, Part part);

    /**
     * 查询所有
     * @return
     */
    public List<Part> getAll();

    /**
     * 查询所有停车场名字
     * @return
     */
    public List<Part> getAllName();

    /**
     * 查询所有停车场类型
     * @return
     */
    public List<Part> getAllType();
}
