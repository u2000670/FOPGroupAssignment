package csvtest;
import java.io.*;

public class CSVtest {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\T_T\\Documents\\NetBeansProjects\\CSVtest\\course module.csv";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        


    }
    
}
