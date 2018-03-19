package org.spring.springboot.service.impl;

import org.spring.springboot.dao.DetectionUserDao;
import org.spring.springboot.domain.DetecTionUser;
import org.spring.springboot.service.DetectionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetectionUserServiceImpl implements DetectionUserService {
    @Autowired
    private DetectionUserDao DetectionUserDao;

    @Override
    public List<DetecTionUser> findAllCity() {
        return DetectionUserDao.findAllCity();
    }
}
