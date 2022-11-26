package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRightAmount() {
        int amount = 3950;
        int expected = 50;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void shouldWithoutAmount() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAmountExactly1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }


}