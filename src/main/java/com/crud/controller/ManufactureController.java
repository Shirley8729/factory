package com.crud.controller;

import com.crud.bean.Manufacture;
import com.crud.service.ManufactureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Shirley
 * @create 2022-01-03-20:28
 */
@Controller
public class ManufactureController {

    @Resource
    ManufactureService manufactureService;

    //厂商分页查询
    @RequestMapping("/manufacture")
    public String getManufacture(@RequestParam(value = "pn",defaultValue = "1")Integer pn,
                                 Model model){

        //引入PageHelper

        PageHelper.startPage(pn,10);

        List<Manufacture> manufactures=manufactureService.getAll();

        //连续显示的页数：5
        PageInfo page=new PageInfo(manufactures,5);

        model.addAttribute("pageInfo",page);


        return "list";
    }
}
