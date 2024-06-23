<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body onload="myFunction()">


  <!-- Button trigger modal -->
 

  <script>
    function myFunction(){
      var myModal = new bootstrap.Modal(document.getElementById('exampleModal'))
      myModal.show()
    }
  </script>
       <!-- The Modal -->
       <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalLabel">Add Your FAQ</h5>
            </div> 
        <!-- Modal body -->
        <div class="modal-body">
            <div class="form-group">
                <label class="form-lable">Question</label>
                <input type="text" class="form-control" name="Blog Title" placeholder="Enter Your Question" required="required">	
                <label class="form-lable">Answer</label>
                <input type="text" class="form-control" name="Blog Title" placeholder="Enter Your Answer" required="required">
                <br>
                <br>
                <div class="modal-footer">
                  <button type="button" class="btn btn-primary" data-bs-dismiss="modal"><a href="DashboardView.jsp" style="color:#ffffff;">Close</a></button>
                   <button type="button" class="btn btn-primary">Add</button>
                </div>
            </div>     
        </div>
      </div>
    </div>
  </div>   
    </div>
  </div>
</div>
</body>
</html>
</body>
</html>