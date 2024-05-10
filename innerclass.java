
	class College{
	String collegename;
	College(String collegename){
		this.collegename = collegename;
	}
	
	
	 class Dept{
	String Deptname;
	Dept(String Deptname){
		this.Deptname = Deptname;
	}
	String getdeptdetails(){
		return "Collegename:"+collegename+"Deptname:"+Deptname;
	}
	}
	//we cannot access inner class variables from outerclass
	String deptdetails(){
		return "Collegename:"+collegename+"Deptname:"+collegename;
	}
	public static void main(String args[]){
		College sggs1 = new College("SGGS University");
		System.out.println(sggs1.collegename);
		//Dept dd = new Dept("IT");
		College.Dept dd = sggs1.new Dept("IT");
		System.out.println(dd.Deptname);
		System.out.println("Print:"+ sggs1);
		System.out.println("Print:"+ dd);
		System.out.println(sggs1.getdeptdetails());
		System.out.println(sggs1.deptdetails());
		
	}
	
	
}
