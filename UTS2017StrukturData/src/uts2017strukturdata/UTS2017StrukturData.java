/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2017strukturdata;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class UTS2017StrukturData {
public static void main(String[] args) {
    System.out.println("DEPARTEMEN TEKNIK KOMPUTER");
    System.out.println("UNIVERSITAS DIPONEGORO");
        // TODO code application logic here
double[] myList={1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5};
for (int i=0; i<myList.length; i++){
    System.out.println(myList[i]+"");
}
double total=0;
for (int i=0; i<myList.length; i++){
    total+= myList[i];
}
System.out.println("Total is " +total);
double max=myList[0];
for (int i=0; i<myList.length;i++){
    if (myList[i]>max) max=myList[i];
}
    System.out.println("Max is " +max);;
    

ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
arrlist.add(123);
arrlist.add(234);
arrlist.add(345);
arrlist.add(456);
arrlist.add(678);

for (Integer number : arrlist){
    System.out.println("number= " +number);
}
Object[] ob=arrlist.toArray();
    System.out.println("");
    System.out.println("Printing elements from first to last: ");
for (Object value : ob){
    System.out.println("Number = "+value);
}
}
}
