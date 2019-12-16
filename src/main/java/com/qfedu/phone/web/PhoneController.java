package com.qfedu.phone.web;

import com.qfedu.common.vo.R;
import com.qfedu.dto.MemberQueryDto;
import com.qfedu.phone.entity.Phone;
import com.qfedu.phone.service.PhoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(value = "实现手机的操作", tags = "实现手机的操作")
@Controller("/phone.action")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    // 根据手机数量对商品进行升序排列
    @GetMapping("/api/phone/name/price.do")
    @ApiOperation(value = "根据手机价格对商品进行升序排列", notes = "根据手机价格对商品进行升序排列")
    public R findByPrice(int getId) {
        return phoneService.findPhoneList(getId);
    }

    @GetMapping("/api/phone/name/list.do")
    @ApiOperation(value = "根据手机数量对商品进行升序排列", notes = "根据手机数量对商品进行升序排列")
    public R findByList(int getId) {
        return phoneService.findPhonePrice(getId);
    }

    @GetMapping("/api/phone/name/page.do")
    @ApiOperation(value = "对手机信息进行分页", notes = "对手机信息进行分页")
    public R page(@RequestBody MemberQueryDto queryDto) {
        return phoneService.page(queryDto);
    }

}
