import java.util.*;
public class Course{
    private String name;
    private int credits;
    private ArrayList<String> professors = new ArrayList<String>();
    void setName(String name){
        this.name = name;
    }
    void setCredits(int d){
        this.credits=d;
    }
    String getName(){
        return this.name;
    }
    int getCredits(){
        return this.credits;
    }
    void addProfs(String prof){
        this.professors.add(prof);
    }
    int getProfsSize(){
        return this.professors.size();
    }
    String getProfsItem(int item){
        return this.professors.get(item);
    }
}