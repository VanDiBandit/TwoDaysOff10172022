package LearnerLab;


public class Student extends Person implements Learner{

    double totalStudyTime;


    public Student(double totalStudyTime, long id, String name) {
        super(id, name, totalStudyTime);
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime = numberOfHours + totalStudyTime;

    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }


}
