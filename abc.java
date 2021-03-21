import java.util.*;
class Occurence{
     public static void main(String[] args) {
     int []arr=new int[10];
     int count=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your array values");
     for(int i=0;i<arr.length;i++)
     {
         arr[i]=sc.nextInt();
     }   
     System.out.format("arr=",arr);
     for(int i=0;i<(arr.length);i++)
     {
         System.out.println("occurence of integer is:"+arr[i]+" "+count);
         for(int j=0;j<(arr.length);j++)
         {
             if(arr[i]==arr[j]){
                 count++;

             }
            }
         count=0;
        }
    }
}