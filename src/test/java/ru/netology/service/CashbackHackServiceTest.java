package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRightAmount() {
        int amount = 3950;
        int expected = 50;
        int actual = service.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldWithoutAmount() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountExactly1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }


}