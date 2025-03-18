package com.suraj.ProjectManagementSystem.dao;

import com.suraj.ProjectManagementSystem.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.Date;
import java.util.List;

@Repository
public class ProjectDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int saveProject(Project project) {
        String sql = "INSERT INTO projects (name, description, start_date, end_date) VALUES (?, ?, ?, ?)";

        return jdbcTemplate.update(sql, project.getName(), project.getDescription(),
                new Date(project.getStartDate().getTime()),  // Convert java.util.Date to java.sql.Date
                new Date(project.getEndDate().getTime()));  // Convert java.util.Date to java.sql.Date
    }


    public List<Project> getAllProjects() {
        String sql = "SELECT * FROM projects";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
                new Project(rs.getInt("id"), rs.getString("name"), rs.getString("description"),
                        rs.getDate("start_date"), rs.getDate("end_date")));
    }
}

