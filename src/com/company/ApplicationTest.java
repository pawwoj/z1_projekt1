package com.company;

import com.company.operations.Add;
import com.company.operations.Divide;
import com.company.operations.Multiply;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Dictionary;

// import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void shouldSayThat2IsInteger() {
        Application application = new Application();
        Assertions.assertTrue(application.isInt("2"));
    }

    @Test
    public void shouldSayThat5dot55IsntInteger() {
        Application application = new Application();
        Assertions.assertFalse(application.isInt("5.55"));
    }
    @Test
    public void shouldSay5plus3is8() {

        Add add = new Add(LocalDateTime.now());
        Assertions.assertEquals(8, add.calculate(5,3));
    }

    @Test
    public void shouldntSay3dot2multiplied5if4(){
        Multiply multiply = new Multiply(LocalDateTime.now());
    Assertions.assertNotEquals(4,multiply.calculate(3.2,4.0));
    }

//    public void shouldHaveProperErrorMessage(){
//        Application application = new Application();
//      //  Assertions.assertFalse();
//        Assertions.assertEquals("lowerBound is bigger than upperBound!", application.run("/","5","0").getMessage);
//    }


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