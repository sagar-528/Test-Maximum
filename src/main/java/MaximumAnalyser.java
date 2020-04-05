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

    public static <S extends Comparable<S>> S findMaximum(S ...parameter)
    {
        int hold;
        S value;
         //Insertion Sorting
        for (int counter = 1; counter < parameter.length; counter++)
        {
            hold = counter;
            value = parameter[hold];
            while (hold > 0 && parameter[hold-1].compareTo(value) < 0)
            {
                parameter[hold] = parameter[hold-1];
                hold--;
            }
            parameter[hold] = value;
        }
        printMax(parameter[0]);
        return parameter[0];
    }

    public <S extends Comparable<S>> S findMaximum()
    {
        return (S) findMaximum(firstNumber,secondNumber,thirdNumber);
    }

    public static <S extends Comparable<S>> void printMax(S maximum)
    {
        System.out.println("Maximum is :"+maximum);
    }
}
