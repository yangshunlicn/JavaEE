package restful.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement(name = "teacher")
public class Teacher {

    private String name;
    private String code;

    List<Course> courseList = new ArrayList<Course>();
    @XmlElement(name = "tname")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @XmlElement(name = "course")
    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    public Teacher addCourse(Course... courses) {
        for (int i = 0; i < courses.length; i++) {
            this.courseList.add(courses[i]);
        }
        return this;
    }
    public Teacher() {
    }

    public Teacher(String name, String code, Course... courses) {
        this.name = name;
        this.code = code;
        for (int i = 0; i < courses.length; i++) {
            this.courseList.add(courses[i]);
        }

    }
}
