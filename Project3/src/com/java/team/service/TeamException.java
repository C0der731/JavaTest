package com.java.team.service;

import com.java.team.domain.Employee;
import com.java.team.domain.Equipment;

/**
 * @author zhang
 * @className: TeamException
 * @description: 自定义异常类
 * @date: 2020-12-17 14:16
 * @since JDK 13
 */
public class TeamException extends Exception{

//    Equipment[] equipment;
//    public TeamException(Equipment[] equipment) {
//        this.equipment = equipment;
//    }
//
//    public Equipment[] getEquipment() {
//        return equipment;
//    }
//
//    public void setEquipment(Equipment[] equipment) {
//        this.equipment = equipment;
//    }
    static final long serialVersionUID = -3387516993124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}