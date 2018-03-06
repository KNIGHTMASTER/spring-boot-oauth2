package com.zisal.security.spring.boot.oauth2.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created on 3/6/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class AppController {

    @GetMapping("/")
    public String displayIndex(){
        return "index";
    }

    @GetMapping("/securedPage")
    public String displaySecuredPage() {
        return "securedPage";
    }
}
