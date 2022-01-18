import java.util.*;
class piglatin2
{
    public static void main(String args[])
    {
        System.out.println("\u000c");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String res = sc.nextLine();
        int count = 0;
        int len = res.length();
        char ch = res.charAt(0);
        String temp = "";
        if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch== 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.println("Word remains unchanged.");
            
        }
        for(int i = 0;i<res.length();i++)
        {
             ch = res.charAt(i);
           
            if((ch!= 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch!= 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' ))
            {
                count++;
                temp = temp + ch;
               
                continue;
            }
            else if(ch== 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch== 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                String s1 = res.substring(0,i);
                res = res.substring(i);
                String ans = res + s1 + "ay";
                System.out.println("Result: "+ans);
                System.exit(0);
            }
           
       
    }
    
    if (count == len)
    {
        String rev = "";
        for(int i = len-1;i>=0;i--)
        {
            rev = rev + res.charAt(i);
           
        }
        rev = rev + "ay";
        System.out.println("Result: "+rev);
       
    }
}
}
