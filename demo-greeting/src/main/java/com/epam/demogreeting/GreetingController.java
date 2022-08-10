package com.epam.demogreeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping
public class GreetingController {

  @GetMapping(value = "/")
  public String getGreeting() {
    return "Welcome to the greeting service.";
  }

  @GetMapping(value = "/hello")
  public String getHello() {
    return "Hello world!";
  }

  @GetMapping(value = "/goodbye")
  public String getGoodbye() {
    return "Goodbye, cruel world!";
  }
}