//  2. Написать программу, которая скопирует несколько файлов в один.

import java.io.*;

public class ConcatFiles {
    public static void main(String args[]) throws Exception {
        FileInputStream file1 = new FileInputStream("g:\\1.txt");
        FileInputStream file2 = new FileInputStream("g:\\2.txt");
        FileOutputStream fileOut = new FileOutputStream("g:\\3.txt");
        SequenceInputStream sis = new SequenceInputStream(file1, file2);
        int i = 0;
        while ((i = sis.read()) != -1) {
            fileOut.write(i);
        }
        sis.close();
        fileOut.close();
        file1.close();
        file2.close();
    }
}