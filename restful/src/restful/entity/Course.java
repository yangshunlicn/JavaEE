package restful.entity;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "course")
public class Course {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Course() {}
    public Course(String name) {
        this.name = name;
    }
}
