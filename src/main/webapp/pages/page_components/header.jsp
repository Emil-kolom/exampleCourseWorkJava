<%--
  Created by IntelliJ IDEA.
  User: emil
  Date: 25.10.2021
  Time: 09:50
  To change this template use File | Settings | File Templates.
--%
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<header class="fixed-top">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="/">SCRUDproject</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Operation
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <li><a class="dropdown-item" href="/jdbc">JDBC</a></li>
                        <li><a class="dropdown-item" href="/hibernate">Hibernate</a></li>
                        <li><a class="dropdown-item" href="/jpa">Jpa</a></li>
                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" href="/about">About</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/contact">Contact</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
</header>