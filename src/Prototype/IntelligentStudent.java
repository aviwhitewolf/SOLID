package Prototype;

public class IntelligentStudent extends Student{

    private double iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    public void setIq(double iq) {
        this.iq = iq;
    }

    public double getIq() {
        return iq;
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", university='" + getUniversity() + '\'' +
                ", psp=" + getPsp() +
                ", iq=" + iq +
                '}';
    }

}
