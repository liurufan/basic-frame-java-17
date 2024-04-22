package org.basic.frame.domain.controller;

import org.basic.frame.domain.body.LoginBody;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/login")
public class LoginController {
    @PostMapping
    public void login(@RequestBody @Valid LoginBody loginBody) {}
}
