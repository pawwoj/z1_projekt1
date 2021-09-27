package com.company;

import com.company.operations.Add;
import com.company.operations.Divide;
import com.company.operations.Multiply;
import com.company.operations.Subtract;

import java.time.LocalDateTime;

public class Application {

    public static boolean isInt(String a) {
        try {
            Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void run(String operation, String a, String b) {
        System.out.println("Operation: " + operation + " a:" + a + " b:" + b);
        int result;
        double result2;

        switch (operation) {
            case "+":
                Add addOperation = new Add(LocalDateTime.now());
                // Integer result = addOperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                if (isInt(a) && isInt(b)) {
                    result = addOperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                    System.out.println("Result: " + result);
                } else {
                    result2 = addOperation.calculate(Double.valueOf(a), Double.valueOf(b));
                    System.out.println("Result: " + result2);
                }
                break;
            case "-":

                Subtract subtractOperration = new Subtract(LocalDateTime.now());
                if (isInt(a) && isInt(b)) {
                    result = subtractOperration.calculate(Integer.valueOf(a), Integer.valueOf(b));
                    System.out.println("Result: " + result);
                } else {
                    result2 = subtractOperration.calculate(Double.valueOf(a), Double.valueOf(b));
                    System.out.println("Result: " + result2);
                }
                break;
            case "*":
                Multiply multiplyOpperation = new Multiply(LocalDateTime.now());
                if (isInt(a) && isInt(b)) {
                    result = multiplyOpperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                    System.out.println("Result of multiply: " + result);
                } else {
                    result2 = multiplyOpperation.calculate(Double.valueOf(a), Double.valueOf(b));
                    System.out.println("Result: " + result2);
                }
                break;
            case "/":
                if ((isInt(b) && Integer.valueOf(b)!=0) || (!isInt(b) && Double.valueOf(b)!=0.00)) {
                    Divide divideOpperation = new Divide(LocalDateTime.now());
                    if (isInt(a) && isInt(b)) {
                        result = divideOpperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                        System.out.println("Result: " + result);
                    } else {
                        result2 = divideOpperation.calculate(Double.valueOf(a), Double.valueOf(b));
                        System.out.println("Result: " + result2);
                    }
                }
                else{
                    System.out.println("Nie można dzielić przez 0");
                }
                break;
            default:
                System.out.println("default");
        }
    }
}
/*
1. Naprawic GIT
2. Powtorka tego co dzis (przecwicz sobie komendy intellij + git)
3. Rozszerzenie aktualnego projektu
    a) klasa obslugujaca odejmowanie
    b) klasa oblugujaca mnozenie
    c) klasa oblugujaca dzielenie
4. Sproboj rozszerzyc to tak aby działało też dla double (- 1.0 2.0 -> -1.0)
5. Napisz 2 podstawowe testy jednostkowe do aktualnej implementacji (BYLE JAKIE)
// * poczytaj o GIT (obsluga z git bash + filmik na youtube obejrzyj o obsludze gita z konsoli)
 */