package main.java.springbootdemo.controller;


import org.springframework.web.bind.annotation.*;
import main.java.springbootdemo.bean.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@RestController
@EnableAutoConfiguration
public class DemoController {

    @RequestMapping(value= "/get1/{id}/{name}")
    @ResponseBody
    public User get1(@PathVariable String id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }

    @RequestMapping("/get2")
    @ResponseBody
    public User get2(@RequestParam String id, @RequestParam String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);

        return user;
    }
}
