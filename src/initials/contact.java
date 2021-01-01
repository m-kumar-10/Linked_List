package initials;

import java.util.Scanner;

public class contact {
    public static void main(String[] args) {
        String [] names={"Manish","Emma whatson","Sahil","Pardeep","Mannu","eggy&Cheeni"};

        String [] numbers={"5321321","513218","79745465","1215452","1154505","451321465400"};
        Scanner querry=new Scanner(System.in);
        for (int i=0;i< names.length;i++)
        { System.out.println(names[i]);
        }

        for(;;)
        {
            System.out.println("Enter name of recipient's to check for their number....");
            System.out.println("Enter 'Exit' for exiting the program");
            String  name=querry.nextLine();

            for (int i=0;i< names.length;i++)
            {
              if (name.equals(names[i]))
              {
                  System.out.print(names[i] + "'s Number is:");
                  System.out.println(numbers[i]);
              }
            }
            if (name.equals("Exit"))
            {
                break;
            }

        }
    }
}
