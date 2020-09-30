import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int SIZE_FIELD;
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    private static char[][] gameTable;
    private static boolean win = false;
    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("*** Добро пожаловать в игру крестики нолики ***");
        System.out.println("***********************************************");

        System.out.print("Введите размер поля: ");
        SIZE_FIELD = scanner.nextInt();
        System.out.printf("Вы выбрали поле %sx%s",SIZE_FIELD,SIZE_FIELD);
        System.out.println();

        fillField();
        inputTable();
        startWalk();
    }

    private static void fillField() {
        gameTable = new char[SIZE_FIELD][SIZE_FIELD];
        for (int i = 0; i < SIZE_FIELD; i++) {
            for (int j = 0; j < SIZE_FIELD; j++) {
                gameTable[i][j] = '-';
            }
        }

    }

    private static void inputTable() {
        System.out.print("  ");
        for (int i = 0; i < gameTable.length; i++) {
            System.out.print(i+1+" ");
        }
        System.out.println();
        for (int i = 0; i < gameTable.length; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < gameTable.length; j++) {
                System.out.print(gameTable[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void startWalk() {
        for (int i = 0; i <SIZE_FIELD*SIZE_FIELD ; i++) {
            inputUser();
            i +=1;
            if (SIZE_FIELD*SIZE_FIELD==i){
                break;
            }
            if (win){
                return;
            }
            goMoveAI();
            if (win){
                return;
            }
            inputTable();
        }
        System.out.println("Ничья");
    }

    private static void inputUser(){
        System.out.print("Введите номер поля x и y без пробела: ");
        int userField = scanner.nextInt();
        goMoveUser(userField);

    }

    private static void goMoveUser(int move) {
        String strMove = null;
        if (move < 10 || move < 0){
            inputUser();return;
        }
        strMove = String.valueOf(move);
        int xField = Integer.parseInt(String.valueOf(strMove.charAt(0)));
        int yField = Integer.parseInt(String.valueOf(strMove.charAt(1)));
        if ((xField > SIZE_FIELD || yField > SIZE_FIELD) || (xField < 0 || yField < 0)){
            inputUser();
        }
        if (gameTable[xField-1][yField-1] == '-'){
            gameTable[xField-1][yField-1]='X';
        }else {
            inputUser();
        }
        checkWin();

    }

    private static void goMoveAI(){

        int xFieldAI = random.nextInt(SIZE_FIELD);
        int yFieldAI = random.nextInt(SIZE_FIELD);
        if (gameTable[xFieldAI][yFieldAI] == '-'){
            gameTable[xFieldAI][yFieldAI]='O';
        }else{
            goMoveAI();
        }
        checkWin();


    }

    private static void checkWin(){
        int userWinX = 0; int userWinY = 0;
        int aiWinX = 0; int aiWinY = 0;
        int userWinG = 0; int aiWinG = 0;
        int userWinV = 0; int aiWinV = 0;
        for (int i = 0; i <gameTable.length; i++) { //Проверим диоганали и горизонт
            for (int j = 0; j <gameTable.length ; j++) {
                if (i == j && gameTable[i][j] == 'O'){
                    aiWinX = aiWinX+1;
                } else if (i == j && gameTable[i][j] == 'X'){
                    userWinX = userWinX+1;
                }

                if (i+j == j + SIZE_FIELD -1 -j && gameTable[i][j] == 'O'){
                    aiWinY = aiWinY+1;
                } else if (i+j == j + SIZE_FIELD -1 -j && gameTable[i][j] == 'X'){
                    userWinY = userWinY+1;
                }

                if (gameTable[i][j] == 'O'){ //горизонт
                    aiWinG = aiWinG+1;
                }else if (gameTable[i][j] == 'X'){
                    userWinG = userWinG+1;
                }

                if (gameTable[j][i] == 'O'){ //вертикаль
                    aiWinV = aiWinV+1;
                }else if (gameTable[j][i] == 'X'){
                    userWinV = userWinV+1;
                }

                if (userWinX == SIZE_FIELD || userWinY == SIZE_FIELD){
                    System.out.println("Вы победили");
                    win = true;
                    break;
                }else if (aiWinX == SIZE_FIELD || aiWinY == SIZE_FIELD){
                    System.out.println("Победил AI");
                    win = true;
                    break;
                }

            }
            if (!win) {
                if (userWinG != SIZE_FIELD) {
                    userWinG = 0;
                } else {
                    System.out.println("Вы победили!");
                    win = true;
                    break;
                }
                if (aiWinG != SIZE_FIELD) {
                    aiWinG = 0;
                } else {
                    System.out.println("Победил AI!");
                    win = true;
                    break;
                }

                if (userWinV != SIZE_FIELD) {
                    userWinV = 0;
                } else {
                    System.out.println("Вы победили!");
                    win = true;
                    break;
                }
                if (aiWinV != SIZE_FIELD) {
                    aiWinV = 0;
                } else {
                    System.out.println("Победил AI!");
                    win = true;
                    break;
                }
            }

        }

    }
}
