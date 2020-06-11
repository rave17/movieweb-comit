<%-- 
    Document   : movie
    Created on : May 30, 2020, 11:23:50 AM
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="usertemplates/userheader.jsp"%>
    <!-- FRONT PAGE -->
         <div class="row mt-2 mx-0 bg-translucid-modal px-0" data-aos="fade-up" data-aos-anchor-placement="top-bottom" data-aos-duration="2000">
      <div id="movie" class="col-md-10 col-sm-10 card-deck d-flex justify-content-between mx-auto mb-4">

      </div>
        <!-- DATA MOVIE -->
  
      </div>
      <div class="row px-0 mx-0">
        <div class="col-md-6 mx-auto my-3" id="containerComments">
          <div class="container mx-auto" id="containerCommentsOfMovie">
            <!-- comments -->
          </div>
          <form action="comment" method="post" class="form-group">
            <div class="form-group">
              <label for="comment"><h5 class="text-success">Comment</h5></label>
              <textarea class="form-control" name="content" id="comment" rows="6"></textarea>
            </div>
            <button type="submit" value="id" class="btn btn-success btn-block">Comment</button>
          </form>
        </div>
      </div>
    <!-- FOOTER -->
    
<%@include file="usertemplates/userfooter.jsp"%>