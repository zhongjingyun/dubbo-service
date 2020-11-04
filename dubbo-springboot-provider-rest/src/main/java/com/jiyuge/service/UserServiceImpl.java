package com.jiyuge.service;

import com.jiyuge.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * @Author zhongjingyun
 * @Date 2020/11/1 下午6:40
 **/
@Slf4j
@DubboService(protocol = "rest")
@Path("/user")
public class UserServiceImpl implements UserService {

    @Override
    @POST
    @Path("/getName")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String getName(Integer uid) {
        log.info("getName uid : {}", uid);
        return "jiyuge:" + uid;
    }
}
