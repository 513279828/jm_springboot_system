package com.qfedu.phone.service.impl;

import com.qfedu.common.vo.PageBean;
import com.qfedu.common.vo.R;
import com.qfedu.dto.MemberQueryDto;
import com.qfedu.phone.dao.PhoneMapper;
import com.qfedu.phone.entity.Phone;
import com.qfedu.phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {

    @Autowired
    private PhoneMapper phoneMapper;

    // 根据手机数量对商品进行升序排列
    @Override
    public R findPhoneList(int getId) {
        List<Phone> phones = phoneMapper.findPhoneList(getId);
        return R.Ok(phones);
    }

    // 根据手机价格对商品进行降序排列
    @Override
    public R findPhonePrice(int getId) {
        List<Phone> phones = phoneMapper.findPhonePrice(getId);
        return R.Ok(phones);
    }

    // 查询购买记录
    @Override
    public R page(MemberQueryDto memberQueryDto) {
        //查询所有的数据
        List<Phone> phoneList = phoneMapper.page((memberQueryDto.getPage()-1)*memberQueryDto.getSize(),
                memberQueryDto.getSize());
        //实例化分页类
        PageBean<Phone> pageBean=new PageBean<>();
        pageBean.setData(phoneList);
        pageBean.setPage(memberQueryDto.getPage());
        pageBean.setSize(memberQueryDto.getSize());
        pageBean.setTotalPage(phoneMapper.pageCount());
        //计算总页数
        pageBean.setTotalPage(pageBean.getTotal()%memberQueryDto.getSize()==0?pageBean.getTotal()/pageBean.getSize()
                :pageBean.getTotal()/pageBean.getSize()+1);
        return R.Ok(pageBean);
    }
}
