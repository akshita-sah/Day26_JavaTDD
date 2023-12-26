import org.junit.Assert;
import org.junit.Test;

public class InvoiceGeneratorTest {
    /* UC 1 to calculate total fare */
    @Test
    public void givenDistanceAndTime_FindTotalFare()
    {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Assert.assertEquals(210,invoiceGenerator.CalculateTotalFare(20,10));
    }
}
