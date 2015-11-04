/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author Scott
 */
public class Car1 implements Comparable {
    private int vinNumber;
    
//    public int compareTo(Object other) {
//        
//        Employee o = (Employee)other;
//        
//        return new CompareToBuilder()
//               .append(this.vinNumber, o.)
//               .toComparison();
//    }
    
    @Override
    public int compareTo(Object o){
        Car1 targetCar = (Car1)o;
        final int EQUAL = 0;
        final int BEFORE = -1;
        final int AFTER = 1;
        if(this.equals(targetCar)){
            return EQUAL;
        }
        if(targetCar.getVinNumber() < this.vinNumber){
            return BEFORE;
        }else{
            return AFTER;
        }
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.vinNumber;
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
        final Car1 other = (Car1) obj;
        if (this.vinNumber != other.vinNumber) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "Car1{" + "vinNumber=" + vinNumber + '}';
//    }
    
}
