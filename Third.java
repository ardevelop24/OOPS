class Third{
    public static void main(String[] args) {
        Student Abhinav =new Student();

        //  Abhinav.rno =43;
        //  Abhinav.name="Abhinav Raj";
        //  Abhinav.marks=75.45f;

        Abhinav.changeName("Abhi");
        Abhinav.greeting();
        // System.out.println(Abhinav.rno);
        // System.out.println(Abhinav.name);
        // System.out.println(Abhinav.marks);
        
    }
}

class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println(" Hello my name is " +name);
    }

    void changeName(String newName){
        name =newName; 
    }

    Student(){
        // System.out.println("this is"+this.rno);
        // System.out.println(this.name);
        // System.out.println(this.marks);

        this.rno=32;
        this.name="Abhinav";
        this.marks=78.5f;
    }
}