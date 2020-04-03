import org.junit.Assert;
import org.junit.Test;

public class MaximumTestAnalyser
{
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void givenThreeIntergers_FindMaximum_AtFirstPosition()
    {
        Integer maximum = maximumAnalyser.findMaximum(9,10, 11);
        Assert.assertEquals((Integer)11 , maximum);
    }

    @Test
    public void givenThreeIntergers_FindMaximum_AtSecondPosition()
    {
        Integer maximum = maximumAnalyser.findMaximum(9, 10, 11);
        Assert.assertEquals((Integer)11 , maximum);
    }

    @Test
    public void givenThreeIntergers_FindMaximum_AtThirdPosition()
    {
        Integer maximum = maximumAnalyser.findMaximum(9,10, 11);
        Assert.assertEquals((Integer)11 , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtFirstPosition()
    {
        Float maximum = maximumAnalyser.findMaximum(6.3f,7.9f, 2.5f);
        Assert.assertEquals((Float) 7.9f , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtSecondPosition()
    {
        Float maximum = maximumAnalyser.findMaximum(6.3f, 7.9f, 2.5f);
        Assert.assertEquals((Float) 7.9f , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtThirdPosition()
    {
        Float maximum = maximumAnalyser.findMaximum(6.3f,7.9f, 2.5f);
        Assert.assertEquals((Float) 7.9f , maximum);
    }
}
