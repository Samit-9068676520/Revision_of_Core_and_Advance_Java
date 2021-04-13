class Student{
    int id;
    String name;
}
class TestStudent2{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.id=1;
        s1.name="Verma";
        System.out.println(s1.id+" "+s1.name);
    }
}