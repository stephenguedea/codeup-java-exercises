package LearningJava.Lessons.Lesson9FileHandling;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {
        // READING FROM A FILE
        String line;
        BufferedReader reader = null;
        try
        {
            // "Wrapping a BufferedReader object around a FileReader object"
            // IMPORTANT: the BufferedReader object needs to know what data stream to buffer
            reader = new BufferedReader(new FileReader("./data/info.txt/myFile.txt"));
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        // WRITING TO A TEXT FILE...
        String text = "Hello World!";

        // IF THE TEXT FILE DOESN'T EXIST OR TO APPEND...
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/info.txt/myFile2.txt", true))) {
//            writer.write(text);
//            writer.newLine();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        String overwriteText = "Hello from Overwrite!";
        // IF THE TEXT FILE EXISTS AND WANT TO OVERWRITE IT...
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/info.txt/myFile2.txt"))) {
//            writer.write(overwriteText);
//            writer.newLine();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        // RENAMING A TEXT FILE...
        File f = new File("./data/info.txt/myFile.txt");
        File nf = new File("./data/info.txt/newFileName.txt");
//        f.renameTo(nf);

        // DELETING A TEXT FILE..
        nf.delete();
    }
}

/* NOTES:
try-catch-finally statement is used to handle the file operations

 */