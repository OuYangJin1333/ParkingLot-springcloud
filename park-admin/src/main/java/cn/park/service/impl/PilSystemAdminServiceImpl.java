package cn.park.service.impl;

import cn.park.mapper.PilSystemMapper;
import cn.park.pojo.PilSystem;
import cn.park.service.PilSystemAdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class PilSystemAdminServiceImpl implements PilSystemAdminService {
    @Autowired
    private PilSystemMapper pilSystemMapper;

    @Transactional(readOnly = true)
    public List<PilSystem> getAllListByPage(String title, String publisher, String status, String beginTime, String endTime, Integer pageIndex, Integer pageSize){
        Map<String,Object> param = new HashMap<>();
        param.put("title",title);
        param.put("publisher",publisher);
        param.put("status",status);
        param.put("beginTime",beginTime);
        param.put("endTime",endTime);
        PageHelper.startPage(pageIndex,pageSize);
        List<PilSystem> pilSystemList = pilSystemMapper.pilSystemsListByParamAndAll(param);
        return pilSystemList;
    }

    public int updatePilSystemStatus(Integer id){
        return pilSystemMapper.updateStatusById(id);
    }


    public int addPilSystem(PilSystem pilSystem){
        return pilSystemMapper.insert(pilSystem);
    }

    public int deltePilSystemById(Integer id){
        return pilSystemMapper.deleteByPrimaryKey(id);
    }

    @Transactional(readOnly = true)
    public PilSystem getPilSystemById(Integer id){
        Map<String,Object> param = new HashMap<>();
        param.put("id",id);
        List<PilSystem> pilSystemList = pilSystemMapper.pilSystemsListByParamAndAll(param);
        if(pilSystemList.size()>0){
            return pilSystemList.get(0);
        }else {
            return null;
        }
    }
}
