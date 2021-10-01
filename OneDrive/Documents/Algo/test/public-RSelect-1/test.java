package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array[] = { };
        try {
            FileWriter outFile = new FileWriter("output");
            outFile.write(String.valueOf(c.RSelect(array, 0)));
            outFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
