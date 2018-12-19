package com.talkweb.entity;

import javax.persistence.*;

/**
 * Created by talkweb_y on 2018/10/16.
 */
@Entity
@Table(name = "t_test_staff",schema = "shiro")
public class Staff {
    @Id
    @GeneratedValue
    private Integer staffId;
    @Column(name = "staff_name")
    private String  staffName;
    @Column(name = "staff_age",length = 3)
    private String  staffAge;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }
}
