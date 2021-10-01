package p0;

import java.io.FileWriter;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        Solution c = new Solution();
        int array[] = { 127,327,77,97,497,587,287,317,557,87,197,
        297,547,107,377,597,217,367,417,507,137,307,667,277,677,
        477,627,237,347,407,517,227,207,487,117,427,527,717,7,
        647,687,657,187,67,457,57,147,637,337,267,27,357,167,47,
        397,177,707,537,467,607,17,247,257,617,157,437,567 };
        try {
            FileWriter outFile = new FileWriter("output");
            
            outFile.write(String.valueOf(c.DSelect(array, 0)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.DSelect(array, 60)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.DSelect(array, 30)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.DSelect(array, 20)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.DSelect(array, 10)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.DSelect(array, 50)));
            outFile.write(", ");
            outFile.write(String.valueOf(c.DSelect(array, 5)));
             
            outFile.close();

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
