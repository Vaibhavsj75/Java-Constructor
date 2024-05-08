
package Constructor;

class Student {
    
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    // public void setName(String name)
    // {
    //     this.name=name;
    // }
    // public int setAge(int age)
    // {
    //     this.age=age;
    // }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}
public class Constructor
{
    public static void main(String[] args) 
    {
        Student st=new Student("Jhon",5);

        // st.setName("Jhon");
        // st.setAge(5);

        String name=st.getName();
        System.out.println(name);
        // System.out.println(st.getName());
        int age=st.getAge();
        System.out.println(age);
    }
}
