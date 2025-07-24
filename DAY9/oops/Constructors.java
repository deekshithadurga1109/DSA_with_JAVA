public class Constructors {
    public static void main(String args[]){
        Student s1 = new Student(); // constructor is called
    //     Student s2 = new Student("Deekshitha");
    //     Student s3 = new Student(123);
    //      System.out.println(s1.name); 

    s1.name = "Deekshitha";
    s1.roll = 471;
    s1.password = "abcd";
    s1.marks[0] =100;
    s1.marks[1] =80;
    s1.marks[2] =90;

    Student s2 = new Student(s1); // copy
    s2.password = "xyz";
    s1.marks[2] =100;
    for(int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }


    }

}

    class Student { 
        String name;
        int roll;
        String password;
        int marks[];

        // shallow copy constructor
        // Student(Student s1){
        //     marks = new int[3];
        //     this.name = s1.name;
        //     this.roll = s1.roll;
        //     this.marks = s1.marks;
        // }


        //deep copy constructor
        Student(Student s1) {
                 marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0; i<marks.length; i++){
                this.marks[i] = s1.marks[i];
            }

        }

        Student(){
            marks = new int[3];
           System.out.println("Constructor is called");
        }
        Student(String name){
        marks = new int[3];
            this.name = name;
        }

        Student(int roll){
            marks = new int[3];
            this.roll = roll;
        }



    }
