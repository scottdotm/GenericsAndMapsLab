package Lab;

//import common.Employee;
//import common.EmployeeByLastName;
import common.EmployeeBySsn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.util.*;

/**
 *
 * @author Scott
 */
public class Lab3 {
    public static void main(String[] args){
        Employee e5 = new Employee(5, "Lemmings", "John", "444-44-4444");
        Employee e1 = new Employee(3, "Mike", "Mick", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "John", "222-22-2222");
        Employee e3 = new Employee(1, "Peterson", "Amy", "333-33-3333");
        Employee e4 = new Employee(4, "Clevelend", "Rory", "444-44-4444");
        
        Map<String, Employee> employeeMap = new TreeMap<String, Employee>();
        
        employeeMap.put(e1.getSnn(), e1);
        employeeMap.put(e2.getSnn(), e2);
        employeeMap.put(e3.getSnn(), e3);
        employeeMap.put(e4.getSnn(), e4);
        employeeMap.put(e5.getSnn(), e5);
        
//        Set<String> keys = employeeMap.keySet();
//        for(String key : keys){
//            Employee found = employeeMap.get(key);
//            System.out.println(found.toString());
//        }
        
        System.out.println("\n");
        
        Collection<Employee> employees = employeeMap.values();
        
        List<Employee> listSorted = new ArrayList<Employee>(employees);
        
        Collections.sort(listSorted, new EmployeeByLastName());
        for (Employee emp : listSorted){
            System.out.println(emp);
        }
    }
}
