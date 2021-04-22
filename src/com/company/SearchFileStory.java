package com.company;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SearchFileStory {
    public void func1(String fname) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fname));
        String string1;
        String[] result;
        while ((string1 = br.readLine()) != null) {
            string1 = string1.trim().replace("\\s+", " ").replace(".", " ").replace("?", " ").replace("!", " ");
          result= string1.split(" ");
            for (int i = 0; i < result.length; i++)
                result[0]=result[i];

           // System.out.println(result);

            HashMap<String, Integer> wordCount = new HashMap<>();
            for(String word : (result)){
                if(wordCount.containsKey(word)&&word.length()>1){
                    wordCount.put(word, wordCount.get(word)+1);
                }
                else
                    {
                    wordCount.put(word, 1);
                }
            }
            SortedSet sortedSet= new TreeSet();
           //SortedSet<String> wordsInString;
            //wordsInString= (SortedSet<String>) wordCount.keySet();
            Set<String> wordsInString = wordCount.keySet();

            for(String word1 : wordsInString
                    ){
                if(wordCount.get(word1)>1){
                    System.out.println(word1.toLowerCase(Locale.ROOT)+":  "+wordCount.get(word1));
                }
            }
       }
    }
}






