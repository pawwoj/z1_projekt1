package com.company;

import com.company.operations.Add;
import com.company.operations.Divide;
import com.company.operations.Multiply;
import com.company.operations.Subtract;

import java.time.LocalDateTime;

public class Application {
    public static void run(String operation, String a, String b) {
        System.out.println("Operation: " + operation + " a:" + a + " b:" + b);
        int result;

        switch (operation) {
            case "+":
                Add addOperation = new Add(LocalDateTime.now());
                // Integer result = addOperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                result = addOperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                System.out.println("Result: " + result);
                break;
            case "-":
                Subtract subtractOperration = new Subtract(LocalDateTime.now());
                result = subtractOperration.calculate(Integer.valueOf(a), Integer.valueOf(b));
                System.out.println("Result: " + result);
                break;
            case "*":
                Multiply multiplyOpperation = new Multiply(LocalDateTime.now());
                result = multiplyOpperation.calculate(Integer.valueOf(a), Integer.valueOf(b));
                System.out.println("Result of multiply: " + result);
                break;
            case "/":
                Divide divideOpperation = new Divide(LocalDateTime.now());
                result = divideOpperation.calculate(Integer.valueOf(a),Integer.valueOf(b));
                System.out.println("Result of divide: " + result);
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