<%@page import="com.mycompany.moviewebproject.model.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
User user = null;
    
    try {
        user = (User) session.getAttribute("user");
        System.out.println(user.getUserName());
    } catch (NullPointerException ex) {
        System.out.println("No user session");
    }
%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Movie web - Comment about your favorite movie</title>
  <link rel="icon" type="image/png" href="img/favicon.png" sizes="32x32">
  <!-- Bootstrap 4.0 / Bootswatch 4.4.1 -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.4.1/cyborg/bootstrap.min.css">
  <!-- Fontawesome 4.7 -->
  <script src="https://kit.fontawesome.com/a45b9a7436.js" crossorigin="anonymous"></script>
  <!-- CSS styles -->
  <link rel="stylesheet" type="text/css" href="styles/style.css">
  <!-- scroll -->
  <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
</head>

<body>
  <div class="container-fluid px-0">
    <div class="container-fluid bg-portada py-0 px-5">
      <!-- NAVIGATION BAR -->
      <div class="row px-0 mx-0">
        <nav class="col-md-12 navbar navbar-expand-lg navbar-dark py-auto mt-2 px-0">
          <div class="container">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navContainer"
              aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">MovieWeb</a>
            <div class="collapse navbar-collapse" id="navContainer">
              <!-- Menu content -->
              <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                  <a class="nav-link" href="home">Home</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="about.jsp">About us</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" href="contact.jsp">Contact</a>
                </li>
              </ul>
              <button class="btn btn-info px- my-auto register-btn" data-toggle="modal" data-target="#btnSignup">Sign up</button>
            </div>
          </div>
        </nav>
      </div>