import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

/*
ЗАДАЧА №317
Подарки Деда Мороза
(Время: 0,5 сек. Память: 16 Мб Сложность: 27%)
Ириска весит X грамм, мандарин – Y грамм, пряник – Z грамм.
Требуется написать программу, которая определит, сколько различных вариантов подарков весом ровно W грамм может сделать Дед Мороз.
Входные данные
В единственной строке входного файла INPUT.TXT содержится четыре целых числа X, Y, Z и W (1 ≤ X, Y, Z ≤ 100, 1 ≤ W ≤ 1000).
Выходные данные
Выходной файл OUTPUT.TXT должен содержать одно целое число – количество вариантов подарков.
Пример
№	INPUT.TXT	        OUTPUT.TXT
1	10 25 15 40	            3
 */

public class Main {

    public static Gift gift;

    public static void main(String[] args) {
        String fileName = "aaa.txt";
        readFromFile(fileName);
        checkCount();
        System.out.println( "колво подарков = " + gift.countValidGifts);
    }


    static void readFromFile (String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            gift = new Gift(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            scanner.close();
            System.out.println(Arrays.toString(gift.xyz) + "  " + gift.w);
            System.out.println(Arrays.toString(gift.xyzMaxCount));
        }
        catch (FileNotFoundException e) {
            System.out.println("упс, файл "+fileName+" не найден");
        }
        catch (InputMismatchException e){
            System.out.println("в файле не совсем число записано");
        }
    }


    private static void checkCount() {
        for (int i = 0; i <= gift.xyzMaxCount[0]; i++){
            for (int j = 0; j <= gift.xyzMaxCount[1]; j++){
                for (int k = 0; k <= gift.xyzMaxCount[2]; k++){
                    if (gift.validGift(i, j, k)) {
                        gift.countValidGifts++;
                        System.out.println("i= " + i + "  j= " + j + "  k= " + k);
                    }
                }
            }
        }
    }
}