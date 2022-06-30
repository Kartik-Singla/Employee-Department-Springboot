package com.springboot.paytm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
	
	@Autowired
	private CacheManager cachemanager;
	
	@RequestMapping(value="clearCache")
	public void clearCache(){
        for(String name:cachemanager.getCacheNames()){
            cachemanager.getCache(name).clear();            // clear cache by name
        }
    }
}
