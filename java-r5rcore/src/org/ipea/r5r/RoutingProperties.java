package org.ipea.r5r;

import com.conveyal.r5.analyst.cluster.PathResult;

public class RoutingProperties {

    public double walkSpeed;
    public double bikeSpeed;
    public int maxRides; // max 8 number of rides in public transport trips
    public int maxLevelTrafficStress;
    public int suboptimalMinutes; // Suboptimal minutes in point-to-point queries
    public int timeWindowSize; // minutes
    public int numberOfMonteCarloDraws; //
    public int[] percentiles = {50};
    public int [] cutoffs = {30};
    public boolean travelTimesBreakdown;
    public PathResult.Stat travelTimesBreakdownStat;

    public RoutingProperties() {
        walkSpeed = 1.0f;
        bikeSpeed = 3.3f;
        maxRides = 8; // max 8 number of rides in public transport trips
        maxLevelTrafficStress = 4;
        suboptimalMinutes = 5; // Suboptimal minutes in point-to-point queries
        timeWindowSize = 60; // minutes
        numberOfMonteCarloDraws = 60; //

        travelTimesBreakdown = false;
        travelTimesBreakdownStat = PathResult.Stat.MEAN;
    }
}
