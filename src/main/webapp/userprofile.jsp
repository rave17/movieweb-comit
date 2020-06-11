<%-- 
    Document   : userprofile
    Created on : May 30, 2020, 11:27:07 AM
    Author     : rober
--%>

<%@include file="usertemplates/userheader.jsp"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
  <!-- FRONT PAGE -->

      <div class="row rounded m-5 px-0 pb-3" id="particles-js">
        <div class="col-md-8 text-center mx-auto bg-translucid shadow-port pb-3" id="containerComment"
          data-aos="fade-left" data-aos-anchor-placement="button-center" data-aos-duration="1600">
          <!-- Info comment: nameUser-commentContent-movieName -->
          <div class="mx-auto py-2">
              <img src=<%= userSession.getUserAvatar() %> id="" class="rounded-circle border border-success imgProfile p-0 img-fluid" alt="userimage">
          </div>
          <h5 id="userNameComment"><%= userSession.getUserName() %></h5>
          <p id="descriptionUser"><%= userSession.getUserDescription() %></p>
          <button class="btn btn-success" value="<%= userSession.getUserId() %>" id="editDataUser" data-toggle="modal" data-target="#btnSignup">
           Edit info
          </button>
         
        </div>
      </div>
    </div>

    <!-- FAVORITES -->
    <h4 class="text-center my-5" id="list">FAVORITES</h4>
    <div class="row mx-4 my-5" data-aos="fade-up" data-aos-anchor-placement="top-bottom" data-aos-duration="2000">
      <div class="col-md-10 mx-auto text-center table-responsive">
        <table id="moviesList" class="table table-bordered table-striped table-hover text-secondary">
          <thead>
            <tr>
            <th scope="col-3">Movie title</th>
            <th scope="col-7">Synopsis</th>
            <th scope="col-2">Delete</th>
          </tr>
          </thead>
          <tbody>
            <tr>
              <td>Movie example</td>
              <td>Synopsis movie data Lorem ipsum dolor sit, amet consectetur adipisicing elit. Aliquam doloribus nisi at libero commodi animi? Lorem ipsum dolor, sit amet consectetur adipisicing elit.</td>
         
              <td class="px-0">
                  <button class="btn btn-danger btn-xs" data-title="Remove" data-target="#remove">
                    <i class="fas fa-trash-alt"></i>
                  </button>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>

    
    <!--MODAL -->
    
    
  <div class="modal fade" id="btnSignup" tabindex="-1" role="dialog" aria-labelledby="signUpForm" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content bg-translucid-modal">
      <div class="modal-header">
        <h5 class="modal-title" id="signUpForm">EDIT YOUR PROFILE</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
<!-- form register -->     
      <form class="py-4 mx-auto" method="put" action="user">
        <h5>Edit</h5>
        <div class="row">
          <div class="col-md-12">
            <div class="form-group">
              <label for="nickname">Nickname</label>
              <input type="text"  name="nickname" class="form-control" value="<%= userSession.getUserNickname() %>" id="nickname">
            </div>
          </div>
        </div>
          <div class="row">
            <div class="col-md-12">
              <label for="file">Insert image URL</label>
            </div>
          <div class="col-md-12">
            <div class="form-group">        
            <input type="text" class="form-control" name="avatar" id="<%= userSession.getUserId() %>">
            </div>
          </div>
        </div>

        <div class="row">
          <div class="col-md-12">
            <div class="form-group">
              <label for="description">Description</label>
              <textarea type="text" name="description" value="<%= userSession.getUserDescription() %>" class="form-control" rows="3" maxlength="99" id="#description"></textarea>
              <span id="charsCount">99</span> characters remaining
            </div>
          </div>
        </div>

             
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
        <button type="submit" class="btn btn-primary" id="#btnJoinUs">Edit</button>
              
      </form>
    </div>
  </div>
</div>
  
    <!-- FOOTER -->
    
    
    <%@include file="usertemplates/userfooter.jsp"%>