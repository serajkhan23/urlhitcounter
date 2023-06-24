package com.example.urlhitcounter.controller;

import com.example.urlhitcounter.model.Url;
import com.example.urlhitcounter.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
public class UrlController {
    @Autowired
    UrlService urlService;


    @GetMapping ("count")
    public  Integer getHitCount(@PathVariable String url)
    {
        return urlService.getHitCount(url);
    }
    public void hitCount(@PathVariable String url)
    {
         urlService.hitCount(url);
    }
}
