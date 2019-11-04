
        /*Задание:
        Напишите параметризированный класс с двумя параметрами,
        ограниченными классом Number и разработайте метод вычисления суммы
        двух чисел, любых типов, метод сравнивающий поэлементно два массива
        разных типов, метод определяющий наибольший и наименьший элементы в
        массивах.

         */
public class Runner {
    public static void main(String[] args) {
        NumberHandler<Integer,Double> numberHandler = new NumberHandler<>();
        System.out.println(numberHandler.sum(13, 67.2));
        Integer[] integer = {2,65767,435,34345,567,3,2324,657,34456,657,3,566,335,343,768,45};
        Double[] doubles = {23.6,54456.6,435.6,35456.654,4366.34,435.8,2134.4};
        numberHandler.minMaxElementInArray(integer,doubles);
        numberHandler.compareArrays(integer,doubles);
    }
}
