package org.spring.springboot.dao;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.DetecTionUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetectionUserDao {
    List<DetecTionUser> findAllCity();
}
