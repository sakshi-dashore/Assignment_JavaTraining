import java.util.Arrays;

//public class IntAverage {
//	int integers[] = {1,2,3,4,5,6,7,8};
//	int sum = 0,count=0 ;
//	public float findAverage() {
//		for(int i = 0 ;i<integers.length;i++) {
//			if(integers[i]%2==0) {
//				sum = sum + integers[i];
//				count++;
//			}
//		}
//		return sum/count;
//		
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		IntAverage  ia = new IntAverage();
//		float avg = ia.findAverage();
//		System.out.println(avg);
//	}
//
//}


/**
 * 
 */

/**
 * @author hp
 *
 */
public class IntAverage {
	int integer[];

	public IntAverage() {
		super();
		this.integer = new int[5];
		integer[0]=34;
		integer[1]=134;
		integer[2]=45;
		integer[3]=44;
		integer[4]=87;
		
		// TODO Auto-generated constructor stub
	}
	
public float findAverage() {
	int count=0;
   float sum=0;
	for(int i :integer) {
		if(i%2==0) {
			i=i*i;   //this line is for the multiplication of the even number
			sum = sum + i;
			count++;
		}
	}
	return sum/count;

	
	
}
 public float m1(){
 //return (float)  Arrays.stream(integer).filter((num)->(num%2==0)).average().getAsDouble();
  return (float) Arrays.stream(integer).filter(num->num%2==0).map((num->num*num)).average().getAsDouble();
 }
public static void main(String args[]) {
	IntAverage i1= new IntAverage();
	
	System.out.println(i1.findAverage());
	System.out.println(i1.m1());
}
}
