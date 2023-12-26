import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    /* UC 1 to calculate total fare */
    @Test
    public void givenDistanceAndTime_FindTotalFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Assert.assertEquals(210,invoiceGenerator.calculateTotalFare(20,10));
    }
    /*UC 2 - Find Fare for multiple rides,
      UC 3 - Find fare, no of rides and average fare per ride.
     */
    @Test
    public void GivenMultipleRides_FindTotalFare()
    {
        Ride[] multipleRideList = {
                new Ride(5,1,'N'),
                new Ride(1,1,'N'),
                new Ride(10,50,'P')
        };
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.calculateTotalFareForMultipleRides(multipleRideList);
        Assert.assertEquals(312,invoiceGenerator.totalFare);
        Assert.assertEquals(3,invoiceGenerator.noOfRides);
        Assert.assertEquals(104,invoiceGenerator.AvgFarePerRide);
    }
    /* UC 4 Find details of particular user
       UC 5 Find details according to type of user (normal/premium) */
    @Test
    public void GivenUserId_FindDetails()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] multipleList = {
                new Ride(5,1,'N'),
                new Ride(1,1,'N'),
                new Ride(10,50,'P')
        };
        invoiceGenerator.addUserId(multipleList,"akshita");
        RideRepository rideRepo = invoiceGenerator.getDetailsOfUser("akshita");
        Assert.assertEquals(3,rideRepo.rideList.length);
        Assert.assertEquals(312,rideRepo.totalFare);
    }
}
