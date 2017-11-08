package arrayexersizequetion7;

/********************************************************************
 * Programmer:	sveinson
 * Class:       CS30S
 *
 * Assignment:      simple static method example
 * Program Name:    simpleStaticMethodExample
 *
 * Description: use static methods to perform some simple
 *              operations.
 *
 * Input: some integers from the keyboard
 *
 * Output: banners and closing messages
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
import java.util.Random;
 

public class ArrayExersize{  // begin class

    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    	        final int max = 100;  		// maximum number of randoms allowed
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	
        String banner;                          //string for printing banners
    	String prompt;				// prompt for use in input dialogs
    	
        
    	String delim = " ";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
          Random r = new Random();		// create new random object
       int rand ;
             
        
        
        String change;
        int secreq;
        int request;
        

        int count = 0 ; //a varible for counting the iterations of loops and assigning the arry chunk to be printed accordingly

    	//ConsoleReader console = new ConsoleReader(System.in);
    	//DecimalFormat df1 = new DecimalFormat("$##.00");
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    //	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    // below are the mathod calls that tell the program to run the sub-program.
        
        printBanner();                      // print a banner to the output windowl
    //    fileBanner(fout);
        banner = windowBanner();         // make a string to print in joption pane

JOptionPane.showMessageDialog(null, banner);    	
    
 	   	
    // ************************ get input **********************

            int arreh[] = new int[max];
    // ************************ processing ***************************

          for (count = 0; count < max; count++){
           arreh[count]   = r.nextInt(128);				// generate a random number between 0 and 127 and assigns it to the array   
          }//end for
    
          
    // ************************ print output ****************************

    System.out.println("the array is\n" + printarray(arreh,max));
    System.out.println("sum = " + addarray(arreh,max));
    System.out.println("average = " + averagearray(arreh, max));
    System.out.println("biggest number = "+ bignumarray(arreh,max));
    System.out.println("smallest number = "+ smallnumarray(arreh,max));
    
        // ******** closing message *********
        
        System.out.println("\nend of processing.");
    //    fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
      //  fout.close();			// close output buffer
    }  // end main

// ******************** static methods *****************************
    
          //************************************************
    // Purpose: to find the smallest number in an array
    // Interface: IN: the array and length of it
    // Returns: the smallest number in an array
    // *****************************************************
    public static int smallnumarray(int[] arreh, int max){
       int count = 0;
       int last = 0;
         last = arreh[0];        
         for(count = 0; count < max; count ++){  
               if (last > arreh[count]){ 
                   last = arreh[count];
               }//end if
    } //end for
                  return last;
    }//end smallnum

      //************************************************
    // Purpose: to find the biggest number in an array
    // Interface: IN: the array and length of it
    // Returns: the biggest number in an array
    // *****************************************************
    public static int bignumarray(int[] arreh, int max){
       int count = 0;
       int last = 0;          
       last = arreh[0];
                  for(count = 0; count < max; count ++){  

               if (last < arreh[count]){ 
                   last = arreh[count];
               }//end if
    } //end for
                  return last;
    }//end bignum
   
    
      //************************************************
    // Purpose: to print an array
    // Interface: IN: the array and length of it
    // Returns: array as a string
    // *****************************************************
    public static String printarray(int[] arreh, int max){
     String strin = "";
     int scount = 1;
     for (int count = 0; count < max; count++){
              strin += arreh[count];
              strin += " ";
              if (scount % 10 == 0){
              strin +="\n"; 
              }//end if 
              
              scount++;
             
     } //end for 
  
    return strin;
    }//end printarray
    
          //************************************************
    // Purpose: to add an array
    // Interface: IN: the array and length of it
    // Returns: the sum of an array
    // *****************************************************
    public static int addarray(int[] arreh, int max){
     int sum = 0;
     for (int count = 0; count < max; count++){
        sum = sum + arreh[count];
     } //end for 
    return sum;
    }//end printarray
    
          //************************************************
    // Purpose: to average an array
    // Interface: IN: the array and length of it
    // Returns: the average of an array
    // *****************************************************
    public static double averagearray(int[] arreh, int max){
    double average = addarray(arreh, max) / max;
    return average;
    }//end average
    
    
    //************************************************
    // Purpose: get one int value from the keyboad
    // Interface: IN: string prompt
    // Returns: int read from keyboard buffer
    // *****************************************************
    public static int getNumber(String p, String banner, String promt){
        int n = 0;          // local varible to hold integer from keyboard buffer
        n = Integer.parseInt(JOptionPane.showInputDialog(banner, promt));
        return(n);
    } // end getNumber
    
    //************************************************
    // Purpose: print an output banner to the output window
    // Interface: IN: none
    // Returns: none
    // *****************************************************
    public static void printBanner(){
        System.out.println("*******************************************\\n");
        System.out.println("Name:		Evan Chartrand");
        System.out.println("Class:		CS30S");
        System.out.println("Assignment:	Ax Qy");
        System.out.println("*******************************************");
    }  // end print banner
    
    //************************************************
    // Purpose: print an output banner to the output file
    // Interface: IN: PrintWriter
    // Returns: none
    // *****************************************************
    public static void fileBanner(PrintWriter fo){
        fo.println("*******************************************");
        fo.println("Name:		Evan Chartrand");
        fo.println("Class:		CS30S");
        fo.println("Assignment:	Ax Qy");
        fo.println("*******************************************");    
    } // end fileBanner
    
    //************************************************
    // Purpose: Make an output banner string to use with message
    //          dialogs
    // Interface: IN: none
    // Returns: output banner string
    // *****************************************************
    public static String windowBanner(){
        // *** local variabls ***
        
        String banner;               // output banner for windows
        
        // **** create banner ****
        
        banner = "*******************************************\n";
        banner += "Name:		Evan Chartrand\n";
        banner += "Class:		CS30S\n";
        banner += "Assignment:	Ax Qy\n";
        banner += "*******************************************\n\n";  
        
        // *** return the banner ***
        
        return banner;           
    } // end windowBanner
}  // end class