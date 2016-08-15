package org.kurento.tutorial.groupcall;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tran on 15-08-2016.
 */

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @RequestMapping(value="/")
    String index(){
        return "index.html";
    }

    @RequestMapping(value="/test")
    String index_1() {
        return "index_1.html";
    }
}
