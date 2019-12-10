package structure.throwException;

import java.io.*;
import java.util.Arrays;

public class IoOutput {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("D:\\aaa.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("D:\\bbb.txt"));
        String str;
        while ((str=bfr.readLine())!=null){
            bfw.write(str);
            bfw.newLine();
        }
        bfr.close();
        bfw.close();
    }
}
