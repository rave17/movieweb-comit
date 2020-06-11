
<%@page import="com.mycompany.moviewebproject.model.entities.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <div class="jumbotron mb-0 pt-4 pb-0">
      <div class="row d-flex justify-content-around pt-3">
        <div class="col-md-6 col-sm-12 mx-auto">
          <ul>
            <li>
              <h2 class="display-5 pl-2">Movie<span class="text-success">Web</span></h2>
            </li>
            <li><img src="img/favicon.png" class="img-fluid pb-3" alt="Movie web"></li>
          </ul>
        </div>
        <div class="col-md-4 col-sm-12 mx-auto p-0">
          <ul class=" d-flex justify-content-around p-0">
            <li class="d-block footerList">
              <h5><a href="userhome.jsp">Home</a></h5>
              <ul class=" footerList">
                <li><a href="userhome.jsp#explore">Explore</a></li>
                <li><a href="userhome.jsp#inputSearch">Search</a></li>
              </ul>
            </li>
            <li class="d-block footerList">
              <h5><a href="userprofile.html">Profile</a></h5>
              <ul class="footerList">
                <li><a href="userprofile.jsp#editInfo">Edit info</a></li>
                <li><a href="userprofile.jspl#moviesList">List</a></li>
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
      <hr class="my-2">
      <div class="row pt-2">
        <div class="col-md-6 my-0">
          <p class="footer-copyright display-5 text-center">© 2020 Copyright: Comunidad IT</p>
        </div>
        <div class="col-md-6">
          <div class="mb-0 text-center">
            <a href="#" class="fb-ic text-secondary" title="Facebook">
              <i class="fab fa-facebook-f fa-lg white-text mr-4"> </i>
            </a>
            <a href="#" class="tw-ic text-secondary" title="Twitter">
              <i class="fab fa-twitter fa-lg white-text mr-4"> </i>
            </a>
            <a href="#" class="ins-ic text-secondary" title="Instagram">
              <i class="fab fa-instagram fa-lg white-text mr-4"> </i>
            </a>
          </div>
        </div>
      </div>
    </div>
    <!-- BUTTON TO TOP -->
    <button class="btn btn-success toTop" id="toTopBtn" title="Go to top" onclick="toTop()"> <i
        class="fas fa-chevron-up"> </i></button>
  </div>

  <!-- Bootrstrap 4.0 JS/POPPER/JQUERY -->
 
  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
  <script src="js/btnFunction.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/particlesjs/2.2.3/particles.min.js"></script>
  <script src="https://unpkg.com/axios/dist/axios.min.js"></script>
  <script src="js/moviedb.js"></script>
  <script src="js/getOneMovie.js"></script>
  <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
  <script src="js/lengthLimit.js"></script>
 
  
  <script>
    AOS.init();
  </script>
  
  
</body>




</html>