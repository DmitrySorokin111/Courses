package io;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IOTest {

    @Test
    void test1()
    {
        DataContainer data = new DataContainer(1, "abc", 'k');
        data.saveToFile("io.txt");

        System.out.println("data saved to io.txt");
    }

    @Test
    void test2()
    {
        DataContainer.createLogFolder();

        //Логика программы...
    }

    @Test
    void test3()
    {
        DataContainer.createLogFolder();

        String logFileName = DataContainer.createLogFileName();
        String logMessage = DataContainer.createLogMessage();

        DataContainer.writeToLogFile(logFileName, logMessage);
    }

    @Test
    void test4()
    {
        DataContainer.createLogFolder();

        String logFileName = DataContainer.createLogFileName();
        String logMessage = DataContainer.createLogMessage();

        DataContainer.writeToLogFile(logFileName, logMessage);
        DataContainer.clearLogFolder();
    }
}