<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Jobs</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .job-card {
            margin-bottom: 20px;
        }
        .navbar {
            background-color: #0d6efd;
        }
        .navbar a {
            color: white !important;
            font-weight: 500;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand text-white" href="home.jsp">JobPortal</a>
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

<!-- Job Listings -->
<div class="container mt-5">
    <h2 class="mb-4">Available Jobs</h2>
    <c:forEach var="job" items="${jobs}">
        <div class="card job-card">
            <div class="card-body">
                <h5 class="card-title">${job.title}</h5>
                <h6 class="card-subtitle mb-2 text-muted">Company: ${job.company}</h6>
                <p class="card-text">${job.description}</p>
                <p><strong>Location:</strong> ${job.location} | <strong>Salary:</strong> ${job.salary}</p>
            </div>
        </div>
    </c:forEach>
</div>

</body>
</html>
