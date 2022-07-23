
public class Pattern1 {

	public static  boolean isOddNumber(int number ){
		return number%2 != 0 ? true : false;
	}


	public static boolean isPrimeNumner(int number){
		if(number>0 && number < 4){
			return true;
		}
		int loopUntil = number/2;

		for(int i=2; i<loopUntil;i++){

			if(number%i == 0){
				return false;
			}
		}

		return true;
	}

	public static void main(String args[]){

		int result = 0;
		int lastTwoResult1 = 0;
		int lastTwoResult2 = 0;

		for(int i=0; i<=6; i++){

			if(i ==0 ){
				result = 2;
				lastTwoResult1 = 2;
			}else if (i==1){
				result = 1;
				lastTwoResult2 = 1;
			}else {

				result = lastTwoResult1+lastTwoResult2;

				lastTwoResult1 = lastTwoResult2;
				lastTwoResult2 = result;

			}

			System.out.println("Input = " + i + " Output = "+ result);
		}

		System.out.println("Result with recurrision solution.");

		recursionSum(0,0,0);


	}
    //Without For Loop Use
	public static int recursionSum(int number, int previousResult1, int previousResult2){

		int result = 0;


		if(number==0){

			result = 2;
			previousResult1 = 2;
			System.out.println("Input = " + number + " Output = "+ result);
			number++;
			recursionSum(number, previousResult1, previousResult2);
		}else if(number == 1){

			result = 1;
			previousResult2 = 1;
			System.out.println("Input = " + number + " Output = "+ result);
			number++;
			recursionSum(number, previousResult1, previousResult2);
		}else{

			if(number < 7 ){

				result = previousResult1 + previousResult2;
				previousResult1 = previousResult2;
				previousResult2 = result;
				System.out.println("Input = " + number + " Output = "+ result);
				number++;

				recursionSum(number, previousResult1, previousResult2);

			}
		}


		return result;
	}
}

