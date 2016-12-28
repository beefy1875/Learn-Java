
public class Song {

	public static void main(String[] args) {
		
		String[] s = {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
		
		String[] prize = {
				" Partridge in a Pear Tree",
				" Turtle Doves",
				" French Hens",
				" Calling Birds",
				" Golden Rings",
				" Geese a Laying",
				" Swans a Swimming",
				" Maids a Milking",
				" Ladies Dancing",
				" Lords a Leaping",
				" Pipers Piping",
				" Drummers Drumming"
		};
		
		for(int i = 0; i <12; i++) {
			System.out.println("On the " + s[i] + " day of Christmas");
			System.out.println("my true love sent to me:");
			
			if(i==0) {
				System.out.println(i+1 + prize[i]);
			}
			else {
				for(int j = i; j >=1; j--) {
					System.out.println(j+1 + prize[j]);
				}
				System.out.println("and 1" + prize[0]);
			}
			System.out.println("");
		}
	}
}