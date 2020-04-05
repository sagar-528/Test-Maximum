import org.junit.Assert;
import org.junit.Test;

public class MaximumTestAnalyser
{
    MaximumAnalyser maximumAnalyser = new MaximumAnalyser();
    @Test
    public void givenThreeIntegers_FindMaximum_AtFirstPosition()
    {
        Integer maximum = (Integer) maximumAnalyser.findMaximum(9,10, 11);
        Assert.assertEquals((Integer)11 , maximum);
    }

    @Test
    public void givenThreeIntegers_FindMaximum_AtSecondPosition()
    {
        Integer maximum = (Integer) maximumAnalyser.findMaximum(9, 12, 11);
        Assert.assertEquals((Integer)12 , maximum);
    }

    @Test
    public void givenThreeIntegers_FindMaximum_AtThirdPosition()
    {
        Integer maximum = (Integer) maximumAnalyser.findMaximum(14,10, 11);
        Assert.assertEquals((Integer)14 , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtFirstPosition()
    {
        Float maximum = (Float) maximumAnalyser.findMaximum(6.3f,7.9f, 2.5f);
        Assert.assertEquals((Float) 7.9f , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtSecondPosition()
    {
        Float maximum = (Float) maximumAnalyser.findMaximum(8.3f, 7.9f, 2.5f);
        Assert.assertEquals((Float) 8.3f , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtThirdPosition()
    {
        Float maximum = (Float) maximumAnalyser.findMaximum(6.3f,7.9f, 8.5f);
        Assert.assertEquals((Float) 8.5f , maximum);
    }

    @Test
    public void givenThreeStrings_FindMaximum_AtFirstPosition()
    {
        String maximum = (String) maximumAnalyser.findMaximum("Sagar","Pawan", "Zakir");
        Assert.assertEquals("Zakir", maximum);
    }

    @Test
    public void givenThreeStrings_FindMaximum_AtSecondPosition()
    {
        String maximum = (String) maximumAnalyser.findMaximum("Sagar","Pawan", "Yash");
        Assert.assertEquals("Yash", maximum);
    }

    @Test
    public void givenThreeStrings_FindMaximum_AtThirdPosition()
    {
        String maximum = (String) maximumAnalyser.findMaximum("Vansh","Pawan", "Sagar");
        Assert.assertEquals("Vansh", maximum);
    }

    @Test
    public void givenThreeIntegers_FindMaximum_AtFirstPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser(9,10, 11);
        Integer maximum = (Integer) maximumAnalyser.findMaximum();
        Assert.assertEquals((Integer)11 , maximum);
    }

    @Test
    public void givenThreeIntegers_FindMaximum_AtSecondPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser(9,12, 11);
        Integer maximum = (Integer) maximumAnalyser.findMaximum();
        Assert.assertEquals((Integer)12 , maximum);
    }

    @Test
    public void givenThreeIntegers_FindMaximum_AtThirdPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser(14,10, 11);
        Integer maximum = (Integer) maximumAnalyser.findMaximum();
        Assert.assertEquals((Integer)14 , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtFirstPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser(8.3f,7.9f, 2.5f);
        Float maximum = (Float) maximumAnalyser.findMaximum();
        Assert.assertEquals((Float) 8.3f , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtSecondPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser(6.3f,7.9f, 8.5f);
        Float maximum = (Float) maximumAnalyser.findMaximum();
        Assert.assertEquals((Float) 8.5f , maximum);
    }

    @Test
    public void givenThreeFloatNumber_FindMaximum_AtThirdPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser(6.3f,7.9f, 2.5f);
        Float maximum = (Float) maximumAnalyser.findMaximum();
        Assert.assertEquals((Float) 7.9f , maximum);
    }

    @Test
    public void givenThreeStrings_FindMaximum_AtFirstPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser("Sagar","Pawan", "Zakir");
        String maximum = (String) maximumAnalyser.findMaximum();
        Assert.assertEquals("Zakir" , maximum);
    }

    @Test
    public void givenThreeStrings_FindMaximum_AtSecondPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser("Sagar","Pawan", "Yash");
        String maximum = (String) maximumAnalyser.findMaximum();
        Assert.assertEquals("Yash" , maximum);
    }

    @Test
    public void givenThreeStrings_FindMaximum_AtThirdPosition_FromGenericClass()
    {
        MaximumAnalyser maximumAnalyser = new MaximumAnalyser("Vansh","Pawan", "Sagar");
        String maximum = (String) maximumAnalyser.findMaximum();
        Assert.assertEquals("Vansh" , maximum);
    }
}
