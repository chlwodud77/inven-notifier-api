package com.jay.demo.controller;

import com.jay.demo.service.impl.firstServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
@RestController
public class firstController {

    public final firstServiceImpl firstService;

    public firstController(firstServiceImpl firstService) {
        this.firstService = firstService;
    }

    @GetMapping("/check")
    public Map<String, Object> check() {
        return firstService.getFirstData();
    }

}
