package com.example.przemo.myapplication;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */


public class ExampleUnitTest {

    Tax tax;

    @Before
    public void init() {
        tax = new Tax();
    }

    @Test
    public void taxFor0_isCorrect() {
        // {0 , 3000, 3091,49} => 0
        //given
        String income = "0";

        // when
        String result = tax.calculateTax("0");

        //then
        Assert.assertThat(result, is("0 zł"));
    }

    @Test
    public void taxFor3000_isCorrect() {
        // {0 , 3000, 3091,49} => 0

        //given
        String income = "3000";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("0 zł"));

    }

    @Test
    public void taxFor3091_49_isCorrect() {
        // {0 , 3000, 3091,49} => 0

        //given
        String income = "3091,49";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("0 zł"));

    }

    @Test
    public void taxFor3091_50_isCorrect() {
        // 3091,50 => 1

        //given
        String income = "3091.50";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("1 zł"));

    }

    @Test
    public void taxFor3091_51_isCorrect() {
        // 3091,50 => 1

        //given
        String income = "3091.51";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("1 zł"));

    }

    @Test
    public void taxFor50000_isCorrect() {
        // 50000 => 8444

        //given
        String income = "50000";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("8444 zł"));

    }

    @Test
    public void taxFor85528_49_isCorrect() {
        // 85528,49 => 14839,00

        //given
        String income = "85528,49";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("14839 zł"));

    }

    @Test
    public void taxFor85528_50_isCorrect() {
        // 85528,50 => 14839,00

        //given
        String income = "85528,50";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("14839 zł"));

    }

    @Test
    public void taxFor100000_isCorrect() {
        // 100000 => 19470

        //given
        String income = "100000";

        // when
        String result = tax.calculateTax(income);

        //then
        Assert.assertThat(result, is("19470 zł"));

    }
}