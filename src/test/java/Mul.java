import org.testng.Assert;
import org.testng.annotations.Test;

public class Mul {
    @Test
    public void mul()
    {
        int a=2,b=3;
        int product=a*b;
        Assert.assertEquals(6,product);
    }
}
