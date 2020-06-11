<%-- 
    Document   : usercontact
    Created on : May 30, 2020, 11:26:32 AM
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="usertemplates/userheader.jsp"%>

      <h3 class="display-4 text-center py-5">CONTACT</h3>
</div>
<!-- FORM -->
  <div class="container row mx-auto d-flex justify-content-around my-4">
    <div class="col-md-5 shadow-port py-4 rounded">
      <form action="contact" method="post">
          <input type="hidden" name="<%= userSession.getUserEmail() %>">
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

<%@include file="usertemplates/userfooter.jsp"%>