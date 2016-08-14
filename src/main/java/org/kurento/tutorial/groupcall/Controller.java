package org.kurento.tutorial.groupcall;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Tran on 15-08-2016.
 */

//import org.springframework.stereotype.Controller;
@Controller
public class UserController {
    @RequestMapping("/")
    String index() {
        return "index";
    }
    @RequestMapping("/test")
    String index1() {
        return "index_1";
    }
}
