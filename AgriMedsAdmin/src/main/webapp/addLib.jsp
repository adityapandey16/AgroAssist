<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add in Library</title>
</head>
<body>
<form action="AddLibController" method="post" >
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
   <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">Add In Library</h5>
        </div> 
          <div class="modal-body">
              <div class="form-group">
                <label class="form-lable">Crop ID</label>
                <input type="text" class="form-control" name="CropId" placeholder="Enter crop id" required="required">	
                <label class="form-lable">Crop Name</label>
                <input type="text" class="form-control" name="CropName" placeholder="Enter crop name" required="required">
                <label class="form-lable">Pathegon ID</label>
                <input type="text" class="form-control" name="PathId" placeholder="Enter Pathegon id" required="required">
                <label class="form-lable">Pathegon Name</label>
                <input type="text" class="form-control" name="PathName" placeholder="Enter Pathegon name" required="required">
                <label class="form-lable">Crop Part</label>
                <input type="text" class="form-control" name="CropPart" placeholder="Enter crop part name" required="required">
                <label class="form-lable">Crop Description</label>
                <textarea class="form-control" name="CropDesc" aria-placeholder="Enter crop description" required="required"></textarea>
                <br>
                <br>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-bs-dismiss="modal"><a href="DashboardView.jsp" style="color:#ffffff;">Close</a></button>
                     <button type="submit" class="btn btn-primary">Add Data</button>
                </div>
            </div>     
        </div>    
      </div>
    </div>
  </div>
  
</div>

</body>
</html>
</form>
</body>
</html>