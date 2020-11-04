package com.jiyuge.service;

import com.jiyuge.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Random;

/**
 * @Author zhongjingyun
 * @Date 2020/11/1 下午6:40
 **/
@Slf4j
@DubboService
public class AccountServiceImpl implements AccountService {

    @Override
    public String getBalance(Integer uid) {
        log.info("getName uid : {}", uid);
        return Math.random()+"";
    }
}
