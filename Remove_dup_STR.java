import java.util.*;
class RemoveDup{
    //program for remove duplicates from a string
    public static void main(String args[])
    {  //apporach 1
        System.out.println("Enter a String :");
        Scanner ob = new Scanner(System.in);
        String str = ob.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ;i<str.length();i++)
        {
            char ch = str.charAt(i);
            int ind = str.indexOf(ch,i+1);
            if(ind ==-1)
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);

     //Approach 2
     StringBuilder sb1 =new StringBuilder();
     str.chars().distinct().forEach(c->sb1.append((char)c));
     System.out.println(sb1);
    }
}