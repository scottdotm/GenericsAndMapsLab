package simple.maps;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Scott
 */
public class ListOfMapsDemo {
    
    public static void main(String[] args) {
        Employee e1 = new Employee(3, "Mike", "Mick", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "John", "222-22-2222");
        Employee e3 = new Employee(1, "Peterson", "Amy", "333-33-3333");
        
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        
        List<Map<String,Object>> records = new ArrayList<>();
        
        for(Employee e : empList){
        Map<String,Object> genericObj = new HashMap<>();
        genericObj.put("empID", e.getEmpID());
        genericObj.put("lastName", e.getLastName());
        genericObj.put("firstName", e.getFirstName());
        genericObj.put("ssn", e.getSsn());
        records.add(genericObj);
        }
        
        
        
        records.add(genericObj);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        Employee e1 = new Employee(3, "Mike", "Mick", "111-11-1111");
//        Employee e2 = new Employee(2, "Jones", "John", "222-22-2222");
//        Employee e3 = new Employee(1, "Peterson", "Amy", "333-33-3333");
//        Employee e4 = new Employee(4, "Clevelend", "Rory", "444-44-4444");
//        Employee e5 = new Employee(5, "Lemmings", "John", "444-44-4444");
        
//        Map<String,Employee> employees = new HashMap<>();
//        employees.put(e1.getSsn(), e1);
//        employees.put(e2.getSsn(), e2);
//        employees.put(e3.getSsn(), e3);
//        employees.put(e4.getSsn(), e4);
//        employees.put(e5.getSsn(), e5);
        
//        Employee e = employees.get("333-33-3333");
//        
//        System.out.println("Found Employee : " + e);
    }
}

