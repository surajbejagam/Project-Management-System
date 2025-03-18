<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.suraj.ProjectManagementSystem.model.Project" %>

<jsp:useBean id="projects" scope="request" type="java.util.List"/>
<html>
<head><title>Projects</title></head>
<body>
    <h2>Project List</h2>
    <table border="1">
        <tr><th>ID</th><th>Name</th><th>Description</th><th>Start Date</th><th>End Date</th></tr>
        <c:forEach var="project" items="${projects}">
            <tr>
                <td>${project.id}</td>
                <td>${project.name}</td>
                <td>${project.description}</td>
                <td>${project.startDate}</td>
                <td>${project.endDate}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="addProject">Add New Project</a> | <a href="/">Home</a>
</body>
</html>
