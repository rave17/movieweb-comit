
<%@page import="com.mycompany.moviewebproject.model.entities.Comment"%>
<%@page import="com.mycompany.moviewebproject.model.DAO.UserDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.moviewebproject.model.entities.User"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    
    ArrayList<Comment> allComments =(ArrayList<Comment>) request.getAttribute("comments");

%>

<%@ include file="templates/header.jsp"%>
 <!-- FRONT PAGE -->
      <div class="container-fluid py-5">
        <div class="row pb-5 mb-2">
          <div class="container col-md-5">
            <h2 class="display-4">MOVIE<span class="text-success">WEB</span></h2>
            <P class="py-5">We have a mission! Do you want to be part of this? Please, help us and share your comments about movies you've seen. We want to know what you think, and others users to, enjoy the site! </P>
            <div class="my-auto pb-4">
              <button class="btn btn-info px-5 my-auto register-btn" data-toggle="modal" data-target="#btnSignup">Sign up</button>
            </div>
          </div>
          <div class="container col-md-4 col-sm-12 p-4 bg-translucid mb-4 rounded">
            <form class="py-auto" action="login" method="post" class="needs-validation" novalidate>
              <h3 class="display-5 text-white text-center" id="login">Login</h3>
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="user">Username</label>
                  <div class="input-group">
                    <input name="email" type="email" required="required"
                      class="form-control">
                  </div>
                </div>
              </div>
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="Password">Password</label>
                  <div class="input-group">
                    <input name="password" type="password" class="form-control">
                  </div>
                  <small>Did you forget your password? Click <a href="resetpassword.jsp">here</a></small>
                </div>
              </div>
              <div class="form-group row">
                <div class="col-md-12">
                  <button type="submit" name="loginBtn" id="#loginBtn" class="btn btn-block btn-primary">Login</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>

<!-- STEPS -->
<h4 class="text-center my-5" id="steps">READY?</h4>       
    <div class="row mx-0 my-5" data-aos="fade-up" data-aos-anchor-placement="top-bottom"
    data-aos-duration="2000">
      <div class="card-deck mx-auto text-center">
        <div class="card pt-5 shadow-port hoverCard">
          <i class="fas fa-user-astronaut iconLarge mx-auto"></i>
          <div class="card-body mt-4">
            <h5 class="card-title">Register</h5>
          </div>
        </div>
        <div class="card pt-5 shadow-port hoverCard">
          <i class="fas fa-comment-medical iconLarge mx-auto"></i>
          <div class="card-body mt-4">
            <h5 class="card-title">Search a movie</h5>
          </div>
        </div>
        <div class="card pt-5 shadow-port hoverCard">
          <i class="fas fa-comments iconLarge mx-auto"></i>
          <div class="card-body mt-4">
            <h5 class="card-title">Post a comment</h5>
          </div>
        </div>
        <div class="card pt-5 shadow-port hoverCard">
          <i class="fas fa-rocket iconLarge mx-auto"></i>
          <div class="card-body mt-4">
            <h5 class="card-title">Enjoy</h5>
          </div>
        </div>
      </div>
    </div>
      
    <!-- MOVIES SECTION COMMENTS -->
    <h4 class="text-center my-5" id="comments">SOME USERS COMMENTS</h4>
    <div class="row mx-0" >
        <div class="col-md-8 mx-auto d-flex">
            <%
            for(Comment oneComment: allComments){
            %>
     
            <div class="mx-auto text-center card mx-auto w-50">
              <div class="card-body">
                  <img class="w-25 rounded-circle border border-success m-2" src="<%= oneComment.getUser_userId().getUserAvatar() %>" alt="First slide">
                  <h5><%= oneComment.getUser_userId().getUserName() %></h5>
                <p class="card-text"><%= oneComment.getCommentContent() %></p>
              </div>
        </div>
            
            <%
                }
            %>
            </div>
    </div>

    <!-- WHY MOVIE WEB... -->
    <h4 class="text-center my-4" id="whymovieweb">MOVIE WEB?</h4>
    <div class="row mx-4 my-5" data-aos="fade-up" data-aos-anchor-placement="top-bottom"
    data-aos-duration="2000">
      <div class="card-deck col-md-10 mx-auto text-center">
        <div class="card py-4 shadow-port hoverCard">
          <i class="fas fa-question iconLarge"></i>
          <div class="card-body">
            <h5 class="card-title">Why?</h5>
            <p class="card-text">You dont know what movie to watch and lose your time trying to find one? </p>
          </div>
          <button class="btn btn-success mx-auto">Show</button>
        </div>
        <div class="card py-4 shadow-port hoverCard">
          <i class="fas fa-lightbulb iconLarge"></i>
          <div class="card-body">
            <h5 class="card-title">How?</h5>
            <p class="card-text">This is your site! Find little synopsis and see what to think other members about the movie you want to watch.</p>
          </div>
          <button class="btn btn-success mx-auto">Show</button>
        </div>
        <div class="card py-4 shadow-port hoverCard">
          <i class="fas fa-video iconLarge"></i>
          <div class="card-body">
            <h5 class="card-title">Wow!</h5>
            <p class="card-text">You can see the movies if the link is available and comment with thanks!
              enjoy it!
            </p>
          </div>
          <button class="btn btn-success mx-auto">Show</button>
        </div>
      </div>
    </div>

    <!-- MORE SECTION -->
    <h4 class="text-center my-4" id="more">MORE</h4>
    <p class="blockquote text-center mx-5">We want to facilitate the experiences of enjoying a good movie. You can use the platform to create your own list of favorite movies, so you can access it and see which movies interest you.</p>
    <div class="row py-3 mx-0">
     <div class="col-md-4 mx-auto">
      <button class="py-2 btn btn-block btn-info"  data-toggle="modal" data-target="#btnSignup">JOIN US!</button>
     </div>
    </div>
    <div class="col-md-12 mx-auto px-0 py-2" data-aos="fade-up"
    data-aos-anchor-placement="top-bottom" data-aos-duration="2000">
      <img src="img/portada2.png" class="my-5 w-100" alt="">
    </div>
    
    <%@include file="templates/footer.jsp" %>