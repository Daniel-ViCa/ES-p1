package org.udg.caes.banking.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

//test de la funcio credit



public class TestCreditCard {   //Entrem dins la classe de la funcio
    @Test
    void testCredit() {         //Generem la funcio del metode que volem fer el testing
        CreditCard cc = new CreditCard("test");     //Arrange (preparar)
        cc.credit(100);                         //Act (Executem - actuem el metode)
        assertEquals(100, cc.getCredit());      //Assert (verifiquem els resultats)
    }
    @Test
    void testMaxCredit() {
        CreditCard cc = new CreditCard("test");
        cc.maxCredit = 150;
        assertEquals(150, cc.getMaxCredit());
    }
}
