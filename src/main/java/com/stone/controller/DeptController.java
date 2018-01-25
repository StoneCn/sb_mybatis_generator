package com.stone.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.stone.mapper.DeptMapper;
import com.stone.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author stone
 * @date 2018/1/24 16:29
 */
@Controller
public class DeptController {

    @Autowired
    DeptMapper deptMapper;

   /* @RequestMapping(value = "/depts/{deptid}",method = RequestMethod.GET)
    @ResponseBody
    public Department getDept(@PathVariable(value = "deptid")Long deptid){
        Department dept = deptMapper.getDept(deptid);
        return dept;
    }
*/
    @RequestMapping(value="/depts/qo",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<Dept> queryPage(Integer pageNum,Integer pageSize){
//        Integer pageNum =1;
//        Integer pageSize=5;
        System.out.println("pageNum: "+pageNum+","+"pageSize: "+pageSize);

        PageHelper.startPage(pageNum,pageSize);

        List<Dept> depts = deptMapper.selectAll();

        PageInfo<Dept> deptPageInfo = new PageInfo<>(depts);

        return deptPageInfo;
    }

}
