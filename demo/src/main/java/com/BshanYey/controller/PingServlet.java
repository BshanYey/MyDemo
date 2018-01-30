package com.BshanYey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;

/**
 * Ping
 */
@Controller
public class PingServlet {

    @RequestMapping("ping")
    public @ResponseBody String ping(){
        return "pong";
    }
}
