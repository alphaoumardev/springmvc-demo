package com.alpha.controller;

import com.alpha.model.Dept;
import com.alpha.service.implem.DeptServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class DeptController
{
    @Autowired
    private DeptServiceImp deptServiceImp;

    @ResponseBody
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Dept> selectAllDept()
    {
        List<Dept> deptList = deptServiceImp.selectAllDept();
        System.out.println(deptList);
        return deptList;
    }

    @RequestMapping(value = "/into", method = RequestMethod.GET)
    public void create()
    {
        List<Dept> deptList = deptServiceImp.selectAllDept();
        Dept dept = new Dept();
        dept.setCode("ccccs");
        dept.setId("aaaaas");
        dept.setName("bbbbs");
        deptServiceImp.createDept(dept);
        System.out.println(deptList);
    }
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public void update()
    {
        Map<String,String> map = new HashMap<String, String>();
        map.put("id","aaaaas");
        map.put("name","gggg");
        deptServiceImp.updateDept(map);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ModelAndView getDept(@PathVariable("id")String id)
    {
        Dept dept = deptServiceImp.selectDept(id);
        ModelAndView modelAndView = new ModelAndView("test");
        modelAndView.addObject(dept);
        return modelAndView;
    }
    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public ModelAndView getDept()
    {
        return new ModelAndView("test");
    }
}