package com.jiyuge.service;

import com.jiyuge.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

/**
 * @Author zhongjingyun
 * @Date 2020/11/1 下午6:40
 **/
@Slf4j
@DubboService(protocol = "rest")
@Path("/account")
public class AccountServiceImpl implements AccountService {

    @Override
    @GET
    @Path("/{id : \\d+}")
//    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String getBalance(@PathParam("id") Integer uid) {
        log.info("getName uid : {}", uid);
        return Math.random()+"";
    }
}
