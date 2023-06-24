package com.example.urlhitcounter.repository;

import com.example.urlhitcounter.model.Url;
import org.springframework.stereotype.Repository;

@Repository
public class UrlRepo {
    public static Integer getHitCount() {
        UrlRepo findByUrl(String Url);
    }
}
