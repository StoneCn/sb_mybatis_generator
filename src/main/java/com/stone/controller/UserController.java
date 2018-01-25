/*
package com.stone.controller;

import com.stone.mapper.UserMapper;
import com.stone.model.User;
import com.stone.query.PageResult;
import com.stone.query.QueryObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

*/
/**
 * @author stone
 * @date 2018/1/23 18:46
 *//*

@Controller
public class UserController {

    @Autowired
    UserMapper userMapper;

    */
/**
     * 增
     * @param
     * @return
     *//*

    @RequestMapping(value="/users",method = RequestMethod.POST)
    @ResponseBody
    public void insert(User user){
        userMapper.insert(user);
    }

    */
/**
     * 删
     * @param userId
     *//*

    @RequestMapping(value="/users/{userid}",method = RequestMethod.DELETE)
    @ResponseBody
    public void delete(@PathVariable(value = "userid")Long userId){
        userMapper.delete(userId);
    }

    */
/**
     * 改
     * @param user
     *//*

    @RequestMapping(value="/users/{userid}",method = RequestMethod.PUT)
    @ResponseBody
    public void update(@PathVariable(value = "userid")Long userId, User user){
        user.setUserId(userId);
        userMapper.update(user);
    }

    */
/**
     * 查某个
     * @param
     *//*

    @RequestMapping(value = "/users/{userid}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable(value = "userid") Long userId){
        User user = userMapper.getUser(1L);
        return user;
    }

    */
/**
     * 查所有
     * @return
     *//*

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public List<User> listUser(){
        List<User> users = userMapper.listUser();
        return users;
    }


    @RequestMapping(value="/users/qo",method = RequestMethod.GET)
    @ResponseBody
    public PageResult queryPage(QueryObject qo){
        List<User> pageUsers = userMapper.queryCondition(qo);
        int totalCount = userMapper.queryConditionCount(qo).intValue();
        PageResult pageResult = new PageResult(pageUsers, totalCount, qo.getCurrentPage(), qo.getPageSize());
        return pageResult;
    }



}
*/
