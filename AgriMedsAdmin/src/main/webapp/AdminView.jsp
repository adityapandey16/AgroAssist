<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Admin Login Page</title>
</head>
<body>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title></title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
  <form action="AdminController">
    <section class="vh-100 gradient-custom">
      <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
          <div class="col-12 col-md-8 col-lg-6 col-xl-5">
            <div class="card bg-white text-dark" style="border-radius: 1rem;">
              <div class="card-body p-5 text-center">
    
                <div class="mb-md-5 mt-md-4 pb-5">
    
                  <h2 class="fw-bold mb-2 text-uppercase">Sign In To Your Admin Account
                  </h2>
                  <p class="text-grey-50 mb-5">Please enter your username and password!</p>
    
                  <div class="form-outline form-dark mb-4">
                    <input type="userId" id="userId" name="uname" placeholder="username" required="required" class="form-control form-control-lg" />
                    <label class="form-label" for="userId" ></label>
                  </div>
    
                  <div class="form-outline form-dark mb-4">
                    <input type="password" id="typePasswordX" name="pass" placeholder="password" required="required" class="form-control form-control-lg" />
                    <label class="form-label" for="typePasswordX"></label>
                  </div>
    
                  <p class="small mb-5 pb-lg-2"><a class="text-dark-50" href="#!">Forgot password?</a></p>
    
                  <button class="btn btn-outline-dark btn-lg px-5" style="background-color: #41B26F;" type="submit">SIGN IN</button>
    
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    </form>
  </body> 
</html>
</body>
</html>