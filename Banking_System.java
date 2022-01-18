import java.io.*;
import java.util.*;

class Bank
{
    //taking global variables
    String name = " ";
    double sum = 0;
    String n = " ";
    int count = 0;
    void take_name()//for accepting the name of the user
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nHello. Please enter your name.");
        name = sc.nextLine();

    }

    void file_operations(){
        ++count;//incrementing the count variable for the if condition ahead
        try{
            FileWriter fw=new FileWriter(name+".txt", true);//creating file
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            Scanner sc=new Scanner(System.in);
            if(count == 1)//this only executes if count is 1 and hence prints the name of the user in the .txt file
            {
                for(int i = 1;i<=1;i++)
                {
                    pw.println("Name of account holder: "+name);
                }
            }
            System.out.println("\nWhat would you like to do?\nCheck Balance\nDeposit\nWithdraw\nVPT (View Previous Transactions)\nExit");//asking for the service
            n =sc.nextLine();
            if(n.equalsIgnoreCase("Deposit"))//if the user chose to deposit
            {
                System.out.println("How much would you like to deposit?");
                double num = sc.nextDouble();
                if(num<0){

                    System.exit(0);//just to make sure the user doesn't enter a negative value
                }
                num = num*1.035;//adding 3.5% interest

                num = (double) (Math.round(num*10.00))/10.00;//rounding the number
                sum = sum + num;
                for(int i = 1;i<=1;i++)
                {
                    pw.println("Current money Deposited: Rs. "+num);//adding statement to file

                }

                System.out.println("Amount deposited (with 3.5% interest) is: Rs. "+num);

            }
            else if(n.equalsIgnoreCase("Withdraw"))//if the user chose to withdraw
            {
                System.out.println("How much would you like to withdraw?");
                double num = sc.nextDouble();

                if(num>sum|| sum == 0)
                {
                    System.out.println("Insufficient money in account.");
                    System.exit(0);//terminates the program if there is insufficient money in the accoutn
                }

                else
                {
                    sum = sum - num;

                    for(int i = 1;i<=1;i++)
                    {
                        pw.println("Money withdrawn: Rs. "+num);//adding the statement to the file

                    }

                    System.out.println("Amount withdrawn is: Rs. "+num);

                }

            }
            else if(n.equalsIgnoreCase("VPT"))//if the user wants to view a previous transaction
            {
                InputStreamReader isr = new InputStreamReader(new FileInputStream(name+".txt"));
                BufferedReader br = new BufferedReader(isr);
                String l=new String(); 
                //reading the last line of the file
                while(br.ready()) 
                {
                    l=br.readLine();
                }
                System.out.println("Showing Previous Transaction:\n"+l); 
            }

            else if(n.equalsIgnoreCase("Check Balance"))//if the user wants to check balance
            {
                sum = (double) (Math.round(sum*10.00))/10.00;//round the number
                System.out.println("Bank balance: Rs. "+sum);
            }
            else if(n.equalsIgnoreCase("Exit"))//if the user chose to exit
            {
                System.out.println("Thank you!");
                System.exit(0);//exiting the program
            }
            //closing FileWrite,BufferedWriter and PrintWriter
            pw.close();
            bw.close();
            fw.close();
        }
        catch(IOException e)
        {
            System.err.println(e);

        }

    }

    public static void main(String args[])
    {
        //printing the heading
        System.out.println("\u000c");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t\t\t\t\t\t\tBANKING SYSTEM");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Bank obj = new Bank();//creating object
        //calling method
        obj.take_name();
        //runs infinitely until the user wants to stop
        while(true)
        {

            obj.file_operations();

        }

    }
}
