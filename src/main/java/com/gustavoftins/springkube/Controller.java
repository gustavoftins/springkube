package com.gustavoftins.springkube;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/teste")
    public String testeController() {
        return "It's working =)";
    }
}
