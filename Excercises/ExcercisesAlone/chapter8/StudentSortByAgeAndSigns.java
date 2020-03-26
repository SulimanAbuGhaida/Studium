package chapter8;

import java.util.Comparator;

public class StudentSortByAgeAndSigns implements Comparator<Student1> {
	
    @Override
    public int compare(Student1 o1, Student1 o2) {

        if(o1.getAge() - o2.getAge() != 0){
            return o1.getAge() - o2.getAge();
        }

        return o1.getFamilyname().length() - o2.getFamilyname().length();
	}

}
