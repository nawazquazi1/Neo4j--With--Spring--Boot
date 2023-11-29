package com.nawaz.neo4j.services;

import com.nawaz.neo4j.models.Course;
import com.nawaz.neo4j.queryresults.CourseEnrolmentQueryResult;
import com.nawaz.neo4j.repositories.CourseRepository;
import com.nawaz.neo4j.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseEnrolmentService {
    private final CourseRepository courseRepository;
    private final UserRepository userRepository;

    public CourseEnrolmentService(CourseRepository courseRepository, UserRepository userRepository) {
        this.courseRepository = courseRepository;
        this.userRepository = userRepository;
    }

    public List<Course> getAllEnrolledCoursesByUsername(String username) {
        return courseRepository.findAllEnrolledCoursesByUsername(username);
    }

    public boolean getEnrolmentStatus(String username, String courseIdentifier) {
        return userRepository.findEnrolmentStatus(username, courseIdentifier);
    }

    public CourseEnrolmentQueryResult enrollIn(String username, String courseIdentifier) {
        // TODO: make sure that the user has not been enrolled in the course already.
        return userRepository.createEnrolmentRelationship(username, courseIdentifier);
    }
}
