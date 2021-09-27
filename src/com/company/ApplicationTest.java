package com.company;

import com.company.operations.Add;
import com.company.operations.Multiply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;


// import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void shouldSayThat2IsInteger() {
        //   Application application = new Application();
        Assertions.assertTrue(Application.isInt("2"));
    }

    @Test
    public void shouldSayThat5dot55IsntInteger() {
        //  Application application = new Application();
        Assertions.assertFalse(Application.isInt("5.55"));
    }

    @Test
    public void shouldSay5plus3is8() {

        Add add = new Add(LocalDateTime.now());
        Assertions.assertEquals(8, add.calculate(5, 3));
    }

    @Test
    public void shouldntSay3dot2multiplied5if4() {
        Multiply multiply = new Multiply(LocalDateTime.now());
        Assertions.assertNotEquals(4, multiply.calculate(3.2, 4.0));
    }

    @Test
    public void shouldHaveProperErrorMessage() {
        Application application = new Application();
        ByteArrayOutputStream newConsole = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newConsole));
        Application.run("/", "5", "0");
        //  Assertions.assertFalse();
        Assertions.assertEquals("Operation: / a:5 b:0\r\nNie można dzielić przez 0\r\n", newConsole.toString());
    }


//    @Test()
// Nie działało pewnie dlatego że poza błędem zwracało int c
//    public void shouldntAcceptArithmeticException(){
//        Assertions.assertThrows(ArithmeticException.class, () ->{
//            Divide divide = new Divide(LocalDateTime.now());
//            divide.calculate(5, 0);
//        });

//    }

    // java.lang.ArithmeticException

}