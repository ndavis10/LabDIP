package dip.lab1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author your name goes here
 */
public interface Employee {
    
    //public abstract double getYearlyCompensation();
    //public abstract double getYearlyBonus();
    //public abstract void setYearlyBonus();
    public abstract double getWages(Period p);
//    // You gotta question if these are appropriate for ALL employees?
//    private double annualBonus;
//
//    /**
//     * Returns annual bonus for salaried workers. Is this polymorphic?
//     * Could it be? Does it belong here?
//     *
//     * @return annual bonus or zero if none.
//     */
//    public double getAnnualBonus() {
//        return annualBonus;
//    }
//
//    /**
//     * Is this polymorphic? Should it be? Does it belong here?
//     * @param annualBonus -- think carefully about this
//     */
//    public void setAnnualBonus(double annualBonus) {
//        this.annualBonus = annualBonus;
//    }
}
