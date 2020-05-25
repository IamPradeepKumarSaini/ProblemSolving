import java.util.*;
public class hashMap {
    public static void main(String args[]){

        HashMap<Integer,String> map = new HashMap<Integer,String>();

        System.out.println("Initial list of elements: "+map);
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        System.out.println("After invoking put() method ");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" - "+m.getValue());
        }

        map.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" -- "+m.getValue());
        }

        HashMap<Integer,String> map1=new HashMap<Integer,String>();

        map1.put(104,"Ravi");
        map1.putAll(map);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

