<%-- 
    Document   : footer
    Created on : May 29, 2020, 11:21:00 PM
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="jumbotron mb-0 pt-4 pb-0">
    <div class="row d-flex justify-content-around pt-3">
      <div class="col-md-6 col-sm-12 mx-auto">
        <ul>
          <li><h2 class="display-5 pl-2">Movie<span class="text-success">Web</span></h2></li>
          <li><img src="img/favicon.png" class="img-fluid pb-3" alt="Movie web"></li>
       </ul>
      </div>
      <div class="col-md-4 col-sm-12 mx-auto p-0">
        <ul class=" d-flex justify-content-around p-0">
          <li class="d-block footerList">
            <h5><a href="home">Home</a></h5>
            <ul class=" footerList">
              <li><a href="index.jsp#login">Login</a></li>
              <li><a href="index.jsp#more">More</a></li>
              <li><a href="index.jsp#steps">Steps</a></li>
            </ul>
          </li>
          <li class="d-block footerList">
            <h5><a href="about.jsp">About us</a></h5>
            <ul class="footerList">
              <li>Team</li>
              <li>Blog</li>
            </ul>
          </li>
          <li class="d-block footerList">
            <h5><a href="contact.jsp">Contacto</a></h5>
            <ul class="footerList">
              <li>(011) 4841 5478</li>
              <li>Direccion 234 - Arg</li>
            </ul>
          </li>
        </ul>
      </div>
    </div>
  </div>
   <!-- BUTTON TO TOP -->
   <button class="btn btn-success toTop" id="toTopBtn" title="Go to top" onclick="toTop()"> <i class="fas fa-chevron-up"> </i></button>
  </div>

  <!-- Bootrstrap 4.0 JS/POPPER/JQUERY -->
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <script src="js/btnFunction.js"></script>
  <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
  <script src="js/validation.js"></script>
  
  <script>
    AOS.init();
  </script>
</body>

<div class="modal fade" id="btnSignup" tabindex="-1" role="dialog" aria-labelledby="signUpForm" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content bg-translucid-modal">
      <div class="modal-header">
        <h5 class="modal-title" id="signUpForm">WELCOME</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
<!-- form register -->     
      <form method="post" action="registeruser" class="p-4">
        <h5>Sign up</h5>
        <div class="row mt-3">
          <div class="col-md-6">
            <div class="form-group">
              <label for="name">First Name</label>
              <input type="text" class="form-control" placeholder="Name" name="name">
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="lastname">Last Name</label>
              <input type="text" class="form-control" placeholder="Lastname" name="lastname">
            </div>
          </div>
        </div>
        <div class="row">
          <div class="col-md-6">
            <div class="form-group">
              <label for="email">Email address</label>
              <input type="email" class="form-control" placeholder="example@movieweb.com" name="email">
            </div>
          </div>
          <div class="col-md-6">      
            <div class="form-group">
              <label for="nickname">Nickname</label>
              <input type="text" class="form-control" placeholder="Nickname" name="nickname">
            </div>
          </div>  
        </div>        
        <div class="row">
          <div class="col-md-6">
            <div class="form-group">
              <label for="password">Password</label>
              <input type="password" class="form-control" placeholder="xxxxx" name="password">
            </div>
          </div>
          <div class="col-md-6">
            <div class="form-group">
              <label for="confirmPassword">Confirm password</label>
              <input type="password" class="form-control" placeholder="xxxxx" name="password"
            </div>
          </div>         
        </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
        <button type="submit" class="btn btn-primary" name="btnRegister" id="#btnJoinUs">Join us</button>
      </div>
    </div>
      </form>
  </div>
</div>

</html>
