package cn.park.service;

import cn.park.pojo.Reconcilia;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ReconciliaService {
    public void deleteAll();

    public void importAll();

    public List<Reconcilia> findAllReconcilia();

    public Page<Reconcilia> findAllByEs(Integer pageNumber, Integer pageSize, Reconcilia reconcilia);
}
