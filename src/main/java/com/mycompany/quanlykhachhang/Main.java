/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quanlykhachhang;

/**
 *
 * @author nduc6
 */

import java.util.ArrayList;
import java.util.List;

class QuanLyKhachHang {
    private final String name;
    private final int age;
    private final int id;

    public QuanLyKhachHang(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "QuanLyKhachHang{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}

class CustomerManager {
    private final List<QuanLyKhachHang> customerList;

    public CustomerManager() {
        this.customerList = new ArrayList<>();
    }

    public void addCustomer(QuanLyKhachHang customer) {
        customerList.add(customer);
    }

    public void removeCustomer(int id) {
        customerList.removeIf(customer -> customer.getId() == id);
    }

    public List<QuanLyKhachHang> getCustomerList() {
        return customerList;
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerManager manager = new CustomerManager();

        // Them khach hang 
        QuanLyKhachHang customer1 = new QuanLyKhachHang("Alice", 30, 1);
        QuanLyKhachHang customer2 = new QuanLyKhachHang("Bob", 25, 2);
        manager.addCustomer(customer1);
        manager.addCustomer(customer2);

        // Hien thi danh sach khach hang truoc khi xoa 
        System.out.println("danh sach khach hang truoc khi xoa:");
        for (QuanLyKhachHang customer : manager.getCustomerList()) {
            System.out.println(customer.toString());
        }

        // Xoa khach hang 
        manager.removeCustomer(2);

        // Hien thi danh sach khach hang sau khi xoa 
        System.out.println("\ndanh sach khach hang sau khi xoa :");
        for (QuanLyKhachHang customer : manager.getCustomerList()) {
            System.out.println(customer.toString());
        }
    }
}