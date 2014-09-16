/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author viewt_000
 */
public interface TipCalculator {
    public final double MIN_BILL = 0.00;
    public final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;

    public final double GOOD_RATE = 0.20;
    public final double FAIR_RATE = 0.15;
    public final double POOR_RATE = 0.10;
    public abstract double getTip();
    public abstract void setServiceRating(ServiceQuality q);
    public abstract ServiceQuality getServiceQuality();
}
