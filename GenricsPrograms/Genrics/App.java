package GenricsPrograms.Genrics;
import java.util.*;
public class App 
{


	public static void main( String[] args )
    {
    	 System.out.println("Hello to Genrics Program!");
         System.out.println("Give 3 inputs:");
         Scanner sc = new Scanner(System.in);
         IntegerMax i = new IntegerMax();
         int inp1 = Integer.parseInt(sc.nextLine());
         int inp2 = Integer.parseInt(sc.nextLine());
         int inp3 = Integer.parseInt(sc.nextLine());
         int ArrayOfInputs[] = { inp1, inp2, inp3 };
         int max = i.CalculateMaximum(ArrayOfInputs);
         i.checkMaxAt2ndPos(ArrayOfInputs[1], max);
         
    }
}
