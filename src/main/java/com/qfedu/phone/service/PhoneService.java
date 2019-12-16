package com.qfedu.phone.service;

import com.qfedu.common.vo.R;
import com.qfedu.dto.MemberQueryDto;
import com.qfedu.phone.entity.Page;
import com.qfedu.phone.entity.Phone;

import java.util.List;
import java.util.Map;

public interface PhoneService {


    /*
    展示手机信息
     */
    // 按照手机数量升序展示
    public R findPhoneList(int getId);

    // 按照手机价格降序展示
    public R findPhonePrice(int getId);

    //分页
    public R page(MemberQueryDto memberQueryDto);

}
