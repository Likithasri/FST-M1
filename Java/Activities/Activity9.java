package activities;


import java.util.ArrayList;

public class Activity9 {
public static void main(String[] args) {
    
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("JAVA");
    myList.add("APPIUM");
    myList.add("SQL");
    myList.add("SELENIUM");
    myList.add("API");
    
    System.out.println("Print All the Objects:");
    for(String str:myList){
        System.out.println(str);
    }
    
    System.out.println("3rd element in the list is: " + myList.get(2));
    System.out.println("Is element is in list: " + myList.contains("API"));
    System.out.println("Size of ArrayList: " + myList.size());
    
    myList.remove("APPIUM");
    
    System.out.println("New Size of ArrayList: " + myList.size());
}
}