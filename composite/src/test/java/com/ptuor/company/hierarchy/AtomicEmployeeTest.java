package com.ptuor.company.hierarchy;

import com.iluwatar.composite.Messenger;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AtomicEmployeeTest {

    @Test
    public void createEmployee_getName_shouldReturnCorrectName() {
        AtomicEmployee employee = new AtomicEmployee("M. Rehberg");

        String name = employee.getName();

        Assert.assertEquals("M. Rehberg", name);
    }

    @Test
    public void createEmployee_getNumberOfEmployees_shouldReturn1() {
        AtomicEmployee employee = new AtomicEmployee("O. Riedel");

        Integer numberOfEmployees = employee.getNumberOfEmployees();

        Assert.assertTrue(numberOfEmployees.equals(1));
    }


    @Test
    public void createEmployee_printWithTwoWhitespaces_printsWhitespacesAndEmployeeName() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String whitespacesBeforeName = "  ";
        AtomicEmployee employee = new AtomicEmployee("O. Riedel");

        employee.print(whitespacesBeforeName);

        Assert.assertEquals(whitespacesBeforeName + "O. Riedel", outputStreamCaptor.toString().replaceAll("\\s+$", ""));
    }


    @Test
    public void createEmployee_printWithoutWhitespaces_printsWhitespacesAndEmployeeName() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String whitespacesBeforeName = "";
        AtomicEmployee employee = new AtomicEmployee("O. Riedel");

        employee.print(whitespacesBeforeName);

        Assert.assertEquals(whitespacesBeforeName + "O. Riedel", outputStreamCaptor.toString().replaceAll("\\s+$", ""));
    }


    @Test
    public void createEmployee_printWithoutOneWhitespaces_printsWhitespacesAndEmployeeName() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String whitespacesBeforeName = " ";
        AtomicEmployee employee = new AtomicEmployee("O. Riedel");

        employee.print(whitespacesBeforeName);

        Assert.assertEquals(whitespacesBeforeName + "O. Riedel", outputStreamCaptor.toString().replaceAll("\\s+$", ""));
    }
}