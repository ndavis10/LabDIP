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
public class TipService {
    private TipCalculator calc;
    
    public TipService(TipCalculator calc)
    {
        this.calc = calc;
    }
    
    public double getTip()
    {
        return calc.getTip();
    }

    public TipCalculator getCalc() {
        return calc;
    }

    public void setCalc(TipCalculator calc) {
        this.calc = calc;
    }
}
