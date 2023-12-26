package com.teachmeskills.lesson16.homework.task1.client;

import com.teachmeskills.lesson16.homework.task1.order.Order;

import java.util.ArrayList;

public class Client {
    private String registrationDate;
    private String name;
    private int age;
    private String passportNumber;
    private ArrayList<Order> orders;

    public Client(String registrationDate, String name, int age, String passportNumber) {
        this.registrationDate = registrationDate;
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
