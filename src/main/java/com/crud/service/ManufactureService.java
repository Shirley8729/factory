package com.crud.service;

import com.crud.bean.Manufacture;
import com.crud.bean.ManufactureExample;
import com.crud.dao.ManufactureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Shirley
 * @create 2022-01-03-20:39
 */
@Service
public class ManufactureService {

    @Autowired
    ManufactureMapper manufactureMapper;
    public List<Manufacture> getAll() {
        return manufactureMapper.selectByExample(null);
    }

    public List<Manufacture> getMans() {
        ManufactureExample example = new ManufactureExample();
        example.setDistinct(true);

        List<Manufacture> manufactureList = manufactureMapper.selectManExample(example);
        return manufactureList;
    }

    public Manufacture getMan(Integer id) {
        Manufacture manufacture = manufactureMapper.selectByPrimaryKey(id);
        return manufacture;
    }

    public void saveMan(Manufacture manufacture) {
        manufactureMapper.insertSelective(manufacture);
    }

    public boolean checkE01E1Bar(Integer e01,Integer e1,String bar) {
        ManufactureExample example = new ManufactureExample();
        ManufactureExample.Criteria criteria = example.createCriteria();
        criteria.andE01EqualTo(e01);
        criteria.andE1EqualTo(e1);
        criteria.andBarEqualTo(bar);
        long count = manufactureMapper.countByExample(example);
        return count == 0;

    }

    public void updateManu(Manufacture manufacture) {
        manufactureMapper.updateByPrimaryKeySelective(manufacture);
    }
}
