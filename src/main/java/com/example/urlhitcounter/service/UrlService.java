package com.example.urlhitcounter.service;

import com.example.urlhitcounter.model.Url;
import com.example.urlhitcounter.repository.UrlRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlService {

    @Autowired
    UrlRepo urlRepo;
    public Integer getHitCount(String url) {
        UrlRepo urlRepo=urlRepo.findByUrl(url);
        if(UrlRepo!=null)
        {
            return UrlRepo.getHitCount();
        }
        return 0;
    }

    public void hitCount(String url) {

        UrlRepo urlRepo=urlRepo.findByUrl(url);
        if(UrlRepo!=null)
        {
            urlRepo.setHitCount(urlRepo.getHitCount()+1);
        }
        else {
            urlRepo=new UrlRepo();
            urlRepo.setUrl(url);
            urlRepo.sethitCount(1);
        }
        urlRepo.save(urlRepo);
    }
}
