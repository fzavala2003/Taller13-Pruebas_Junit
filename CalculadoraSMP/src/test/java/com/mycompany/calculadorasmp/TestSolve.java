/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorasmp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author zaval
 */
public class TestSolve {
    @Test
    public void testSolveSimpleAddition() {
        String formula = "2+3";
        String result = Operations.Solve(formula);
        assertEquals("2+3=5", result);
    }

    @Test
    public void testSolveSimpleSubtraction() {
        String formula = "7-4";
        String result = Operations.Solve(formula);
        assertEquals("7-4=3", result);
    }

    @Test
    public void testSolveSimpleMultiplication() {
        String formula = "6*3";
        String result = Operations.Solve(formula);
        assertEquals("6*3=18", result);
    }

    @Test
    public void testSolveSimpleDivision() {
        String formula = "12/4";
        String result = Operations.Solve(formula);
        assertEquals("12/4=3", result);
    }

    // Test para Solve con precedencia de operadores
    @Test
    public void testSolveOperatorPrecedence() {
        String formula = "6+2*3";
        String result = Operations.Solve(formula);
        assertEquals("6+2*3=12", result); // Verifica que se resuelva la multiplicación primero
    }

    @Test
    public void testSolveOperatorPrecedence2() {
        String formula = "8-4/2";
        String result = Operations.Solve(formula);
        assertEquals("8-4/2=6", result); // Verifica que se resuelva la división primero
    }

    // Test para Solve con números más grandes
    @Test
    public void testSolveLargeNumbers() {
        String formula = "1000+2000-500";
        String result = Operations.Solve(formula);
        assertEquals("1000+2000-500=2500", result);
    }

}
