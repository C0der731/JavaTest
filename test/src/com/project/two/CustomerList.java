package com.project.two;

/**
 * @description CustomerList类为Customer对象的管理模块
 *              内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法
 */
public class CustomerList {
    private Customer[] customers;  //用来保存客户对象的数组
    private int total = 0;  //记录保存客户对象的数量

    /**
     * 用来初始化Customer数组的构造器
     * @param totalCustomer：指定数组的长度
     */
    public CustomerList(int totalCustomer){
        //this.total = totalCustomer;
        customers = new Customer[totalCustomer];

    }

    /**
     * @description 将指定客户添加到数组中
     * @param customer
     * @return true：添加成功，false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * @description 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true：修改成功，false：修改失败
     */
    public boolean replaceCustomer(int index, Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @description 删除指定索引位置的客户信息
     * @param index
     * @return true：删除成功，false：删除失败
     */
    public boolean deleteCustomer(int index){
            if (index < 0 || index >= total){
                return false;
            }

            //后面的数组元素全部前移一位
            for(int i=index; i < total-1; i++) {
                customers[i] = customers[i + 1];
            }

            //最后有数据的元素置空
            customers[total - 1] = null;
            total--;
            return true;
    }

    /**
     * @description 获取所有客户信息
     * @return 所有客户数组
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i = 0; i < total ; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * @description 获取指定位置的客户信息
     * @param index
     * @return 指定位置的信息
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    /**
     * @description 获取客户的数量
     * @return
     */
    public int getTotal(){

        return total;
    }

}
