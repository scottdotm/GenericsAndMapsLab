package Lab;

import common.Employee;
import java.util.*;
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
        
        //need to learn HashMap
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
//        Set<Employee> set = new TreeSet<Employee>(list);
        
        HashMap<String, Employee> employeeMap = new HashMap();
        employeeMap.put(e1.getSsn(), e1);
        employeeMap.put(e2.getSsn(), e2);
        employeeMap.put(e3.getSsn(), e3);
        employeeMap.put(e4.getSsn(), e4);
        employeeMap.put(e5.getSsn(), e5);
        
        System.out.println("Finding the employee with the key of 333-33-3333");
        System.out.println(employeeMap.get("333-33-3333") + "\n");
        
        Set<String> keys = employeeMap.keySet();
        for(String key : keys){
            Employee found = employeeMap.get(key);
            System.out.println(found);
        }
        
        
    }
}
