/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package School.View;

/**
 *
 * @author Novrael
 */
public class Course {
    private int id;
    private String course_name;
    private String semester;
    private String description;
    
    public Course(){};
    
    public Course(int id, String course_name, String semester, String description) {
        this.id = id;
        this.course_name = course_name;
        this.semester = semester;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getSemester() {
        return semester;
    }

    public String getDescription() {
        return description;
    }
    
}
