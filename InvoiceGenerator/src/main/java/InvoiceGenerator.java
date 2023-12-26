import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {
    int totalFare, noOfRides, AvgFarePerRide;
    Map<String,RideRepository> userList;
    InvoiceGenerator()
    {
        this.userList = new HashMap<>();
    }
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
        int fare = 0;
        for(Ride rides : multipleRideList) {
            fare = 10 * rides.distance + 1 * rides.time;
            if (fare < 5) {
                fare = 5;
            }
            totalFare+=fare;
            fare = 0;
        }
        noOfRides = multipleRideList.length;
        AvgFarePerRide = totalFare/noOfRides;
    }
    void addUserId(Ride[] multipleRideList,String user)
    {
        totalFare = 0;
        int fare = 0;
        for(Ride rides : multipleRideList)
        {
            fare+= 10*rides.distance + 1 * rides.time;
            if(fare<5)
            {
                fare = 5;
            }
            totalFare+=fare;
            fare = 0;
        }
        noOfRides = multipleRideList.length;
        AvgFarePerRide = totalFare/noOfRides;
        RideRepository rideRepo = new RideRepository(multipleRideList,multipleRideList.length,totalFare,AvgFarePerRide);
        userList.put(user,rideRepo);
    }
    RideRepository getDetailsOfUser(String user)
    {
        return userList.get(user);
    }
}
