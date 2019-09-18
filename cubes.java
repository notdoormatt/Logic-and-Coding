//Iteration_Explore.java

/**
 * Lab that explores for loops.
 *
 * @author Roy Chancellor
 * @version 2/7/2019
 */
public class cubes
{
    public static void main( String[] args) {
        int suboddInt;
        
        System.out.println();  //blank line for separation in terminal
        System.out.println("i\tsubtInt");  //table header
        
        
        for(int i = 99; i >= 1; i=i-2) {
            suboddInt=i;
            
            
            System.out.println(i + "\t" + suboddInt);
        }  //end for
        int cube;
        
        System.out.println();  //blank line for separation in terminal
        System.out.println("i\tcube");  //table header
        cube = 1;
        for(int j = 1; j <= 10; j = j+1) {
            cube=j*j*j;
            
            
            System.out.println(j + "\t" + cube);
        }  //end forstring n= "The quick brown fox jumped over the lazy dog";
        int n;
        String a= "The quick brown fox jumped over the lazy dog";
        n=a.length();
        a.charAt(0);
        for (int c=0; c<a.length();c++){
            System.out.println(a.charAt(c));
        }
            
           
    }
}//end main
//end cubes
