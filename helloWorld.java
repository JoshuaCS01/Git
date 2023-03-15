import java.io.*;
import java.util.*;

public class helloWorld{

    public static void main (String []args){

        ArrayList<String> firstNames = new ArrayList<String>(); 
        ArrayList<String> lastNames = new ArrayList<String>(); 

        firstNames.add("Joshua");
        lastNames.add("Cherenfant");

        lastNames.add("Smith");
        lastNames.remove(lastNames.size()-1);
        for(int i = 0; i < firstNames.size(); i++){
        System.out.println(firstNames.get(i) + " " + lastNames.get(i));

        }
    }
}