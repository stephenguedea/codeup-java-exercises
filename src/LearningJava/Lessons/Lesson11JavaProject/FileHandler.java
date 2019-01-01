package LearningJava.Lessons.Lesson11JavaProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;

public class FileHandler {

    public LinkedList<Member> readFile() {
        LinkedList<Member> m = new LinkedList<>();
        String lineRead;
        String[] splitLine;
        Member mem;

        try (BufferedReader reader = new BufferedReader(new FileReader("./data/ClubMembers/members.csv"))) {
            // Code inside try block

            lineRead = reader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");

                if (splitLine[0].equals("S")){
                    // Instantiate a SingleMember
                    mem = new SingleClubMember('S', Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                } else {
                    // Instantiate a MultiClubMember
                    mem = new MulitClubMember('M', Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }

                m.add(mem);
                lineRead = reader.readLine();
            }
        } catch (IOException e) {
            // Code inside catch block
            System.out.println(e.getMessage());
        }
        return m;
    }
    public void appendFile(String mem){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/ClubMembers/members.csv", true))) {
            writer.write(mem + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overWriteFile(LinkedList<Member> m){
        String s;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./data/ClubMembers/members.temp", false))){
            for (int i = 0; i < m.size(); i++) {
                s = m.get(i).toString();
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            File f = new File("./data/ClubMembers/members.csv");
            File tf = new File("./data/ClubMembers/members.temp");
            f.delete();
            tf.renameTo(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
