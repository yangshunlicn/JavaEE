package restful.entity;

import restful.api.TestMain;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据：名称
 * 课程：
 *
 */
@TestMain(n=0,s="he",value = {"a","b"})
@TestMain(n=20,s="xixi",value = {"hh","ee"})
public class Student {
    private String name;
    private String code;
    private List<Course> courseList = new ArrayList<Course>();

    public Student() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Student(String name, String code, Course... courses) {
        this.name = name;
        this.code = code;
        for (int i = 0; i < courses.length; i++) {
            this.courseList.add(courses[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourseList() {
        return courseList;
    }
    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    public Student addCourse(Course... courses) {
        for (int i = 0; i < courses.length; i++) {
            this.courseList.add(courses[i]);
        }
        return this;
    }
}
