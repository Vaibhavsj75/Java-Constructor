package Constructor;

class Student1
{
    private String name;
    private int age;

    public Student1()
    {
        System.out.println("Default Constructor is called");
        name="Vaibhav";
        age=18;
    }
    public Student1(String name){
        this.name=name;
        age=19;
    }
    public Student1(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void disp(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        
        Student1 st1=new Student1();
        st1.disp();
        Student1 st2=new Student1("Steve");
        st2.disp();
        Student1 st3=new Student1("Jhon", 19);
        st3.disp();
    }
}
    

