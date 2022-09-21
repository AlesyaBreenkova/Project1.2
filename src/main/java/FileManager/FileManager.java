package FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileManager {

    public static void main(String[] args) {

        String file = "LegionFile.txt";

        FileManager fileManager = new FileManager();

        fileManager.createFile(file);

        fileManager.writeToFile(file, "Shall I compare thee to a summer’s day?\n" +
                "Thou art more lovely and more temperate.\n" +
                "Rough winds do shake the darling buds of May,\n" +
                "And summer’s lease hath all too short a date.\n" +
                "Sometime too hot the eye of heaven shines,\n" +
                "And often is his gold complexion dimmed;\n" +
                "And every fair from fair sometime declines,\n" +
                "By chance, or nature’s changing course, untrimmed;\n" +
                "But thy eternal summer shall not fade,\n" +
                "Nor lose possession of that fair thou ow’st,\n" +
                "Nor shall death brag thou wand'rest in his shade,\n" +
                "When in eternal lines to Time thou grow'st.\n" +
                "    So long as men can breathe, or eyes can see,\n" +
                "    So long lives this, and this gives life to thee.");

        fileManager.readFromFile(file);
        fileManager.deleteFile(file);
    }

    public int createFile(String fileName) {

        File file = new File(fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    public void writeToFile(String fileName, String text) {

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error, cannot write ...");
            throw new RuntimeException(e);
        }
    }


    public void readFromFile(String fileName) {

        File file = new File(fileName);

        try {
            Scanner scanner = new Scanner(file);
//        while(scanner.hasNextLine()){
//        String row = scanner.nextLine();
//            System.out.println(row);
//        } // another way to do the same using the For-loop

            for (int i = 0; scanner.hasNextLine(); i++) {
                String row = scanner.nextLine();
                System.out.println(i);
                System.out.println(row);
            }

            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {

            file.delete();
        }
    }

}




