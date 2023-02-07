package com.java.team.view;

import com.java.team.domain.Employee;
import com.java.team.domain.Programmer;
import com.java.team.service.Data;
import com.java.team.service.NameListService;
import com.java.team.service.TeamException;
import com.java.team.service.TeamService;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zhang
 * @className: TeamView
 * @description:
 * @date: 2020-12-17 14:16
 * @since JDK 13
 */
public class TeamView {

    NameListService listSvc = new NameListService();
    TeamService teamSvc = new TeamService();

    public void enterMainMenu() throws TeamException {

        boolean isTrue = true;
        listAllEmployees();
        while(isTrue){

            //listAllEmployees();

            char menu = TSUtility.readMenuSelection();
            switch (menu){
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出（Y/N）？");
                    char isExist = TSUtility.readConfirmSelection();
                    if(isExist == 'Y'){
                        isTrue = false;
                        System.out.println("退出系统");
                    }
                    break;
        }
        }
    }

    private void listAllEmployees(){
        Employee[] employees = listSvc.getAllEmployees();
        System.out.println("---------------------------------开发团队调度软件------------------------------------");
        if(employees.length != 0){
            System.out.println("ID"+"\t"+"姓名"+"\t"+"年龄"+"\t"+"工资"+"\t"+"职位"+"状态"+"\t"+"奖金"+"\t"+"股票"+"\t"+"领用设备");
            for (Employee employee : employees) {
                System.out.println(employee.toString());
            }
            System.out.println("1-团队列表 2-添加团队成员 3-删除团队成员 4-退出 请输入(1-4):");
        }
    }

    private void getTeam(){
        System.out.println("新团队如下：");
        //teamSvc.
        Programmer[] team = teamSvc.getTeam();
        if(team == null){
            return;
        }else {
            for(int i = 0; i < team.length; i++){
                System.out.println(team[i]);
            }
  } }

    private void addMember() throws TeamException {
         System.out.println("请输入要添加的成员ID：");
         int id = TSUtility.readInt();
         teamSvc.addMember(listSvc.getEmployee(id));
    }

    private void deleteMember(){
        System.out.println("请输入要删除的成员ID：");
        int id = TSUtility.readInt();
        teamSvc.removeMember(id);
    }

    public static void main(String[] args) throws TeamException {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }
}

