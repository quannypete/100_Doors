public class HundredDoors {
	
	public static void main(String[] args) {
		boolean[] doors = new boolean[101];
		
		for (int j = 1; j <= 100; j++) {
			checkAllDoors(j, doors);
		}
		
		
		printDoors(doors);
		
	}
	
	public static void checkAllDoors(int steps, boolean[] doors) {
		
		for(int j = 0; j < doors.length; j+=steps) {
			doors[j] = !doors[j];
		}
		
	}
	
	public static void printDoors(boolean[] doors) {
		for(int k = 1; k < doors.length; k++) {
			if(doors[k]) {
				System.out.printf("Door %d is Open \n", k);	
			}else{
				System.out.printf("Door %d is Closed \n", k);
			}
			
			
		}
	}
}
