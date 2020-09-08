package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CashbackHackerTestAPI {

    @Test
    void shouldRemain() {
        CashbackHacker cashback = new CashbackHacker();
        int amount = 1000;
        int actual = cashback.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotRemain() {
        CashbackHacker cashback = new CashbackHacker();
        int amount = 900;
        int actual = cashback.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }

}