package cn.park.service;

import cn.park.pojo.Reconcilia;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ReconciliaService {
    public void deleteAll();

    public void importAll();

    /**
     * 查询所有
     * @return
     */
    public List<Reconcilia> findAllReconcilia();

    /**
     * 条件查询
     * @param pageNumber
     * @param pageSize
     * @param reconcilia
     * @return
     */
    public Page<Reconcilia> findAllByEs(Integer pageNumber, Integer pageSize, Reconcilia reconcilia);
}
