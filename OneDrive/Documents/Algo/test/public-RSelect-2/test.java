package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array[] = { 101, 45, 33, 22, 57, 84, 72 ,69, 90, 14 };
        try {
            FileWriter outFile = new FileWriter("output");
            
            outFile.write(String.valueOf(c.RSelect(array, 0)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.RSelect(array, 1)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.RSelect(array, 2)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.RSelect(array, 3)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.RSelect(array, 4)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.RSelect(array, 5)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.RSelect(array, 6)));
             
            outFile.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
