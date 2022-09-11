public class Student1 extends Peoples {

    String name;
    String course;


    public Student1(int age, int numberOflegs, String name, String course) {
        super(age, numberOflegs);
        this.name = name;
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student1 [course=" + course + ", name=" + name + "]" +"Age: "+ super.age +" Number of Legs:"+super.numberOflegs ;
    }


    @Override
    public String graduate() {
        // TODO Auto-generated method stub
        return null;
    }


    


}
