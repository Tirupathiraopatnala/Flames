import java.io.*;
import java.util.Scanner;
class Main {
    public static int count(String m,String f)
    {
        m = m.replaceAll("\\s+","");
        f= f.replaceAll("\\s+","");
        String min ="",max="";
        if(m.length()>f.length())
        {
            max = m;
            min = f;
        }
        else {
            min = m;
            max = f;
        }
        try{
        for (int i=0;i<min.length();i++)
        {
            for(int j=0;j<max.length();j++)
            {
                if(min.charAt(i)==max.charAt(j))
                {
                    min = charRemoveAt(min,i);
                    max = charRemoveAt(max,j);
                }
            }
        }
    }catch(Exception e)
    {
       
    }
     return min.length()+max.length();
    }
    public static String charRemoveAt(String str, int p) {  
        return str.substring(0, p) + str.substring(p + 1);  
    }  
    public static int flames(int c)
    {
        int sum =0,k =0;
        int arrsum =0;
        int value=0;
        int arr [] = {1,1,1,1,1,1};
        while(arrsum!=1)
        {
            for(int i=0;i<arr.length;i++)
            {
                sum= sum+arr[i];
                if(sum==c)
                {
                    sum=0;
                    arr[i]=0;
                    arrsum=0;
                    for(k=0;k<arr.length;k++)
                        arrsum=arrsum+arr[k];
                }
            }
        }
       for(int m =0;m<arr.length;m++)
       {
           if(arr[m]==1)
            value =m;
       }
       return value;
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Name of The Boy:");
        String st  = scan.nextLine();
        System.out.println("Enter The Name of The Girl:");
        String str = scan.nextLine();
        int cc = count(st,str);
        int index  = flames(cc);
        switch(index)
        {
            case 0:
                System.out.println("You both are \"Friends\"");
                break;
            case 1:
                System.out.println("You both are \"Lovers\"");
                break;
            case 2:
                System.out.println("You both have \"Affection\"");
                break;
            case 3:
                System.out.println("You both are \"enemies\"");
                break;
            case 4:
                System.out.println("You both are \"couple\"");
                break;
            case 5:
                System.out.println("you both are \"Brother and sisters\"");
                break;
        }
    }
}