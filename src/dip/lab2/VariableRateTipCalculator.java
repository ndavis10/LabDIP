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
public abstract class VariableRateTipCalculator implements TipCalculator{
    private double minBill = 0.00;
    private double maxBill = 100.00;
    
    private String billEntryError =
            "Error: bill must be greater than or equal to " + minBill;

    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    public double getMinBill() {
        return minBill;
    }

    public void setMinBill(double minBill) {
        this.minBill = minBill;
    }

    public double getMaxBill() {
        return maxBill;
    }

    public void setMaxBill(double maxBill) {
        this.maxBill = maxBill;
    }

    public String getBillEntryError() {
        return billEntryError;
    }

    public void setBillEntryError(String billEntryError) {
        this.billEntryError = billEntryError;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public void setGoodRate(double goodRate) {
        if(goodRate < 0)
        {
            throw new IllegalArgumentException("Rate cannot be less than zero");
        }
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        if(fairRate < 0)
        {
            throw new IllegalArgumentException("Rate cannot be less than zero");
        }
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        if(poorRate < 0)
        {
            throw new IllegalArgumentException("Rate cannot be less than zero");
        }
        this.poorRate = poorRate;
    }
    
}
