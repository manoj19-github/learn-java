package learn;
public class SchoolStudent extends Student {
    // int marks;
    // String sname;
    // Student s1 = new Student("Manoj Santra",34);
    int schoolMarks;
    public SchoolStudent(String name,int marks,int schoolMarks){
        super(name,marks);
        this.schoolMarks = schoolMarks;
    }
    public static void main(String a[]){
        SchoolStudent s1 = new SchoolStudent("Manoj Santra",89,78);
        System.out.println("name : "+s1.sname+" school marks : "+s1.schoolMarks);

    }
    
}
