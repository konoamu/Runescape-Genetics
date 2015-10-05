package Fitness.Skills;

/**
 * Created by samue on 03/10/2015.
 *
 *  About:
 *  This fitness is calculated based on level and how much run energy is used over time,
 *  if to much run energy is used then it then a lower score will be assigned to Agility.
 */

public class Agility {

    public double fitness = 0;

    private double xpTotal;
    private int runEnergy;
    private long startTime;

    public Agility(double xpTotal, int runEnergy, long startTime) {
        this.xpTotal = xpTotal;
        this.runEnergy = runEnergy;
        this.startTime = startTime;
    }

    private long runTime() {
        long ranTime = startTime - System.currentTimeMillis();
        return ranTime;
    }


}
