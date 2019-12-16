package com.qfedu.phone.dao;

import com.qfedu.phone.entity.Phone;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PhoneMapper {

    /*
    展示手机信息
     */
    List<Phone> findPhoneList(int getid);

    List<Phone> findPhonePrice(int getid);

    // 添加购买信息
    int insert(Phone phone);

    // 分页展示所有手机的信息
    List<Phone> page(@Param("page")int page, @Param("size") int size);

    // 分页的数量
    int pageCount();

}
