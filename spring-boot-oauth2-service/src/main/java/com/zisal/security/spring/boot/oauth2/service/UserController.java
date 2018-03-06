package com.zisal.security.spring.boot.oauth2.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created on 3/6/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
public class UserController {

    @GetMapping("/user/me")
    public Principal user(Principal p_Principal) {
        System.out.println("Principal "+p_Principal);
        return p_Principal;
    }
}
