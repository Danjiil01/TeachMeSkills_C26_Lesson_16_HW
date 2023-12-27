package com.teachmeskills.lesson16.homework.task1;

import com.teachmeskills.lesson16.homework.task1.client.Client;
import com.teachmeskills.lesson16.homework.task1.constant.IPassportNumber;
import com.teachmeskills.lesson16.homework.task1.order.Order;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        // Создание нескольких клиентов
        Client client1 = new Client(
                "01.01.2024",
                "John",
                25);
        Client client2 = new Client(
                "02.01.2024",
                "Alice",
                30);

        // Добавление нескольких заказов для каждого клиента
        client1.addOrder(new Order(10.0, "Product 1"));
        client1.addOrder(new Order(20.0, "Product 2"));

        client2.addOrder(new Order(15.0, "Product 3"));
        client2.addOrder(new Order(30.0, "Product 4"));

        // Создание Map-коллекции для хранения пар "номер паспорта клиента" -> "объект класса клиент"
        Map<String, Client> clientMap = new HashMap<>();

        // Добавление клиентов в Map-коллекцию
        clientMap.put(IPassportNumber.PASSPORT_CLIENT_1, client1);
        clientMap.put(IPassportNumber.PASSPORT_CLIENT_2, client2);

        /**
         * -----------------------------------------------------------------------------------------------
         */

        // Задача 1: - все пары ключ-значение, используя Map.Entry<K, V> entry : map.entrySet()
        for (Map.Entry<String, Client> entry : clientMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " ---> Value: " + entry.getValue());
        }
        System.out.println();

        /**
         * -----------------------------------------------------------------------------------------------
         */

        // Задача 2: - все пары ключ-значение, используя итератор
        Iterator<Map.Entry<String, Client>> iterator = clientMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Client> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " ---> Value: " + entry.getValue());
        }
        System.out.println();

        /**
         * ------------------------------------------------------------------------------------------------
         */

        // Задача 3: - все ключи, используя map.keySet()
        for (String key : clientMap.keySet()) {
            System.out.println("Key: " + key);
        }
        System.out.println();

        /**
         * ------------------------------------------------------------------------------------------------
         */

        // Задача 4: - все значения, используя map.values()
        for (Client value : clientMap.values()) {
            System.out.println("Value: " + value);
        }
    }
}
