package com.springbootstr.springstr.controller;
import com.springbootstr.springstr.dto.RegistrationDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    @GetMapping("/test")
    public String testMethod() {
        return "TestMethod Excuted";
    }
    @GetMapping(path="/print-name")
    public String printName(){
        return "Zeyad";
    }
    //QueryString
    @GetMapping("/testt")
    public String testMethod2(@RequestParam(name="Zoz",required = false,defaultValue = "ZeyadTharwat") String name) {
        return "Name " +name;
    }
    //QueryParam
    @GetMapping("/testt3/{name}/{id}")
    public String testMethod3(@PathVariable(required = false) String name,
                              @PathVariable int id) {
        return "Name " +name+ " id " +id;
    }
    //return data
    @PostMapping("/addUser")
    public String testMethod4(@RequestBody RegistrationDto user) {
        return "The User " +user.getUserName()+ " With Email " +user.getEmail() +" Is successfully Saved";
    }
    //return JSON
    @PostMapping("/addUser2")
    public RegistrationDto testMethod5(@RequestBody RegistrationDto user) {
        return user;
    }


}
