
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="usertemplates/userheader.jsp"%>
      <!-- EXPLORE-->
      <h3 class="text-center py-5" id="explore">EXPLORE</h3>
    </div>
      <!-- CAROUSEL MOVIE -->
    <div class="row mx-0">
      <div class="col-md-8 mx-auto my-3">
      <form action="" class="form-group row" id="searchForm">
        <input type="text" class="form-control col-md-10" placeholder="Search a movie" id="searchText" aria-label="movie search"
          aria-describedby="basic-addon2">
          <button class="btn btn-outline-secondary" id="searchBtn" type="submit">Search</button>
        </form>
      </div>
    </div>
    <hr class="w-75">

    <div class="row mt-2 mx-0" data-aos="fade-up" data-aos-anchor-placement="top-bottom" data-aos-duration="2000" >
      <div class="col-md-10 col-sm-10 card-deck d-flex justify-content-between mx-auto mb-4" id="movies">

      </div>
      
      <!-- DATA MOVIE -->

      <hr class="w-75">
    </div>
<%@include file="usertemplates/userfooter.jsp"%>