package com.talkweb.controller;

import com.talkweb.entity.Staff;
import com.talkweb.mapper.StaffMapper;
import com.talkweb.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Created by talkweb_y on 2018/10/16.
 * 使用jpa操作staff数据类
 */
@RestController
@RequestMapping(value = "/staff")
public class StaffController {

    @Autowired
    private StaffMapper staffMapper;

    @Autowired
    private StaffService staffService;
    /**
     * 查询所有职员数据信息
     * @return
     */
    @RequestMapping(value = "/queryStaffs",method = {RequestMethod.GET})
    public List<Staff> queryStaffs(){
        return  staffMapper.findAll();
    }

    /**
     * 添加职员数据信息
     * @param staffName
     * @param staffAge
     * @return
     */
    @PostMapping(value = "/addStaff")
    public Staff  addStaff(@RequestParam String staffName,@RequestParam String staffAge){
        Staff staff=new Staff();
        staff.setStaffName(staffName);
        staff.setStaffAge(staffAge);
       return   staffMapper.save(staff);
    }

    /**
     * 查询指定的职员数据信息
     * @param id
     * @return
     */
    @GetMapping(value = "/queryStaffById/{id}")
    public Staff queryStaffById(@PathVariable("id") Integer id){
        return  staffMapper.findOne(id);
    }

   /**
     * 更新职员信息
     * @param id
     * @param staffName
     * @param staffAge
     * @return
     */
    @PutMapping(value = "/saveStaffById/{id}")
    public Staff saveStaffById(@PathVariable("id") Integer id,
                               @RequestParam String staffName,
                               @RequestParam String staffAge){
        Staff staff=new Staff();
        staff.setStaffId(id);
        staff.setStaffName(staffName);
        staff.setStaffAge(staffAge);
      return  staffMapper.save(staff);
    }

    /**
     * 删除指定的职员信息
     * @param id
     */
    @DeleteMapping(value = "/deleteStaffById/{id}")
    public void   deleteStaffById(@PathVariable("id") Integer id){
        staffMapper.delete(id);
    }

    @GetMapping(value = "/addStaffs")
    public void addStaffs(){
        staffService.addStaffs();
    }
}
