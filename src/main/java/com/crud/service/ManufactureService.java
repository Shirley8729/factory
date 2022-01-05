package com.crud.service;

import com.crud.bean.Manufacture;
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
}
