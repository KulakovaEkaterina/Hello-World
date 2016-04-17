
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ekaterina
 */
public class DataLoader {
    
    String _fileName = "";
    ArrayList<ArrayList<String>> _data = new ArrayList<>();
    int [][] matrix;        
    int N;
    
    public DataLoader (String fileName){
        _fileName = fileName;
        readData();
    }

    void readData(){
        File file = new File(_fileName);
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(file));
            String text = null;
            String[] dataArray;
            ArrayList<String> data;
            reader.readLine();
            //data = reader.readLine().split("\\s");
            while ((text = reader.readLine()) != null){
                dataArray = text.split("\\s");
                data = new ArrayList<>(Arrays.asList(dataArray));
                _data.add(data);
            }   
            N = _data.size();
        } catch (FileNotFoundException e){
        } catch (IOException e){
        }finally{
        try{
            if (reader != null){
                reader.close();
            }
        }catch (IOException e){
        }
        } 
        
        System.out.println("Reading data is done!");
    }
    
    ArrayList<ArrayList<String>> getData(){
       return _data;
    }
}
