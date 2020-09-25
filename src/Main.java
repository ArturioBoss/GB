import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {
        System.out.println("*******************************************************************");
        System.out.println("***  Привет выбери игру: 1-угадай число 2-угадай слово  3-Выход ***");
        System.out.println("*******************************************************************");
        goGameSelection();

    }

    private static void goGameSelection() {
        int game = scanner.nextInt();
        if (game==1){
            goOneGame();
        } else if (game==2){
            goTwoGame();
        }else {
            return;
        }
    }

    private static void goTwoGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String hiddenword = words[random.nextInt(words.length)];
        while (true) {
            System.out.println("Попробуй угадать слово");
            String answer = scanner.next();
            if (hiddenword.equals(answer)) {
                System.out.println("Да ты мозг !!!");
            } else {
                for (int i = 0; i <15 ; i++) {
                    if (i < answer.length() && i < hiddenword.length() && hiddenword.charAt(i) == answer.charAt(i)){
                        System.out.print(hiddenword.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }



    }

    private static void goOneGame() {
        System.out.println("Привет, я загадал число. Попробуй угадать у Вас есть 3ри попытки");
        int numberrandom = random.nextInt(10);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите число: ");
            int insertnumber = scanner.nextInt();
            if (numberrandom == insertnumber){
                System.out.println("Ты экстрасенс !!!");
                break;
            }else {
                if (numberrandom > insertnumber){
                    System.out.println("Ваше число меньше загаданного.");
                }else {
                    System.out.println("Ваше число больше загаданного.");
                }
            }

        }
        goRepeat();
    }

    private static void goRepeat() {
        System.out.println("«Повторить игру ещё раз? 1 – да / 0 – нет»");
        int question = scanner.nextInt();
        if (question==1){
            goOneGame();
        }
        System.out.println("Пока !!!");
        return;
    }

}
