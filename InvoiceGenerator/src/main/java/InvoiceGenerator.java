public class InvoiceGenerator {
    int totalFare, noOfRides, AvgFarePerRide;
    int calculateTotalFare(int distance,int time)
    {
        totalFare = 10 * distance + 1 * time;
        if(totalFare<5)
        {
            totalFare = 5;
        }
        return totalFare;
    }
    void calculateTotalFareForMultipleRides(Ride[] multipleRideList)
    {
        totalFare = 0;
        for(Ride rides : multipleRideList)
        {
            totalFare = 10*rides.distance + 1 * rides.time;
            if(totalFare<5)
            {
                totalFare = 5;
            }
        }
        noOfRides = multipleRideList.length;
        AvgFarePerRide = totalFare/noOfRides;
    }
}
