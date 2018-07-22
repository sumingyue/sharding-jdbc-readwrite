package com.sharding.demo.shardingjdbc.controller;

import com.sharding.demo.shardingjdbc.repository.TUserRepository;
import com.sharding.demo.shardingjdbc.entity.TUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TUserController {

    private final static Logger logger = LoggerFactory.getLogger(TUserController.class);

    @Resource
    private TUserRepository tUserRepository;

    /**
     * 根据班级编号创建布卡课程
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/add")
    public void saveWhitelist() {
        TUser tUser = new TUser();
        tUser.setPassword("18686713853");
        tUser.setUser_name("smy");
        tUserRepository.insert(tUser);
    }
    /**
     * 根据班级编号创建布卡课程
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/find")
    public List<TUser> selectAll() {
        TUser tUser = new TUser();
        return tUserRepository.selectAll(tUser);
    }
}
