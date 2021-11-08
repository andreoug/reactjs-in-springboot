package com.andreoug.init.reactjsinspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by gandreou on 07/11/2021.
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public ModelAndView index() {

        ModelAndView mav = new ModelAndView("index");
        return mav;
    }
}
