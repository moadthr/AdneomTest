package main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * You can build this Maven project to use it in other application
 * This main method shown an example of the partition result
 *
 * @author Mouad Tahiri
 */
public class Application {
    public static List<? extends Object> list = new ArrayList<Object>(
            Arrays.asList(1,2,3,4,5,6,7));


    public static void main(String[] args) {
        // here is an exemple to print the sub-lists into the console
        List<List<?>> result = Application.partition(list,2);
        result.forEach(System.out::println);

    }
    public static List<List<?>> partition(List<?> list , int size){
        if(list == null || size <= 0 || list.isEmpty()){
            return null;
        }
        else if(size >= list.size()){
            return Arrays.asList(list);
        }
        List<List<?>> result = new ArrayList<>();
        for(int i=0; i<list.size();i=i+size){
            if(i+size> list.size()){
                result.add(list.subList(i,list.size()));
            }
            else{
                result.add(list.subList(i,i+size));
            }
        }
        return result;
    }
}
