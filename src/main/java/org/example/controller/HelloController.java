package org.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(path = "/")
    public String helloWorld() {
        return "<h1>POV: děláš se springem</h1> <img src='https://media.discordapp.net/attachments/803694030810513450/1035603758316535818/uqua16ri62c61.gif'><h2>hovna co děláme:<h2><ul><li><a href='./items'>Items</a></li></ul>";
    }
}
