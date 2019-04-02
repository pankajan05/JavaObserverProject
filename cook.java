package com.company;

import java.util.Observable;

public class cook extends Observable{
    private String name;
    private boolean cook = false;

    public cook(String n)
    {
        name = n;
    }

    public void setCook(boolean c)
    {
        cook = c;
        if(c == true) {

            for(int x=0; x <=15; x++)
            {
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex)
                {
                    System.err.print("There was some errors.\n");
                }
                if(x%3== 0)
                    System.out.printf("The bell is ringing.....");
                else
                    System.out.printf("%c",(char)13);
            }

            System.out.println();

            setChanged();
            notifyObservers();
        }
    }

   public void cooking()
   {
       System.out.print("\n\nfood is cooking");
       for(int x=0; x <=10; x++)
       {
          try{
              Thread.sleep(1000);
          }
          catch (InterruptedException ex)
          {
              System.err.print("There was some errors.\n");
          }
               System.out.print(".");
       }

       System.out.print("\n\nfood is prepared.\n");
       setCook(true);
   }

    @Override
    public String toString() {
        return String.format("%s",name);
    }
}
