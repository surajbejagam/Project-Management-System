<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Add Project</title></head>
<body>
    <h2>Add New Project</h2>
    <form action="saveProject" method="post">
        Name: <input type="text" name="name" required /><br/>
        Description: <textarea name="description"></textarea><br/>
        Start Date: <input type="date" name="startDate" required /><br/>
        End Date: <input type="date" name="endDate" required /><br/>
        <input type="submit" value="Save Project"/>
    </form>
    <a href="projects">Back to Projects</a>
</body>
</html>
