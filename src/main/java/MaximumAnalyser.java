public class MaximumAnalyser<S extends Comparable<S>>
{
    S firstNumber;
    S secondNumber;
    S thirdNumber;


    public MaximumAnalyser() {
    }

    public MaximumAnalyser(S firstNumber, S secondNumber, S thirdNumber)
    {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public S findMaximum(S firstNumber, S secondNumber, S thirdNumber)
    {
        if (firstNumber.compareTo(secondNumber) > 0 && firstNumber.compareTo(thirdNumber) > 0)

            return firstNumber;

        else if (secondNumber.compareTo(firstNumber) > 0 && secondNumber.compareTo(thirdNumber) > 0)

            return secondNumber;

        else
            return thirdNumber;
    }

    public <S extends Comparable<S>> S findMaximum()
    {
        printMax(findMaximum(firstNumber,secondNumber,thirdNumber));
        return (S) findMaximum(firstNumber,secondNumber,thirdNumber);
    }

    public void printMax(S maximum)
    {
        System.out.println("Maximum is :"+maximum);
    }
}
