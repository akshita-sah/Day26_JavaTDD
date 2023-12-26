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
    @Test
    public void GivenMultipleRides_FindTotalFare()
    {
        Ride[] multipleRideList = {
                new Ride(5,1),
                new Ride(1,1),
                new Ride(10,50)
        };
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        int fare = invoiceGenerator.calculateTotalFareForMultipleRides(multipleRideList);
        Assert.assertEquals(150,fare);
    }
}
