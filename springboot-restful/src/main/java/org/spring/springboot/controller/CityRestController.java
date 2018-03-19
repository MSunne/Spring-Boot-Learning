package org.spring.springboot.controller;

import org.spring.springboot.domain.Body;
import org.spring.springboot.domain.City;
import org.spring.springboot.domain.DetecTionUser;
import org.spring.springboot.domain.Detection;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.DetectionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;
    @Autowired
    private DetectionUserService DetectionUserService;

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.GET)
    public City findOneCity(@PathVariable("id") Long id) {
        return cityService.findCityById(id);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public List<City> findAllCity() {
        return cityService.findAllCity();
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void createCity(@RequestBody City city) {
        cityService.saveCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody City city) {
        cityService.updateCity(city);
    }

    @RequestMapping(value = "/api/city/{id}", method = RequestMethod.DELETE)
    public void modifyCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }

    @RequestMapping(value = "/Detec/GetUser", method = RequestMethod.POST)
    public List<DetecTionUser> GetUser(@RequestBody DetecTionUser DetecTionUser) {
        return DetectionUserService.findAllCity();
    }

    @RequestMapping(value = "/Detec/AddDetection", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> AddDetection(@RequestBody Body Body) {
        Map<String, Object> map = new HashMap<String, Object>();
        String len = Long.toString(Body.getDeviceID().length());
        System.out.println(Body.getDeviceID().length() + ";;;;" + len);
        if (!len.equals("0")) {
            map.put("result", "DeviceID=" + Body.getDeviceID());
        } else {
            map.put("result", "DeviceID=null");
        }
        return map;
    }
}
