package hashcode2020;

// Java Program to illustrate reading from Text File 
// using Scanner Class 
import java.io.File;
import java.nio.file.FileSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

    public List<String[]> read() throws Exception {
        // pass the path to the file as a parameter 
        try {
            Scanner keyboard = new Scanner(System.in);
            //    System.out.println("inserisci il nome del file di input");
            //     String filename= keyboard.nextLine();
            File file = new File("input/inputE.in");
            Scanner sc = new Scanner(file);
            List<String[]> fileContent = new ArrayList<>();
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
                String[] elements = line.split(" ");
                fileContent.add(elements);
            }
            if (fileContent == null) {
                System.out.println("file vuoto");
                return null;
            }

            System.out.println("righe in file: " + fileContent.size());
            int i = 0;
            for (String[] element : fileContent) {
                System.out.println("Riga " + i + " contiene: ");
                for (int j = 0; j < element.length; j++) {
                    System.out.print(element[j] + " ");
                }
                System.out.print("\n");
                i++;
            };

            return fileContent;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
