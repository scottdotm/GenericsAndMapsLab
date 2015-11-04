/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import common.Employee;
import java.util.*;
/**
 *
 * @author Scott
 */
public class Lab1 {
    public static void main(String[] args){
        Employee e1 = new Employee(3, "Mike", "Mick", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "John", "222-22-2222");
        Employee e3 = new Employee(1, "Peterson", "Amy", "333-33-3333");
        Employee e4 = new Employee(4, "Clevelend", "Rory", "444-44-4444");
        Employee e5 = new Employee(5, "Lemmings", "John", "444-44-4444");
        
        //need to learn HashMap
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
        Set<Employee> set = new TreeSet<Employee>(list);
        
        System.out.println(list);
        System.out.println("The size of the Sorted Set is: " + set.size());
        System.out.println(set);
        
    }
}
