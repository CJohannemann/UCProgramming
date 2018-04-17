package loopy;

/**
 * @author cjohannemann
 */
public class Loopy {


    public static void main(String[] args) {
        /*
		Part A: Counting (for) Loops (2 points each)
		(Don’t be clever and use a while loop! Make these for loops)
		1.	A loop that counts (i.e. displays the count) up by 1 from 0 to 30 
		2.	A loop that counts down by 1 from 30 to 0
		3.	A loop that counts up by 3 from 0 to 18
		4.	A loop that counts down by 2 from 10 to 0
		*/
		
		
		for(int  i = 1; i <= 30; i++){
			System.out.println(i);
		}
		System.out.println();
		for(int  k = 30; k >=0 ; k--){
			System.out.println(k);
		}
		System.out.println();
		for(int  l = 0; l <= 18; l+=3){
			System.out.println(l);
		}
		System.out.println();
		for(int  m = 10; m >= 0; m-=2){
			System.out.println(m);
		}
		
		
		/*
		 * Part B: Output for loops (2 points each)
			5.	A nested loop that creates this figure (there are no blank lines)
		 	*
		 	**
		 	***
		 	****
		 	*****
		 */
		System.out.println();
		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 6.	A nested loop that creates this figure (there are no blank lines)

		 *****
		 ****
		 ***
		 **
		 *
		 */
		System.out.println();
		for (int a = 5; a >=1; a--){
			for(int b = 1; b <= a; b++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 7.	A nested loop that creates this figure (there are no blank lines)
		 	*****
			*****
			*****
			*****
			*****
		 */
		System.out.println();
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5; j++){
				System.out.print("*");
			}
			System.out.println();
		}
    }
    
}
