public class InvoiceGenerator {
    int CalculateTotalFare(int distance,int time)
    {
        int totalfare = 10 * distance + 1 * time;
        if(totalfare<5)
        {
            totalfare = 5;
        }
        return totalfare;
    }
}
