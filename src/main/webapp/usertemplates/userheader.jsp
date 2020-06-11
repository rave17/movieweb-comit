<%@page import="com.mycompany.moviewebproject.model.entities.User"%>

<%

    User userSession = null;
    
    try {
        userSession = (User) session.getAttribute("userLog");
        System.out.println(userSession.getUserName());
    } catch (NullPointerException ex) {
        System.out.println("No hay usuario");
    }
  

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <div class="container-fluid bg-portada p-0">
      <!-- NAVIGATION BAR -->
      
<div class="row px-0 mx-0">

    <nav class="col-md-12 navbar navbar-expand-lg navbar-dark py-auto mt-2 px-0">
      <div class="container">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navContainer"
          aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <a class="navbar-brand" href="userprofile.jsp">MovieWeb</a>
        <div class="collapse navbar-collapse" id="navContainer">
          <!-- Menu content -->
          <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="userhome.jsp">Explore</a>
            </li>
            <li class="nav-item">
              <a class="nav-link active" href="userprofile.jsp">Profile</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="usercontact.jsp">Contact</a>
            </li>
          </ul>
          <span class="pr-3 text-primary" id="logName">Welcome <%= userSession.getUserName() %></span>
          <a href="<%= request.getContextPath()%>/logout" class="btn btn-info my-2 mr-2 my-sm-0" id="signout" type="button">Sign out</a>
        </div>
      </div>
    </nav>
  </div>
