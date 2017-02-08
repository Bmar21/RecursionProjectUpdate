package counting.model;

public class RecursionTool 
{
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) * currentNumber;
		}
		
	}
	
	public int calculateIterativeFact(int N)
	{
		int product = 1;
			for (int j=1; j<=N; j++)
				product *= j;
	    
	    return product;
	}
	
	public int calculateIterativeFib( int n)
	{
		int fib = 0;
	    int a = 1;
	    for(int i=0; i<n; i++) {
	        fib = fib + a;
	        a = fib;
	    }
	    return fib;
	}
	
}

