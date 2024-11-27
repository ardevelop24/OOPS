package Hack;


class First{
    public static void main(String[] args) {
        Student Abhinav =new Student(13,"Abhinav Raj",54.5f);



    

        
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

    Student(int rno, String name,float marks){


        this.rno= rno;
        this.name= name;
        this.marks= marks;
    }
}