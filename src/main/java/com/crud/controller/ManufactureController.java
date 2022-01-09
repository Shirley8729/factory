package com.crud.controller;

import com.crud.bean.Manufacture;
import com.crud.bean.Msg;
import com.crud.service.ManufactureService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @RequestMapping(value = "/man/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Msg getMan(@PathVariable("id") Integer id){

       Manufacture manufacture = manufactureService.getMan(id);
       return Msg.success().add("man",manufacture);
    }

    @RequestMapping("/manufacture")
    @ResponseBody
    public Msg getMansWithJson(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
        //引入PageHelper

        PageHelper.startPage(pn,10);

        List<Manufacture> manufactures=manufactureService.getAll();

        //连续显示的页数：5
        PageInfo page=new PageInfo(manufactures,5);

        return Msg.success().add("pageInfo",page);
    }



    @RequestMapping("/mans")
    @ResponseBody
    public Msg getMans(){
        List<Manufacture> manufactureList = manufactureService.getMans();
        return Msg.success().add("mans",manufactureList);
    }



    @RequestMapping(value = "/man" ,method = RequestMethod.POST)
    @ResponseBody
    public Msg saveMan(Manufacture manufacture){
        manufactureService.saveMan(manufacture);
        return Msg.success();
    }


    @RequestMapping(value = "/man/{id}" ,method = RequestMethod.PUT)
    @ResponseBody
    public Msg saveManu(Manufacture manufacture){
        manufactureService.updateManu(manufacture);
        return Msg.success();
    }


    @RequestMapping(value = "/checkE01E1Bar" ,method = RequestMethod.POST)
    @ResponseBody
    public Msg checkE01E1Bar(Integer e01,Integer e1,String bar){
        boolean b = manufactureService.checkE01E1Bar(e01,e1,bar);

        if(b){
            return Msg.success();
        }else {
            return Msg.fail();
        }

    }




    //厂商分页查询
//    @RequestMapping("/manufacture")
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
