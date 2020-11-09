package com.ptuor.company.hierarchy;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class LineManagerTest {


    @Test
    public void createLineManager_getName_shouldReturnCorrectName() {
        LineManager lineManager = new LineManager("Robert C. Martin", "Software Development");

        String name = lineManager.getName();

        Assert.assertEquals("Robert C. Martin", name);
    }

    @Test
    public void createLineManager_getNumberOfEmployees_shouldReturn1() {
        LineManager lineManager = new LineManager("Robert C. Martin", "Software Development");

        Integer numberOfEmployees = lineManager.getNumberOfEmployees();

        Assert.assertTrue(numberOfEmployees.equals(1));
    }



    @Test
    public void createLineManagerAndAddEmployees_getNumberOfEmployees_shouldReturn2() {
        LineManager lineManager = new LineManager("Robert C. Martin", "Software Development");
        lineManager.add(new AtomicEmployee("Rudolf"));

        Integer numberOfEmployees = lineManager.getNumberOfEmployees();

        Assert.assertTrue(numberOfEmployees.equals(2));
    }


    @Test
    public void createLineManagerAndAddTwoEmployees_getNumberOfEmployees_shouldReturn3() {
        LineManager lineManager = new LineManager("Robert C. Martin", "Software Development");
        lineManager.add(new AtomicEmployee("Rudolf"));
        lineManager.add(new AtomicEmployee("Hansueli"));

        Integer numberOfEmployees = lineManager.getNumberOfEmployees();

        Assert.assertTrue(numberOfEmployees.equals(3));
    }

    @Test
    public void createLineManager_AddLineManagerWithTwoEmployees_getNumberOfEmployees_shouldReturn4() {
        LineManager lineManager = new LineManager("Rudolf", "Head of Front End Development");
        lineManager.add(new AtomicEmployee("Hans"));
        lineManager.add(new AtomicEmployee("Ruedi"));

        LineManager head = new LineManager("Robert C. Martin", "Head Software Development");
        head.add(lineManager);

        Integer numberOfEmployees = head.getNumberOfEmployees();

        Assert.assertTrue(numberOfEmployees.equals(4));
    }

    @Test
    public void createLineManager_printWithTwoWhitespaces_printsWhitespacesAndLineManagerName() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String whitespacesBeforeName = "  ";
        LineManager lineManager = new LineManager("A. Müller", "Vorstand");

        lineManager.print(whitespacesBeforeName);

        Assert.assertEquals(whitespacesBeforeName + "Linemanager A. Müller (Vorstand)", outputStreamCaptor.toString().replaceAll("\\s+$", ""));
    }

    @Test
    public void createLineManager_printWithoutWhitespaces_printsLineManagerName() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String whitespacesBeforeName = "";
        LineManager lineManager = new LineManager("Ruedi", "Entwicklung");

        lineManager.print(whitespacesBeforeName);

        Assert.assertEquals(whitespacesBeforeName + "Linemanager Ruedi (Entwicklung)", outputStreamCaptor.toString().replaceAll("\\s+$", ""));
    }


    @Test
    public void createLineManager_printWithOneWhitespaces_printsWhitespacesAndLineManagerName() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        String whitespacesBeforeName = " ";
        LineManager lineManager = new LineManager("Ruedi", "Entwicklung");

        lineManager.print(whitespacesBeforeName);

        Assert.assertEquals(whitespacesBeforeName + "Linemanager Ruedi (Entwicklung)", outputStreamCaptor.toString().replaceAll("\\s+$", ""));
    }

}