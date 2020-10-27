import org.apache.commons.csv.*; // apache's oslibrary for csv.
import edu.duke.*; //dukelearn program
import java.io.File;

//ilkeratik.com
public class hottestday{

    public static CSVRecord theday(FileResource fr){ //finds the biggest value in a particular file

        CSVParser csv = fr.getCSVParser();
        CSVRecord currHigh = null, currVal = null;
        
        for (CSVRecord rec : csv){
            currHigh = compare_two(currHigh, rec);
        }
        return currHigh;
    }
    public static CSVRecord compare_two(CSVRecord currHigh, CSVRecord currVal){//refactored version of the common operation
        
        if(currHigh == null){
            currHigh = currVal;
        }
        else {
            double curv = Double.parseDouble(currVal.get("TemperatureF"));
            double curh = Double.parseDouble(currHigh.get("TemperatureF"));

            if(curv > curh){//checks whether currVal is bigger than last highest point.
                currHigh = currVal;
            }                                 
        }
        return currHigh;
    }

    public static void largest_multiple(){ //checks multiple(many) files to find biggest value
        CSVRecord largest = null;
        DirectoryResource dr = new DirectoryResource();

        //interesting stuff here is the csvrecord works regardless to parser or file. you can check all files like they only one file, for find a csv record that you need.
        CSVRecord currHigh = null, currVal = null;
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);

            currVal = theday(fr);
            currHigh = compare_two(currHigh, currVal);
           
        }
        System.out.println("date:" +currHigh.get("DateUTC") +" time:"+ currHigh.get("TimeEST")  +" temp was:"  +currHigh.get("TemperatureF"));
    }

    public static void main (String args[]){
        largest_multiple();            
    }
}

