import org.junit.Assert;
import org.junit.Test;

public class MaximumTestAnalyser
{
    @Test
    public void givenThreeIntergers_FindMaximum_AtFirstPosition()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximum = maximumAnalyser.findMaximum(9,10, 11);
        Assert.assertEquals((Integer)9 , maximum);
    }

    @Test
    public void givenThreeIntergers_FindMaximum_AtSecondPosition()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximum = maximumAnalyser.findMaximum(9, 10, 11);
        Assert.assertEquals((Integer)10 , maximum);
    }

    @Test
    public void givenThreeIntergers_FindMaximum_AtThirdPosition()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
        Integer maximum = maximumAnalyser.findMaximum(9,10, 11);
        Assert.assertEquals((Integer)11 , maximum);
    }
}
