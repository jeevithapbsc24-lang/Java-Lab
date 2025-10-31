public class student
{
    public String sname;
    public String usn;
    public String section;
    public int semester;

         public Student(String sname, String usn, String section, int semester)
	{
	    this.name=name;
	    this.usn=usn;
	    this.section=section;
	    this.semester=semester;
	}
 	  	
          public void display()
	 {
	     System.out.println( "student name is" + sname);
                     System.out.println("student usn is" + usn);
                     System.out.println("student is in section" + section);
	     System.out.println(" and Semester" + semester);
	  }
}