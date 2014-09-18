/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab1;

/**
 *
 * @author viewt_000
 */
public enum Period {
    YEARLY(1.0),
    MONTHLY(1.0/12.0),
    BIWEEKLY(2.0/52.0),
    SEMIMONTHLY(1.0/24.0),
    WEEKLY(1.0/52.0);
    
    private final double yearFraction;
    
    Period(double yearFraction)
    {
        this.yearFraction = yearFraction;
    }
    
    double getYearFraction()
    {
        return yearFraction;
    }
}
