import learn.Student;

// I am Manoj Santra , MERN Stack Developer started learning JAVA to become an Android Developer

// class Student{
//     double marks;
//     String Name;
//     int _id;
//     Student(String name,double marks){
//         this.marks= marks;
//         this.Name = name;
//         this._id = id;
//     }
    
// }
class Hello{
    public boolean isPrime(int num){
        boolean flag = true;
        for(int i=2;i<num;i++){
            if(num%2 == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    boolean isPalindrom(int num){
        int temp = num;
        int sum = 0;
        int r;
        while(num>0){
            r= num%10;
            sum = (sum * 10)+r;
            num/=10;
        }
        if(temp == sum) return true;
        return false;
    }
    public void arrayFamily(){

        Student students[] = new Student[3];
        Student s1 = new Student("Manoj Santra",82.34,1);
        Student s2 = new Student("Asim Santra",62.34,2);
        Student s3 = new Student("Mitul Santra",92.34,3);
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        int nums[] = {12,23,45,67};
        int numsArr[][] = new int[3][4];
        // for(int i = 0;i<nums.length;i++){
        //     System.out.println("item : "+nums[i]);
        // }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                numsArr[i][j] = (int)( Math.random()*100);;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print("  "+ numsArr[i][j] +" ");
            }
            System.out.println(" ");
        }
        for(Student sn:students){
            System.out.println(" Name : "+sn.Name+ " Marks : "+sn.marks);

        }
    }
    public static void main(String a[]){

     //   System.out.println("Hi myself Manoj Santra,MERN Stack developer");
     Hello hello = new Hello();
     hello.arrayFamily();
    //  System.out.println(hello.isPrime(17));
    //  System.out.println(hello.isPalindrom(251));
    }

}
