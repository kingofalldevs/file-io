import java.io.*;



public class Main {
    public static void main(String[] args) {
        String path ="/Users/APPLE/Desktop/test/output.txt";

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("Success");
            bw.close();
        } catch  (Exception ex){
            return;
        }
    }






}
