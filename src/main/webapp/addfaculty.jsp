<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Faculty Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link"
						href="/facultyform">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Add Faculty</button>
					</a></li>


					<li class="nav-item"><a class="nav-link"
						href="/showfaculty"><button class="btn">View
								Faculty</button></a></li>


				</ul>

				<br> <br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-10"">
							<form class="row g-3 shadow p-3 rounded-2 " action="/savefaculty">
								<h4 class="text-center">Faculty Information Form</h4>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Faculty Id</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="id">
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Faculty Name</label> <input
										type="text" class="form-control" id="inputPassword4"
										name="name">
								</div>
								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Email</label>
									<input type="text" class="form-control" id="inputEmail4"
										name="email">
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Phone
										</label> <input type="text" class="form-control"
										id="inputPassword4" name="phone">
								</div>
								<div class="col-12">
									<label for="inputAddress" class="form-label">Address</label> <input
										type="text" class="form-control" id="inputAddress"
										name="address">
								</div>
								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Designation</label> <input
										type="text" class="form-control" id="inputEmail4" name="designation">
								</div>
								<div class="col-md-6">
									<label for="id" class="form-label">Department Name</label>
								<select name="departmentname" class="form-select" aria-label="Default select example" id="id">
									<c:forEach var="d" items="${de }">
									<option value="${d.departmentname }">${d.departmentname }</option>
									</c:forEach>
									
								</select>
								</div>
								<div class="col-md-6">
									<label for="inputEmail4" class="form-label">Birth of date</label>
									<input type="date" class="form-control" id="inputEmail4"
										name="bod">
								</div>
								<div class="col-md-6">
									<label for="inputPassword4" class="form-label">Blood
										Group</label> <input type="text" class="form-control"
										id="inputPassword4" name="bloodgroup">
								</div>
								<div class="col-md-6">
									<label for="id" class="form-label">Gender</label> <select
										name="gender" class="form-select"
										aria-label="Default select example" id="id">
										<option value="">--Select Gender--</option>
										<option value="Male">Male</option>
										<option value="Female">Female</option>

									</select>
								</div>

								
								
								
								<div class="col-12 d-grid gap-3">
									<button type="submit" class="btn btn-primary">Submit
										</button>
								</div>
							</form>
						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>