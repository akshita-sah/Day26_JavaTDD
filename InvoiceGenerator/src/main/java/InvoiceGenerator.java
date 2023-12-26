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
    /*
    Calculate total fare according to distance and time
     */
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
            if(rides.type == 'N') {
                fare = 10 * rides.distance + 1 * rides.time;
                if (fare < 5) {
                    fare = 5;
                }
            }
            else {
                fare = 15 * rides.distance + 2 * rides.time;
                if (fare < 20) {
                    fare = 20;
                }
            }
            totalFare+=fare;
            fare = 0;
        }
        noOfRides = multipleRideList.length;
        AvgFarePerRide = totalFare/noOfRides;
    }
    /*
    Calculate total fare according to distance, time and type.
     */
    void addUserId(Ride[] multipleRideList,String user)
    {
        totalFare = 0;
        int fare = 0;
        for(Ride rides : multipleRideList)
        {
            if(rides.type == 'N') {
                fare = 10 * rides.distance + 1 * rides.time;
                if (fare < 5) {
                    fare = 5;
                }
            }
            else {
                fare = 15 * rides.distance + 2 * rides.time;
                if (fare < 20) {
                    fare = 20;
                }
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
