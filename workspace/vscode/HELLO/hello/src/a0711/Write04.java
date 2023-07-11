package a0711;

import java.io.IOException;
import java.io.PrintWriter;

public class Write04 {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("d:/out.txt");
        for (int i = 1; i < 11; i++) {
            String data = i + " 번째 줄입니다.";
            pw.write(data);
        }
        pw.close();
    }
}
