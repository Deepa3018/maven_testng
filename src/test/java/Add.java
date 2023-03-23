import org.testng.Assert;
import org.testng.annotations.Test;

public class Add {
    @Test
    public void add()
    {
        int a=2,b=3;
        int sum=a+b;
        Assert.assertEquals(5,sum);
    }
}
