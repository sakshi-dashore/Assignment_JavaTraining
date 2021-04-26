import java.util.Arrays;

/**
 * 
 */

/**
 * @author hp
 *
 */
public class OddSquare {

				int integer[];

		public OddSquare() {
			super();
			this.integer = new int[5];
			integer[0]=34;
			integer[1]=134;
			integer[2]=45;
			integer[3]=44;
			integer[4]=87;
			
			// TODO Auto-generated constructor stub
		}
		

	 public int oddNumberSquare(){
	 
	  return (int) Arrays.stream(integer).filter(num->num%2!=0).map((num->num*num)).max().getAsInt();
	 }
	public static void main(String args[]) {
		OddSquare i1= new OddSquare();
		
		System.out.println(i1.oddNumberSquare());
	}
	}
