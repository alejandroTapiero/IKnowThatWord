package myProject;

import java.io.*;

public class FileManager {
    public static final String PATH = "src/myProject/files/diccionario.txt";
    private FileReader fileReader;
    private BufferedReader input;
    private FileWriter fileWriter;
    private BufferedWriter output;

    public String lecturaFile(){
        String texto = "";

        try {
            fileReader = new FileReader(PATH);
            input = new BufferedReader(fileReader);
            String line = input.readLine();
            while(line!=null){
                texto+=line;
                texto+="\n";
                line = input.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
