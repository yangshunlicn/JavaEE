package restful.api;

import restful.entity.Course;
import restful.entity.Student;
import restful.entity.Teacher;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;
@Path("/teacher")
public class TeacherAPI {
    @GET
    @Path("/info")
    @Produces("application/xml;charset=utf-8")
    public Teacher getTeacherInfo(){
        return new Teacher("陈述","100",new Course("语文"))
                .addCourse(new Course("数学"));
    }
    @POST
    @Path("/courseList")
    @Produces("application/json;charset=utf-8")
    public List<Course> getTeacherCourseList(String name){
        ArrayList<Course> list =  new ArrayList<Course>();
        list.add(new Course("语文"));
        list.add(new Course("数学"));
        return list;
    }
}
