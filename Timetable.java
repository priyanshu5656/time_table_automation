import java.util.*; 
public class Timetable{
    private String name;
    String Table[][] = new String[5][9];  
    void setName(String name){
        this.name=name;
    } 
    String getName(){
        return this.name;
    }
}