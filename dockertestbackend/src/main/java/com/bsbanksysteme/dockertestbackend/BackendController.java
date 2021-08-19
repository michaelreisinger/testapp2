package com.bsbanksysteme.dockertestbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.Random;

@RestController
public class BackendController {
    private String color;
    //private String name;

    @Autowired
    public BackendController(){}

    @GetMapping("/test")
    public String test() {
        int choice = 0;
        Random rand = new Random();
        choice = rand.nextInt(7);
        switch (choice) {
            case 1:
                this.color = Color.RED.toString();
                break;
            case 2:
                this.color = Color.GREEN.toString();
                break;
            case 3:
                this.color = Color.BLUE.toString();
                break;
            case 4:
                this.color = Color.BROWN.toString();
                break;
            case 5:
                this.color = Color.YELLOW.toString();
                break;
            case 6:
                this.color = Color.PURPLE.toString();
                break;
            default:
                this.color = Color.ORANGE.toString();
                break;
        }
        return this.color;
    }

    /*
    @PostMapping("/choice")
    public String postkColorChoice(@RequestBody int choice) {
        switch (choice) {
            case 1:
                this.color = Color.RED.toString();
                break;
            case 2:
                this.color = Color.GREEN.toString();
                break;
            case 3:
               this.color = Color.BLUE.toString();
                break;
            case 4:
                this.color = Color.BROWN.toString();
                break;
            case 5:
                this.color = Color.YELLOW.toString();
                break;
            case 6:
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
    */
}
