package myjavaexamples.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tryblocknocatch {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/test.txt"));) {
            String str;
            while((str=reader.readLine())!=null){
                System.out.println(str);
            }

        }
    }
}
