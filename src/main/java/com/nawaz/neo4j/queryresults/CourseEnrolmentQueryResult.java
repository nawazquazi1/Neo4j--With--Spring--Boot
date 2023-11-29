package com.nawaz.neo4j.queryresults;


import com.nawaz.neo4j.models.User;
import com.nawaz.neo4j.models.Course;

public class CourseEnrolmentQueryResult {
    private User user;
    private Course course;

    public CourseEnrolmentQueryResult() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
