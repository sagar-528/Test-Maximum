public class MaximumAnalyser
{
    public Integer findMaximum(Integer firstNumber, Integer secondNumber, Integer thridNumber)
    {
            if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thridNumber) > 0)

                return firstNumber;

               else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thridNumber) > 0)

                    return secondNumber;

                else
                    return thridNumber;

    }

    public Float findMaximum(Float firstNumber, Float secondNumber, Float thridNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thridNumber) > 0)

            return firstNumber;

        else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thridNumber) > 0)

            return secondNumber;

        else
            return thridNumber;

    }
}
