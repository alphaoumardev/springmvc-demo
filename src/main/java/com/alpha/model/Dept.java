package com.alpha.model;

/**
 * 部门表实体类
 */
public class Dept
{
    //部门编号 主键
    private String id;

    //部门编码
    private String code;

    //部门名称
    private String name;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}