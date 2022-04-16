package invoicegenerator;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


public class InvoiceGeneratorTest {
    static InvoiceGenerator invoiceGenerator;

    @BeforeClass
    public static void init(){
        invoiceGenerator = new InvoiceGenerator();
        System.out.println("Welcome to cab invoice generator program");
    }

    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare(){
        double distance=2;
        int time=5;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25.0,fare,0.0);
    }

    @Test
    public void givenLessDistanceAndTimeShouldReturnMinimumFare(){
        double distance=0.1;
        int time=2;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(5,fare,0.0);
    }

}