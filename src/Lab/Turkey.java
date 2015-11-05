/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Scott
 */
public class Turkey implements Comparable {
    
    private String fcolor;
    private String sex;
    private int id;

    public Turkey(String fcolor, String sex, int id) {
        this.fcolor = fcolor;
        this.sex = sex;
        this.id = id;
    }
    
    

    public String getFcolor() {
        return fcolor;
    }

    public void setFcolor(String fcolor) {
        this.fcolor = fcolor;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Turkey other = (Turkey) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    public int compareTo(Object other) {
        
        Turkey o = (Turkey)other;
        
        return new CompareToBuilder()
               .append(this.id, o.id)
               .toComparison();
    }

    @Override
    public String toString() {
        return "Turkey{" + "fcolor=" + fcolor + ", sex=" + sex + ", id=" + id + '}';
    }
    public static void main(String[] args){
        Turkey t1 = new Turkey("ABrown", "Male", 234);
        Turkey t2 = new Turkey("Black", "Male", 123);
        Turkey t3 = new Turkey("Yellow", "Female", 234);
        Turkey t4 = new Turkey("Blue", "Male", 948);
        Turkey t5 = new Turkey("Rainbow", "Female", 947);
        
        List<Turkey> list = new ArrayList<Turkey>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        
        Set<Turkey> set = new TreeSet<Turkey>(list);
        
        list = new ArrayList(set);
        
        Collections.sort(list, new SortByColor());
        for(Turkey e : list){
            System.out.println(e);
        }
    }
    
    }

