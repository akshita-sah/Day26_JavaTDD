import java.util.ArrayList;

public class RideRepository {
    Ride[] rideList;
    int totalFare,noOfRides,avgPerRide;
    RideRepository(Ride[] ridelist,int noride,int fare,int avg)
    {
        rideList = ridelist;
        noOfRides = noride;
        totalFare = fare;
        avgPerRide = avg;
    }
}
