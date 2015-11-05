/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab;

import java.util.Comparator;

/**
 *
 * @author Scott
 */
public class SortByColor implements Comparator<Turkey>  {
    public int compare(Turkey t1, Turkey t2) {
        return t1.getFcolor().compareTo(t2.getFcolor());
    }
}
