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
        System.out.println("\nTraversing Array list through Iterator:");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Linked List claass

        LinkedList<String> al=new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        System.out.println("\nTraversing Linked list through Iterator:");
        //Traversing list through Iterator
        Iterator itrL=al.iterator();
        while(itrL.hasNext()){
            System.out.println(itrL.next());
        }

        //custom implementation

        //Creating user-defined class objects
        Student s1=new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);
        //creating arraylist
        ArrayList<Student> students=new ArrayList<Student>();
        students.add(s1);//adding Student class object
        students.add(s2);
        students.add(s3);

        System.out.println("\nCustom array list here-");
        //Getting Iterator
        Iterator stringIterator=students.iterator();
        //traversing elements of ArrayList object
        while(stringIterator.hasNext()){
            Student st=(Student)stringIterator.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }


    }
}

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
