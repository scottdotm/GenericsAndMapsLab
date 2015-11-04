package common;

/**
 * New comparable - class
 * Always override Comparable
 * 
 * Sorts should be sorted based upon what is used for equals() and hashCode()
 * A B C D
 * "A" - right!!
 * "B" = "A" - not right
 * "A" - not right
 * "C"
 * "D"
 * 
 * @author Scott
 */
public class Car implements Comparable {
    private String vinNumber;

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.vinNumber != null ? this.vinNumber.hashCode() : 0);
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
        final Car other = (Car) obj;
        if ((this.vinNumber == null) ? (other.vinNumber != null) : !this.vinNumber.equals(other.vinNumber)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" + "vinNumber=" + vinNumber + '}';
    }
    
    
    
    public int compareTo(Object t) {
        Car targetCar = (Car)t;
        
        return this.getVinNumber().compareTo(targetCar.getVinNumber());
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
