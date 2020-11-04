package com.jiyuge.service;

import com.jiyuge.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author zhongjingyun
 * @Date 2020/11/1 下午6:40
 **/
@Slf4j
@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public String getName(Integer uid) {
        log.info("getName uid : {}", uid);
        return "jiyuge:" + uid;
    }
}
