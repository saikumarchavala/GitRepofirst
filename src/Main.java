import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
public static void main(String[] args) {
 ArrayList<Integer> al=new ArrayList<Integer>();
 al.add(10);
 al.add(20);
 al.add(20);
 al.add(40);
 al.add(50);
 al.add(60);
 System.out.println("value of al:"+al);
 ArrayList<Integer> al2=new ArrayList<Integer>();
 al2.add(30);
 al2.add(40);
 al2.add(30);
 System.out.println(al2);
 ArrayList<String> al1=new ArrayList<String>();
 al1.add("Begumpet");
 al1.add("Ameerpet");
 al1.add("shyamlal");
 al1.add("Prakash nagar");
 System.out.println("value of al1:"+al1);
// al1.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
 System.out.println(al1);
 System.out.println(al1.size());
 System.out.println(al1.get(1));
 System.out.println(al.remove(1));
 System.out.println(al);
 System.out.println("After sorting Order:");
 Collections.sort(al);
 //System.out.println(al);
 //System.out.println(al.size()-1);
 //Collections.sort(al);
 //System.out.println(al.get(al.size()-3));
// System.out.println(al.get(2));
 //System.out.println(al.get(al.size()-1));
 //System.out.println(al1.get(al1.size()-2));
 



 
 
 
 

	}

}
