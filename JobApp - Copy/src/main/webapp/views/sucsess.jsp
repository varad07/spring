<%@ page contentType="text/html;charset=UTF-8" language="java" import="com.varad.JobApp.Model.Job" %>

<!DOCTYPE html>
<html>
<head>
    <title>Job Added Successfully</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .navbar {
            background-color: #0d6efd;
        }
        .navbar a {
            color: white !important;
            font-weight: 500;
        }
        .success-box {
            max-width: 700px;
            margin: 60px auto;
            padding: 30px;
            background-color: #e7f5e6;
            border-left: 6px solid #198754;
            border-radius: 8px;
        }
        .success-box h2 {
            color: #198754;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand text-white" href="home">JobPortal</a>
        <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="allJobs">All Jobs</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="contact">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<%
    Job job = (Job) request.getAttribute("job");
%>

<!-- Success Message -->
<div class="success-box">
    <h2>✅ Job Posted Successfully!</h2>
    <p>The job has been added with the following details:</p>

    <ul class="list-group">
        <li class="list-group-item"><strong>Job Title:</strong> <%= job.getTitle() %></li>
        <li class="list-group-item"><strong>Company Name:</strong> <%= job.getCompany() %></li>
        <li class="list-group-item"><strong>Description:</strong> <%= job.getDescription() %></li>
        <li class="list-group-item"><strong>Location:</strong> <%= job.getLocation() %></li>
        <li class="list-group-item"><strong>Salary:</strong> <%= job.getSalary() %></li>
    </ul>

    <div class="mt-4">
        <a href="addJob" class="btn btn-outline-primary">Add Another Job</a>
        <a href="allJobs" class="btn btn-success">View All Jobs</a>
    </div>
</div>

</body>
</html>
