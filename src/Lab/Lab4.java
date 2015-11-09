package Lab;

//import common.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
//import java.util.*;

/**
 * @version 1.0
 * @author Scott
 */
public class Lab4 {
    public static void main(String[] args){
        
        
    Employee e1 = new Employee(3, "Mike", "Mick", "111-11-1111");
        Employee e2 = new Employee(2, "Jones", "John", "222-22-2222");
        Employee e3 = new Employee(1, "Peterson", "Amy", "333-33-3333");
        Employee e4 = new Employee(4, "Clevelend", "Rory", "444-44-4444");
        Employee e5 = new Employee(5, "Lemmings", "John", "444-44-4444");
        
        List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        
        //This filters dupes out
        Set<Employee> noDupes = new TreeSet<Employee>(list);
//        System.out.println(set.toString()); - testing
        
        List<Employee> list2 = new ArrayList<Employee>(noDupes);
        
        Employee emp = null;
        
        System.out.println("Set Looping : ");
        for (Employee e : list2){
            System.out.println(e);
        }
        
        System.out.println("\n");
        
        System.out.println("Using Iterator : ");
          Iterator<Employee> it = list2.iterator();
    while (it.hasNext()) {
        emp = it.next();
        System.out.println(emp);
        it.remove();
        }
    }
}

