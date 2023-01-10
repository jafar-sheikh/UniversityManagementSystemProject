<%@ include file="header.jsp" %>
        <div class="col py-3">
        
        <br> <br> <br> <br>
        
          <div class="container">
					<div class="row justify-content-center">

						<div class="col-5">
							<form action="/updatedepartment" method="put" class="shadow p-3">
								<div>
									<h4 class="text-center">Update Department Information</h4>
								</div>
								<div class="mb-3">
									<label for="exampleInputEmail1" class="form-label">Department
										Code </label> <input name="departmentcode" type="text"
										class="form-control" id="exampleInputEmail1"
										aria-describedby="emailHelp" value=${d.departmentcode}>

								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">Department
										Name</label> <input name="departmentname" type="text"
										class="form-control" id="exampleInputPassword1"  value=${d.departmentname}>
								</div>
								<div class="mb-3">
									<label for="exampleInputPassword1" class="form-label">University
										Name</label> <input name="universityname" type="text"
										class="form-control" id="exampleInputPassword1" value=${d.universityname}>
								</div>

								<button type="submit" class="btn btn-primary"
									style="margin-left: 110px">Update Department</button>
							</form>
						</div>
					</div>
				</div>
            
           
        </div>
    <%@ include file="footer.jsp" %>