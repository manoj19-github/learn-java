package learn;
public class Student {
    int marks;
    String sname;
    protected int sports;
    public Student(String name, int marks){
        this.marks = marks;
        this.sname = name;
        this.sports = 57;
    }

    public void display(){
        System.out.println(this.sname+"  "+this.marks);
    }
    
}
