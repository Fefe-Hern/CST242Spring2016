package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class StockFiler {
    private static File file;
    private static FileReader read; 
    private static BufferedReader br;
    
    public static void generateFile() {
        try {
            file = new File("DJIA.txt");
            read = new FileReader(file);
            br = new BufferedReader(read);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StockFiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String readLine() throws IOException {
        return br.readLine();
    }
    public static void closeFile() {
        try {
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(StockFiler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
