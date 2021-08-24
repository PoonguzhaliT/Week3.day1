package week3.day1;

public class Students {
	
	public void getStudentInfo(int id){
		
		System.out.println("Student ID :" +id);

	}

	public void getStudentInfo(int id, String name) {
		System.out.println("Student id is : " +id);
		System.out.println("Student name is : " +name);
		

	}
	
	public void getStudentInfo(String email, long Phnnumber) {
		System.out.println("Student Email : " +email);
		System.out.println("Student phone number : " +Phnnumber);

	}
	

	public static void main(String[] args) {
		
		Students stuobj = new Students();
		stuobj.getStudentInfo(20034676);
		stuobj.getStudentInfo(20034676, "Poo");
		stuobj.getStudentInfo("Kuzhalisiva17@gmail.com", 900688476);
		
	}

}
