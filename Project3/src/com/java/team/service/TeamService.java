package com.java.team.service;

import com.java.team.domain.Architect;
import com.java.team.domain.Designer;
import com.java.team.domain.Employee;
import com.java.team.domain.Programmer;

/**
 * @author zhang
 * @className: TeamService
 * @description: 功能：关于开发团队成员的管理：添加、删除等
 * @date: 2020-12-17 14:17
 * @since JDK 13
 */
public class TeamService {
    private static int counter = 1;  // 用来为开发团队新增成员自动生成团队中的唯一ID，即memberId。
    private static final int MAX_MEMBER = 5;  // 表示开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];  // 用来保存当前团队中的各成员对象
    private int total = 0; // 记录团队成员的实际人数

    public Programmer[] getTeam(){
        return team;
    }

    public void setTeam(Programmer[] team) {
        this.team = team;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void addMember(Employee e) throws TeamException {

        //成员已满，无法添加
        if(total >= MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        //该成员不是开发人员，无法添加
        if(!(e instanceof Programmer)){
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //该员工已在本开发团队中
        for(int i = 0; i < total; i++){
            if(team[i].getId() == e.getId()){
                throw new TeamException("该员工已在本开发团队中");
            }
        }
        //该员工已是某团队成员
        //该员正在休假，无法添加
        Programmer p = (Programmer) e;
        if(((Programmer) e).getStatus() == Status.BUSY){
            throw new TeamException("该员正在休假，无法添加");
        }

        //团队中至多只能有一名架构师
        int numOfArchitect = 0;
        int numOfDesigner = 0;
        int numOfProgrammer = 0;
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Architect){
                numOfArchitect++;
            }
        }
        if(numOfArchitect == 1){
            throw new TeamException("团队中至多只能有一名架构师");
        }

        //团队中至多只能有两名设计师
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Designer){
                numOfDesigner++;
            }
        }
        if(numOfDesigner == 2){
            throw new TeamException("团队中至多只能有两名设计师");
        }

        //团队中至多只能有三名程序员
        for(int i = 0; i < total; i++){
            if(team[i] instanceof Programmer){
                numOfProgrammer++;
            }
        }
        if(numOfProgrammer == 3){
            throw new TeamException("团队中至多只能有三名程序员");
        }

        team[total++] = p;
        p.setMemberId(counter++);
        p.setStatus(Status.BUSY);

    }

    //循环覆盖
    public void removeMember(int memberId){
        for(int i = 0; i < total; i++){
            if(team[i].getId() == memberId){

                team[i].setStatus(Status.FREE);

                for(int j = i + 1; j < total; j++){
                    team[j-1] = team[j];
                }

                team[total - 1] = null;
                break;
            }

        }
    }
}