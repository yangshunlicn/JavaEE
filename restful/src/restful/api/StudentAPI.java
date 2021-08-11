package restful.api;

import restful.entity.Course;
import restful.entity.Student;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;
/**
 * 1.输入(参数)：
 * 2.流程：
 * 3.输出(返回值)：
 */
@Path("/student")
public class StudentAPI {
    /**
     * 1.输入(参数)：
     * 2.流程：
     * 3.输出(返回值)：
     */
    @GET
    @Path("/info")
    @Produces("application/json;charset=utf-8")
    public Student getStuInfo(){
        return new Student("饶伟","001",new Course("语文"))
                .addCourse(new Course("数学"));
    }
    @POST
    @Path("/courseList")
    @Produces("application/xml;charset=utf-8")
    public List<Course> getStuCourseList(String name){
        ArrayList<Course> list =  new ArrayList<Course>();
        list.add(new Course("语文"));
        list.add(new Course("数学"));
        return list;
    }
}
