package OtherTopics;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OtherTopicsMain {

    public static void main(String[] args) {
        //exception - an event that occurs during the execution of a program and interrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        int divisionResult;

       /* while (true) {
            //try division and catch possible errors
            try {
                System.out.print("Enter a whole number to divide: ");
                numerator = scanner.nextInt();

                System.out.print("Enter a whole number to divide by: ");
                denominator = scanner.nextInt();

                divisionResult = numerator / denominator;
                System.out.println("Division result is " + divisionResult);

                break;
            }
            catch (InputMismatchException e){
                System.out.println("Input is not correct");
            }
            catch (ArithmeticException e) {
                System.out.println("You can't divide by 0");
            }
            finally {
                scanner.nextLine(); //in case input is not correct
            }
        }

        */

        //File class (writing and reading from file)
        File file = new File("C:\\Users\\Szymon\\Desktop\\JAVA\\BroCode\\src\\OtherTopics\\text.txt");
        if (file.exists()){
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //System.out.println(file.delete());
        }
        else{
            System.out.println("That file does not exist.");
        }

        //Writing to a File
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello, I'm testing file writing!\nAdding a new line\nTrying something new\n");
            fileWriter.append("Trying to append some new stuff");
            System.out.println("Im here");
            fileWriter.close();
        }
        catch (IOException e){
            System.out.println("No such file!");
        }

        //Reading from a file
        //1st method
        char[] fileContent = new char[(int)file.length()];
        try{
            FileReader fileReader = new FileReader(file);

            if (file.isFile()){
                fileReader.read(fileContent);
            }

            System.out.println(fileContent);
        }
        catch (IOException e){
            System.out.println("No such file or directory!");
        }

        System.out.println();

        //2nd method
        String readContentNew;
        try {
            FileReader fileReaderNew = new FileReader(file);
            int data = fileReaderNew.read();

            while (data != -1){
                System.out.print((char)data);
                data = fileReaderNew.read();
            }
            fileReaderNew.close();
        }
        catch (IOException e) {
            System.out.println("No such file!");
        }
    }
}

