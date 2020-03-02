import userInterface.UI;

import java.util.Scanner;

public class Main {
    UI ui=new UI();
    public static void main(String arg[])
    {
        Scanner scan= new Scanner(System.in);
        String user_input=null;
        String[] sliced_input=null;
        while (true)
        {
            //ui.printmenu();
            user_input=scan.nextLine() ;
            sliced_input=user_input.split("\\s");
            if(sliced_input[0]=="add")
                //add
                break;
            if(sliced_input[0]=="printall")
                //printall
                break;
        }
    }
}
