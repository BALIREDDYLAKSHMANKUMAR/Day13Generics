package GenricsPrograms.Genrics;

public class IntegerMax {
	int CalculateMaximum(int[] ArrayOfInputs) {
		 int max = ArrayOfInputs[0];
	        if (ArrayOfInputs[1] > max) {
	            max = ArrayOfInputs[1];
	        }
	        if (ArrayOfInputs[2] > max) {
	            max = ArrayOfInputs[2];
	        }
	        return max;
	    }

	    void checkMaxAt2ndPos(int val, int max) {
	        if (val == max) {
	            System.out.println("Max Number is at Position 2! " + max);
	        } else {
	            System.out.println("Max Number is not present at Position 2! " + max);
	        }
	    }
}
		
	

