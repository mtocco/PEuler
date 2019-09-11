package euler22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Solver {  

    public String fileReader() throws FileNotFoundException, IOException{
        FileReader file = new FileReader("/Users/michaeltocco/Google Drive/School/Computer Science/Project Euler/Project Euler Problem 022/p022_names.txt");
        BufferedReader reader = new BufferedReader(file);
        String key = "";
        String line = reader.readLine();
        while (line != null) {
        key += line;
        line = reader.readLine();
    }       
        return(key);
           
    } //Step 1
    
    public String[] splitDelim(String a) {
        String[] names = a.split(",");
        return(names);
    } // Step 2
    
    public String[] removeQuotes(String[] a) {
        
        for (int i = 0; i < a.length; i++){
            a[i] = a[i].substring(1, a[i].length() - 1);
        }
        return(a);
        
    } //Step 3
    
    public String[] sortArray(String[] a){
        Arrays.sort(a);
        for (String a1 : a) {
        }
        return(a);
        
    } //Step 4
    
    public int deterSum(String[] a){
       int accumulator = 0;
        for (int i = 0; i < a.length; i++) {
            String[] letters = splitWord(a[i]);
            accumulator += (convLetters(letters) * (i + 1));
        }
       return(accumulator);
    } //Step 5a
    
    public String[] splitWord(String word){
        String[] letters = word.split("");
        return(letters);
    } //Step 5b
    
    public int convLetters(String[] letters) {
        int a = 0;
        for (String letter : letters) {
            a += letter.charAt(0) - 64;
        }  
        return(a);
    } //Step 5c
    
    public void displayResults(int answer){
        System.out.println("The answer is: " + answer);
    } //Step 6
    
}

