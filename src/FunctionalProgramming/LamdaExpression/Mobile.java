package FunctionalProgramming.LamdaExpression;

public class Mobile {

      private long StudentId;
      private String name;

    public Mobile(long studentId, String name) {
        StudentId = studentId;
        this.name = name;
    }

    public Mobile() {

    }

    public long getStudentId() {
        return StudentId;
    }

    public void setStudentId(long studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
