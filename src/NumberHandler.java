import java.util.Arrays;

public class NumberHandler <T extends Number,E extends Number> {


    public Number sum(T number, E number2) {
        return number.doubleValue() + number2.intValue();
    }

    public  void compareArrays(T[] arr1, E[] arr2) {
        boolean areEqual = Arrays.equals(arr1, arr2);
        System.out.println(areEqual);
    }

    public void minMaxElementInArray(T[] arr1, E[] arr2) {
        Number arr1Min = minElement(arr1);
        Number arr2Min = minElement(arr2);
        Number arr1Max = maxElement(arr1);
        Number arr2Max = maxElement(arr2);
        System.out.println("Min and Max elements fo the first array are: " + arr1Min + "/" + arr1Max);
        System.out.println("Min and Max elements fo the second array are: " + arr2Min + "/" + arr2Max);

    }

    private Number minElement(Number[]arr1) {
        Number min = arr1[0];
        if (arr1.length > 1) {
            for (int i = 1; i < arr1.length; i++) {
                if (arr1[i].doubleValue() < min.doubleValue()) {
                    min = arr1[i];
                }
            }
            return min;
        }
        else return arr1[0];
    }

    private Number maxElement(Number[]arr1) {
        Number max = arr1[0];
        if (arr1.length > 1) {
            for (int i = 1; i < arr1.length; i++) {
                if (arr1[i].doubleValue() > max.doubleValue()) {
                    max= arr1[i];
                }
            }
            return max;
        }
        else return arr1[0];
    }


}
