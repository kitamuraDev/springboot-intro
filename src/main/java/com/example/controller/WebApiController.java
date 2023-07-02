package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WebApiController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }

  // パスパラメータ
  @RequestMapping("/test/{param}")
  public String pathParam(@PathVariable("param") String param) {
    return "パスパラメータ: " + param;
  }

  // リクエストパラメータ
  @RequestMapping("/test")
  public String requestParam(@RequestParam("param") String param) {
    return "リクエストパラメータ: " + param;
  }

  // リクエストボディ
  @PostMapping("/post")
  public String requestBody(@RequestBody String param) {
    return "リクエストボディ: " + param;
  }

  // JSONを返す（サクッと返したいので HashMap を使う）
  @RequestMapping("/foo")
  public Map<String, Object> map() {
    Map<String, Object> map = new HashMap<>();
    map.put( "hoge", "ぴよ" );
    map.put( "moge", 999 );
    return map;
  }

}
