public class Student2 extends Peoples{


    String name;
    String course;



    public Student2(int age, int numberOflegs, String name, String course) {
        super(age, numberOflegs);
        this.name = name;
        this.course = course;
    }



    @Override
    public String toString() {
        return "Student2 - course=" + course + ", name=" + name  +" Legs?:"+super.numberOflegs +" Age: "+ super.age;
    }



    @Override
    public String graduate() {
        // TODO Auto-generated method stub
        return null;
    }

}
