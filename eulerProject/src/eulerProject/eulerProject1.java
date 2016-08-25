package eulerProject;

public class eulerProject1 {
	
	public static int sumOfMultiples(int n){
		int sum = 0;
		int i = 0;
		while(i < n){
			if(i % 3 == 0)
				sum += i;
			else if(i % 5 == 0)
				sum += i;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args){
		System.out.println(sumOfMultiples(1000));
	}

}
