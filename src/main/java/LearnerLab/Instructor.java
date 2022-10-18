package LearnerLab;

public class Instructor extends Person implements Teacher{
    public Instructor(long id, String name, double totalStudyTime) {
        super(id, name, totalStudyTime);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours/ learners.length;
        for(int i =0; i < learners.length; i++){
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}
