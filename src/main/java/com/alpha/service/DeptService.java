package com.alpha.service;


import com.alpha.model.Dept;
import java.util.List;
import java.util.Map;

public interface DeptService
{
    public List<Dept> selectAllDept();

    public void createDept(Dept dept);

    public void updateDept(Map<String,String> map);

    public Dept selectDept(String id);
}