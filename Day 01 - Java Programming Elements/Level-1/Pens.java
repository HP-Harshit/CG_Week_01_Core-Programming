public class Pens{
	public static void main(String[] args){

		// create a variable to indicate total number of pens
		int totalPens = 14;

		// create a variable to indicate total number of students
		int totalStudents = 3;

		// create a variable to indicate total number of pens
		int penDistributed = totalPens / totalStudents;

		// create a variable to indicate total number of remaining pens
		int remainingPens = totalPens % totalStudents;

		// print detail
		System.out.println("The Pen Per Student is " + penDistributed + " and the remaining pen not distributed is " + remainingPens);

	}
}