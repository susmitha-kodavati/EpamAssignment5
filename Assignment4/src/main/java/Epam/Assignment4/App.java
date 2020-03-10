package Epam.Assignment4;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in) ;
        CustomImplementation<Object> ci = new CustomImplementation<Object>() ;
        ci.add(559) ;
        ci.add(105) ;
        ci.add(852) ;
        ci.add(425) ;
        ci.add(123) ;
        ci.add("MI");
        ci.add("RCB");
        ci.add("SRH");
        ci.add("CSK");
        ci.add("MCA");
        ci.display() ;
        int x = sc.nextInt() ;
        System.out.println("Element retrived from custom array list which is at index "+x+" is : "+ci.get(x)) ;
        int y = sc.nextInt() ;
        System.out.println("Element removed from custom array list present at particular index "+y+" is :"+ci.remove(y)) ;
        System.out.println("After performing all array list operations the final array list is :") ;
        ci.display() ;
    }
}
