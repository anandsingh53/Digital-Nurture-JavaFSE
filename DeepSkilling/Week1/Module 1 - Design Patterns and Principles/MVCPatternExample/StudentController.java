public class StudentController {

    private Student model;
    private StudentView view;

    // Constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // Update Student Name
    public void setStudentName(String name) {
        model.setName(name);
    }

    // Update Student ID
    public void setStudentId(int id) {
        model.setId(id);
    }

    // Update Student Grade
    public void setStudentGrade(String grade) {
        model.setGrade(grade);
    }

    // Get Student Details
    public String getStudentName() {
        return model.getName();
    }

    public int getStudentId() {
        return model.getId();
    }

    public String getStudentGrade() {
        return model.getGrade();
    }

    // Update View
    public void updateView() {
        view.displayStudentDetails(
                model.getName(),
                model.getId(),
                model.getGrade()
        );
    }
}