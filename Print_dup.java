import java.util.*;
public class Print_dup {
    public static void main(String[] args) {
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
                System.out.print(ch);
            }
            
        }
        

    }
}
