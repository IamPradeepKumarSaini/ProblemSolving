import java.util.*;
public class hashSet {
public static void main(String args[]){
    HashSet<Object> hashset = new HashSet<Object>();
    hashset.add(2);
    hashset.add("quora");
    hashset.add("in");
    hashset.add("quora"); // duplicate elements
    hashset.add("anyforum");
    System.out.println("Set is "+hashset);
    System.out.println(hashset.size());
}
}
