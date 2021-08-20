package com.alpha.service.implem;

import com.alpha.mapper.DeptMapper;
import com.alpha.model.Dept;
import com.alpha.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class DeptServiceImp implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> selectAllDept() {
        return deptMapper.selectAllDept();
    }

    public void createDept(Dept dept) {
        deptMapper.createDept(dept);
    }

    public void updateDept(Map<String, String> map) {
        deptMapper.updateDept(map);
    }

    public Dept selectDept(String id) {
        return deptMapper.selectDept(id);
    }
}
