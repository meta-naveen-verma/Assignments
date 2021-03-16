import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<String> program;

    Student(String name, ArrayList<String> pros) {
	this. name = name;
	program = pros;
    }

    String getName() {
	return name;
    }
}