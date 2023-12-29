
public class PowFunction {

	public static void main(String[] args) {
		
		System.out.println(myPow(2.0,-2));
       
	}
	
	public static double myPow(double x, int n) {
		
		if(n==0){
            return 1;
        }

        if(n>0){
             return positivePow(x,n);
        }else {
        	n*=-1;
        	return negativePow(x,n);
        }
      
    }

    public static double positivePow(double x, int n){
        if(n==1){
            return x;
        }

        if(n%2!=0){
            return positivePow(x,n/2) * positivePow(x,n/2) * x;
        }else{
            return positivePow(x,n/2) * positivePow(x,n/2);
        }
    }
    

    public static double negativePow(double x, int n){
        if(n==1){
            return 1/x;
        }

        if(n%2!=0){
            return negativePow(x,n/2) * negativePow(x,n/2) * 1/x;
        }else{
            return negativePow(x,n/2) * negativePow(x,n/2);
        }
    }



}
