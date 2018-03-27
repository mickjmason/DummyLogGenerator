package uk.ltd.skyris.loggenerator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class logController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue = "world") String name)
    {
        return "hello " + name;
    }
        }
