package com.bsbanksysteme.dockertestbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class BackendController {
    private String color;
    private String name;

    @Autowired
    public BackendController(){}

    @GetMapping("/test")
    public String test() {
        this.color = Color.ORANGE.toString();
        return "test ok - test color RED has the value of " + this.color;
    }

    @PostMapping("/choice")
    public String postkColorChoice(@RequestBody String choice) {
        switch (choice.toLowerCase().trim()) {
            case "a":
                this.color = Color.RED.toString();
                break;
            case "b":
                this.color = Color.GREEN.toString();
                break;
            case "c":
               this.color = Color.BLUE.toString();
                break;
            case "d":
                this.color = Color.BROWN.toString();
                break;
            case "e":
                this.color = Color.YELLOW.toString();
                break;
            case "f":
                this.color = Color.PURPLE.toString();
                break;
            default:
                this.color = Color.ORANGE.toString();
                break;
        }
        return this.color;
    }

    @GetMapping("/color")
    public String getColorChoice() {
        return this.color;
    }

    @PostMapping("/new")
    public String postName (@RequestBody String name) {
        this.name = name;
        return this.name;
    }

    @GetMapping("7name")
    public String getName() {
        return this.name;
    }
}
