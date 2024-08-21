package solid_principles.single_responsibility_principle.example5.problematic_code;

// Read the code and try to figure out whether it complies to SRP or not ? And If not then how can we refactor ?
class Student {
    // .. some properties
}
public class SchoolManager {
    public void enrollStudent(Student student) {
        // Code for student enrollment
    }

    public void scheduleClasses() {
        // Code to schedule classes
    }

    public void manageTeacherSalaries() {
        // Code for managing teacher salaries
    }

    public void maintainSchoolInfrastructure() {
        // Code for maintaining infrastructure
    }
}
