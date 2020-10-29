import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        String[][] numbers = new String[][]{
                {"1", "2", "3", "4"},
                {"5","6","7A"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };


        doCheckEndSum(numbers);


    }

    private static void doCheckEndSum(String[][] numbers) {
        int sum = 0;
        if (numbers.length != 4){
            throw new MyArraySizeException(String.format("Размер массива %s, что не равно 4",numbers.length));

        }
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i].length != 4){
                throw new MyArraySizeException(String.format("Размер ячеек в массиве[%s] не равно %s",i,numbers.length));
            }
            for (int j = 0; j <numbers.length ; j++) {
                try {
                    sum += Integer.parseInt(numbers[i][j]);
                }catch (NumberFormatException ne){
                    throw new MyArrayDataException(String.format("В ячейке массива найдено не число [%s]",numbers[i][j]),ne);

                }


            }
        }
        System.out.println("Общая сумма: "+sum);
    }


}
