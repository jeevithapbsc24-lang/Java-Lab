public class student
{
	public String sname;
	public String usn;
	public String section;
	public int semester;
 
	public void display()
	{
		System.out.println( "student name is" + sname);
		System.out.println("student usn is" + usn);
		System.out.println("student is in section" + section);
		System.out.println("student is in " + semester);
	}