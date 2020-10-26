import org.apache.commons.csv.*; // apache's oslibrary for csv.
import edu.duke.*; //dukelearn program
import java.io.File;

//ilkeratik.com
public class hottestday{

    public static CSVRecord theday(FileResource fr){ //finds the biggest value in a particular file
       
        double currHigh, currVal; //will be used for compare values among records
        CSVParser csv = fr.getCSVParser(); //creating csvparser from file resource
        CSVRecord highest = null;
        
        for (CSVRecord rec : csv){
            if(highest == null){
                highest = rec;
            }
            else {
                currVal = Double.parseDouble(rec.get("TemperatureF"));
                currHigh = Double.parseDouble(highest.get("TemperatureF"));
                if (currVal > currHigh){ //checks whether currVal is bigger than last highest point.
                    highest = rec;
                }

            }
        }
        return highest;
    }

    public static void largest_multiple(){ //checks multiple(many) files to find biggest value
        CSVRecord largest = null;
        DirectoryResource dr = new DirectoryResource();

        //interesting stuff here is the csvrecord works regardless to parser or file. you can check all files like they only one file, for find a csv record that you need.
        CSVRecord currHigh = null, currVal = null;
        for(File f : dr.selectedFiles()){
            FileResource fr = new FileResource(f);

            currVal = theday(fr);
            if(currHigh == null){//same process of comparing values
                currHigh = currVal;
            }
            else {
                double curv = Double.parseDouble(currVal.get("TemperatureF"));
                double curh = Double.parseDouble(currHigh.get("TemperatureF"));

                if(curv > curh){
                    currHigh = currVal;
                }                                 
            }
        }

        System.out.println("date:" +currHigh.get("DateUTC") +"time:"+ currHigh.get("TimeEDT")  +" temp was:"  +currHigh.get("TemperatureF"));

    }

    public static void main (String args[]){
        largest_multiple();            

    }


}
