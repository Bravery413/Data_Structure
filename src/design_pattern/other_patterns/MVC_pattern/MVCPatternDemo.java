package design_pattern.other_patterns.MVC_pattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model  = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        Student student = controller.getModel();
        student.setName("john");
        controller.updateView();
    }
    private static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
