<%-- 
    Document   : resetpassword
    Created on : Jun 1, 2020, 2:51:33 PM
    Author     : rober
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="templates/header.jsp"%>
<div class="container-fluid py-5">
    <div class="row">
        <h4 class=" mx-auto py-4">Reset your password </h4>
    </div>
    <div class="row mx-auto my-auto">
         
          <div class="container col-md-4 col-sm-12 p-4 bg-translucid mb-4 rounded">
            <form class="py-auto" action="login" method="post" class="needs-validation" novalidate>
             
              <div class="form-group row">
                <div class="col-md-12">
                  <label for="user">Email</label>
                  <div class="input-group">
                    <input name="email" type="email" required="required"
                      class="form-control">
                  </div>
                  <p class="pt-3">We send you a mail if you are registred<p>
                </div>
              </div>
              
              <div class="form-group row">
                <div class="col-md-12">
                  <button type="submit" name="resetBtn"  class="btn btn-block btn-primary">Send</button>
                </div>
              </div>
            </form>
          </div>
        
    </div>
</div>
</div>

<%@include file="templates/footer.jsp" %>

