/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author koide
 * @author JAEYUN
 */
public class CalculatorTest {
    /**
     * Multiply test
     * 対象: multiply
     * 条件: 引数 20, 10
     * 期待する値: 200
     * 
     */
    @Test
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(20, 10);
        assertEquals(expected, actual);
    }
    
     /**
     * Multiply test
     * 対象: multiply
     * 条件: 引数 20, -10
     * 期待する値: 200
     * 
     */
    @Test
    public void testMultiply02() throws Exception {
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(20, -10);
        assertEquals(expected, actual);
    }    
     /**
     * Multiply test
     * 対象: multiply
     * 条件: 引数 -20, 0
     * 期待する値: 200
     * 
     */
    @Test
    public void testMultiply03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(-20, 0);
        assertEquals(expected, actual);
    }
 
     /**
     * Multiply test
     * 対象: max
     * 条件: 引数 10, 20, 30
     * 期待する値: 200
     * 
     */
    @Test
    public void testMax01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        assertEquals(expected, actual);
    }
    
     /**
     * Multiply test
     * 対象: max
     * 条件: 引数 10, 30, 20
     * 期待する値: 200
     * 
     */
    @Test
    public void testMax02() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 30, 20);
        assertEquals(expected, actual);
    }    
    
     /**
     * Multiply test
     * 対象: max
     * 条件: 引数 20, 10, 30
     * 期待する値: 200
     * 
     */
    @Test
    public void testMax03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 10, 30);
        assertEquals(expected, actual);
    }
    
     /**
     * Multiply test
     * 対象: max
     * 条件: 引数 20, 30, 10
     * 期待する値: 200
     * 
     */
    @Test
    public void testMax04() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        assertEquals(expected, actual);
    }
     /**
     * Multiply test
     * 対象: max
     * 条件: 引数 30, 10, 20
     * 期待する値: 200
     * 
     */
    @Test
    public void testMax05() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 10, 20);
        assertEquals(expected, actual);
    }
    
     /**
     * Multiply test
     * 対象: max
     * 条件: 引数 30, 20, 10
     * 期待する値: 200
     * 
     */
    @Test
    public void testMax06() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        assertEquals(expected, actual);
    }
}
