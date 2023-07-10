package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DataContainer {
    private int intValue;
    private String strValue;
    private char charValue;

    public void saveToFile(String filePath) {
        //Task 1

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(this.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createLogFolder() {
        //Task 2

        File logFolder = new File("log");

        if (!logFolder.exists()) {
            boolean created = logFolder.mkdir();
            if (created) {
                System.out.println("Folder 'log' created");
            } else {
                System.out.println("Creation failed");
            }
        } else {
            System.out.println("Folder 'log' already created");
        }
    }

    public static String createLogFileName() {
        //Task 3

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String filename = "log" + File.separator + now.format(formatter) + ".log";
        return filename;
    }

    public static String createLogMessage() {
        //Task 3

        StringBuilder message = new StringBuilder();

        message.append("[")
                .append(LocalDateTime.now())
                .append("] [error]");

        return message.toString();
    }

    public static void writeToLogFile(String filename, String logMessage) {
        //Task 3

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(logMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearLogFolder() {
        //Task 4

        final int MAX_FILES_COUNT = 2;

        File logFolder = new File("log");
        File[] logFiles = logFolder.listFiles();

        if (logFiles != null && logFiles.length > MAX_FILES_COUNT) {
            Arrays.stream(logFiles)
                    .sorted()
                    .limit(logFiles.length - MAX_FILES_COUNT)
                    .forEach(File::delete);
        }

    }
}
