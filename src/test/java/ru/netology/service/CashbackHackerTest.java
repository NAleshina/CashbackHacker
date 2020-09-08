package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackerTest {

    @Test
    public void shouldRemain() {
        CashbackHacker cashback = new CashbackHacker();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotRemain() {
        CashbackHacker cashback = new CashbackHacker();
        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
}