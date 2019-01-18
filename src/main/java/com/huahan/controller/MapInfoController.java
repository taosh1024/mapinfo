package com.huahan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huahan.entity.MapinfoEntity;
import com.huahan.service.MapinfoService;

@RestController
@RequestMapping(value = "/api/Map")
public class MapInfoController {
	@Autowired
    private MapinfoService mapinfoService;
	
	@RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
	
	@RequestMapping("/GetMapInfo")
	public Object GetMapinfo(@RequestParam(value = "Appid") String Appid,
    		@RequestParam(value = "Sign1") String Sign1,
    		@RequestParam(value = "Sign2") String Sign2) {
		return mapinfoService.queryMapinfoList(Appid, Sign1, Sign2);
    }
	

	@RequestMapping("/AddMapInfo")
	public boolean AddMapinfo(MapinfoEntity mapinfo) {
		return mapinfoService.addMapinfo(mapinfo);
    }
	
	
	
	@RequestMapping("/DelMapInfo")
	public boolean DelMapinfo(@RequestParam(value = "key") int id) {
		return mapinfoService.deleteMapinfo(id);
    }
}
