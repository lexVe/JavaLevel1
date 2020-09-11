package com.geekbrains.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Employee[] employeesArr = new Employee[5];
        employeesArr[0] = new Employee("Alexey", "Manager", "alexey@skb.ru", "8-123-456-78-91", 35000, 22);
        employeesArr[1] = new Employee("Maxim", "SMM Manager", "maxim@skb.ru", "8-123-456-78-92", 40000, 33);
        employeesArr[2] = new Employee("Diana", "Target Manager", "diana@skb.ru", "8-123-456-78-93", 45000, 44);
        employeesArr[3] = new Employee("Vasiliy", "Product Manager", "vasiliy@skb.ru", "8-123-456-78-94", 50000, 55);
        employeesArr[4] = new Employee("Dmitriy", "No brain Manager", "dmitriy@skb.ru", "8-123-456-78-95", 55000, 66);

for(int i = 0; i<=4; i++){
    if(employeesArr[i].getAge() > 40){
        employeesArr[i].employeeInfo();
    }
}

    }
}
