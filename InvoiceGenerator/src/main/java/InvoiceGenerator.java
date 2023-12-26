public class InvoiceGenerator {
    int calculateTotalFare(int distance,int time)
    {
        int totalfare = 10 * distance + 1 * time;
        if(totalfare<5)
        {
            totalfare = 5;
        }
        return totalfare;
    }
    int calculateTotalFareForMultipleRides(Ride[] multipleRideList)
    {
        int totalFare = 0;
        for(Ride rides : multipleRideList)
        {
            totalFare = 10*rides.distance + 1 * rides.time;
            if(totalFare<5)
            {
                totalFare = 5;
            }
        }
        return totalFare;
    }
}
