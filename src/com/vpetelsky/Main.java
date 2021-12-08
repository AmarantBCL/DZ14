package com.vpetelsky;

import java.util.List;

/*
1) В Дз11 был метод который возвращает 100 случайных людей.

Написать метод который удалит из этого списка дубликаты по имени и фамилии.

Т.е. останутся только люди с уникальной комбинацией имя+фамилия. Остальные поля в расчет не берутся.
*/
public class Main {

    public static void main(String[] args) {
        PersonGenerator pGenerator = new PersonGenerator(100);
        pGenerator.print();
        System.out.println();
        pGenerator.removeDuplicates();
        pGenerator.print();
    }
}
