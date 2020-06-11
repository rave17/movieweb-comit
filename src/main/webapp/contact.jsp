<%-- 
    Document   : contact
    Created on : May 30, 2020, 12:06:47 AM
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="templates/header.jsp"%>
    <!-- CONTACT -->
  <h3 class="display-4 text-center py-5">CONTACT</h3>
</div>
<!-- FORM -->
  <div class="container row mx-auto d-flex justify-content-around">
    <div class="col-md-5 shadow-port py-4 rounded">
      <form action="contact" method="post">
        <div class="form-group">
          <label for="emailContact"></label>
          <div class="input-group">
            <div class="input-group-prepend">
              <div class="input-group-text">
                <i class="fa fa-envelope"></i>
              </div>
            </div>
            <input name="email" placeholder="email@contact.com" type="text" required="required"
              class="form-control">
          </div>
        </div>
        <div class="form-group">
          <label for="emailContact"></label>
          <div class="input-group">
            <input name="title" placeholder="Subject" type="text" required="required"
              class="form-control">
          </div>
        </div>
        <div class="form-group">
          <label for="message"></label>
          <textarea id="message" name="message" cols="40" rows="10" maxlength="99" required="required" class="form-control"></textarea>
        </div>
        <div class="form-group">
          <button type="submit" class="btn btn-block btn-primary mt-4">Send</button>
        </div>
      </form>
    </div>
    <div class="col-md-5 my-4 rounded">
      <img src="img/map.jpg" class="img-fluid" alt="Location">
      <div class="text-center col-md-12 py-2">
        <h4>AV LAMASOLA 123</h4>
        <h4>BUENOS AIRES - ARGENTINA</h4>
        <h4>4585 - 2255</4>
        <h5>moviesapp@movie.com</h5>
      </div>
    </div>
  </div>

    <!-- MORE SECTION -->
    <h4 class="text-center my-4" id="more">MORE</h4>
    <p class="blockquote text-center mx-5">We want to make you easy the experiences of enjoy a good movie.  You can use the platform for create your own list of favorites movies, of this way you can access it and see what movies you interested.</p>
    <div class="row py-3 mx-0">
     <div class="col-md-4 mx-auto">
      <button class="py-2 btn btn-block btn-info" id="signUpBtnButtom">JOIN US!</button>
     </div>
    </div>
    <div class="col-md-12 mx-auto px-0 py-2" data-aos="fade-up"
    data-aos-anchor-placement="top-bottom" data-aos-duration="2000">
      <img src="img/portada2.png" class="my-5 w-100" alt="">
    </div>
    <%@include file="templates/footer.jsp"%>