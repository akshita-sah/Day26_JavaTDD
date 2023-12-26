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
                new Ride(5,1),
                new Ride(1,1),
                new Ride(10,50)
        };
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        invoiceGenerator.calculateTotalFareForMultipleRides(multipleRideList);
        Assert.assertEquals(212,invoiceGenerator.totalFare);
        Assert.assertEquals(3,invoiceGenerator.noOfRides);
        Assert.assertEquals(70,invoiceGenerator.AvgFarePerRide);
    }
    /* UC 4 Find details of particular user  */
    @Test
    public void GivenUserId_FindDetails()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] multipleList = {
                new Ride(5,1),
                new Ride(1,1),
                new Ride(10,50)
        };
        invoiceGenerator.addUserId(multipleList,"akshita");
        RideRepository rideRepo = invoiceGenerator.getDetailsOfUser("akshita");
        Assert.assertEquals(3,rideRepo.rideList.length);
        Assert.assertEquals(212,rideRepo.totalFare);
    }
}
