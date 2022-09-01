package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void calculateBonus() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 50;

        int expected = 950;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateBonus2() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 10000;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateBonus3() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateBonus4() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -50;

        int expected = 1050;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateBonus5() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;

        int expected = 1000;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void calculateBonus6() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = cashbackHackService.remain(amount);

        assertEquals(expected, actual);

    }
}