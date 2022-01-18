import java.util.*;
public class cipher
{
public static void main(String args[])
{
    System.out.println("\u000c");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your text: ");
    String str = sc.nextLine();
    System.out.println("Would you like to decrypt something or encrypt something?(1/2)");
    int res = sc.nextInt();
    if(res == 2)
    {
    System.out.println("What is the key you would like to use? (No negative keys)");
    int key = sc.nextInt();
    if(key<0)
    {
        System.out.println("INVALID KEY");
        System.exit(0);
    }
    int L = str.length();
    String crypt = "";
    
        for(int i = 0;i<=(L-1);i++)
        {
            char letter = str.charAt(i);
            int asc = (int)letter;
            if(asc >= 65 && asc <=90)
            {
                if(asc + key > 90)
                {
                  asc = ((asc+(key-1))-90)+65;
                  crypt+= (char)asc;
                }
                else
                {
                    asc+=key;
                    crypt+=(char)asc;
                }
               
            }
            else if(asc >= 97 && asc <=122)
            {
                if(asc + key > 122)
                {
                  asc = ((asc+(key-1))-122)+97;
                  crypt+=(char)asc;
                }
                else
                {
                    asc+=key;
                    crypt+=(char)asc;
                }
               
            }
            else
            {
                crypt +=(char)asc;
            }
        }
    
    System.out.println("The encrypted text is: "+crypt);
}

else if(res==1)
{
    System.out.println("Do you have a key to reference it with? (1 for yes/2 for no)");
    int res2 = sc.nextInt();
    if(res2 == 1)
    {
        System.out.println("What key would you like to use? (No negative keys)");
        int key = sc.nextInt();
        if(key<0)
        {
            System.out.println("INVALID KEY");
            System.exit(0);
        }
        int L = str.length();
        String crypt = "";
        for(int i = 0;i<=(L-1);i++)
        {
            char letter = str.charAt(i);
            int asc = (int)letter;
            if(asc >= 65 && asc <=90)
            {
                if(asc + key >90)
                {
                  asc = ((asc+(key-1))-90)+65;
                  crypt+= (char)asc;
                }
                else
                {
                    asc+=key;
                    crypt+=(char)asc;
                }
               
            }
            else if(asc >= 97 && asc <=122)
            {
                if(asc + key > 122)
                {
                   
                  asc = ((asc+(key-1))-122)+97;
                  
                  crypt+= (char)asc;
                }
                else
                {
                    asc+=key;
                    crypt+=(char)asc;
                }
               
            }
            else
            {
                crypt+=(char)asc;
            }
        }
    
    System.out.println("The decrypted text is: "+crypt);
    }
    else if(res2 == 2)
    {
        int L = str.length();
        String crypt = "";
        System.out.println("Possible decryptions: ");
        for(int j = 1;j<=25;j++)
        {
         for(int i = 0;i<=(L-1);i++)
        {
            char letter = str.charAt(i);
            int asc = (int)letter;
            if(asc >= 65 && asc <=90)
            {
                if(asc + j > 90)
                {
                  asc = ((asc+(j-1))-90)+65;
                  crypt+= (char)asc;
                }
                else
                {
                    asc+=j;
                    crypt+=(char)asc;
                }
               
            }
            else if(asc >= 97 && asc <=122)
            {
                if(asc + j > 122)
                {
                  asc = ((asc+(j-1))-122)+97;
                  crypt+= (char)asc;
                }
                else
                {
                    asc+=j;
                    crypt+=(char)asc;
                }
               
            }
           else
           {
               crypt += (char)asc;
            }
            
        }
        System.out.println(crypt);
        crypt = "";
    }
    }
}
else
{
    System.out.println("INVALID RESPONSE");
}
    
    
}
}
