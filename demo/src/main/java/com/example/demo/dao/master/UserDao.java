package com.example.demo.dao.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * 用户 DAO 接口类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * 根据用户名获取用户信息
     *
     * @param userName
     * @return
     */
    User findByName(@Param("userName") String userName);
}
