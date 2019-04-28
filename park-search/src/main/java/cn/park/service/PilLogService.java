package cn.park.service;

import cn.park.pojo.PilLog;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 日志查询
 */
public interface PilLogService {

    public void deleteAll();
    public void importAll();

    /**
     * 查询所有
     * @return
     */
    public List<PilLog> findByList();

    /**
     * 根据es模糊查询
     * @param pageNumber
     * @param pageSize
     * @param pilLog
     * @return
     */
    public Page<PilLog> findAllByEs(Integer pageNumber, Integer pageSize, PilLog pilLog);

    /**
     * 删除记录
     * @param id
     * @return
     */
    public int delete(Integer id);

    /**
     * 批量删除记法
     * @param id
     * @return
     */
    public boolean deletAllLog(Integer id);

}
