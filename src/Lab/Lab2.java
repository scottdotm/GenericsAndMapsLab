package Lab;

import common.Employee;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.util.*;

/**
 *
 * @author Scott
 */
public class Lab2 {
    public static void main(String[] args){
        Employee e1 = new Employee(3, "Mike", "Mick", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "John", "222-22-2222");
        Employee e3 = new Employee(1, "Peterson", "Amy", "333-33-3333");
        Employee e4 = new Employee(4, "Clevelend", "Rory", "444-44-4444");
        Employee e5 = new Employee(5, "Lemmings", "John", "444-44-4444");
        
        Map<String, Employee> employeeMap = new TreeMap<String, Employee>();
        
        //getSnn - was throwing an exception so I canged it to return ssn; rather than an exception
        employeeMap.put(e1.getSnn(), e1);
        employeeMap.put(e2.getSnn(), e2);
        employeeMap.put(e3.getSnn(), e3);
        employeeMap.put(e4.getSnn(), e4);
        employeeMap.put(e5.getSnn(), e5);
        
        Set<String> key2 = employeeMap.keySet();
        for(String key : key2){
            Employee found = employeeMap.get(key);
            System.out.println(found.toString());
        }
    }
}
