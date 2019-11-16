import java.util.*;
public class ArrayListTest {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi"); //Adding object in arraylist
        list.add("Vijay");
        list.add("hell");
        list.add("Ajay");
        list.add("Bill");
        list.add("Geo");

        // print list using...
        System.out.println("Traversing list through Iterator:");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
