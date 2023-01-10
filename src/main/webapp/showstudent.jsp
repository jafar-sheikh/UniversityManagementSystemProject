<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Student Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link"
						href="/addstudentform">
							<button type="button" class="btn" data-bs-toggle="modal"
								data-bs-target="#exampleModal">Add Student</button>
					</a></li>


					<li class="nav-item"><a class="nav-link"
						href="/showstudent"><button class="btn">View
								Student</button></a></li>


				</ul>

				<br> <br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-12">

							<div class="container ">
								<div class="row">
									<div class="col">
										<h5>All Student</h5>
									</div>
									<div class="col">
										<form class="d-flex" role="search" action="/searchstudent">
											<input name="id" class="form-control me-2" type="search"
												placeholder="Search by student Id" aria-label="Search">
											<button class="btn btn-outline-success" type="submit">Search</button>
										</form>
									</div>
								</div>

							</div>

							<br>

							<table class="table table-hover shadow ">
								<thead>
									<tr class="table-primary">

										<th scope="col">Student Id</th>
										<th scope="col">Student Name</th>
										<th scope="col">Father's Name</th>
										<th scope="col">Mother's Name</th>
										<th scope="col">Email</th>
										<th scope="col">Phone</th>
										<th scope="col">Address</th>
										<th scope="col">Date of Birth</th>
										<th scope="col">Blood Group</th>
										<th scope="col">Photo</th>
										<th scope="col">Gender</th>
										<th scope="col">Semester Fee</th>
										<th scope="col">Quota</th>
										<th scope="col">Department code</th>
										<th scope="col">Department Name</th>
										
										<th scope="col">Edit</th>
										<th scope="col">Delete</th>


									</tr>
								</thead>
								<tbody>
									<c:forEach var="s" items="${st}">
										<tr>
											<td>${s.id}</td>
											<td>${s.name}</td>
											<td>${s.father_name}</td>
											<td>${s.mother_name}</td>
											<td>${s.email}</td>
											<td>${s.phone}</td>
											<td>${s.address}</td>
											<td>${s.birthdate}</td>
											<td>${s.blood_group}</td>
											<td>${s.photo}</td>
											<td>${s.gender}</td>
											<td>${s.semester_fee}</td>
											<td>${s.quta}</td>
											<td>${s.departmentcode}</td>
											<td>${s.departmentname}</td>
											<td>
												<form action="/studentformgetvalue/${s.getId()}">
													<button type="submit" class="btn btn-outline-info btn-sm">Update</button>
												</form>
											</td>
											<td>
												<form action="/deletestudent/${s.getId()}">
													<button type="submit" class="btn btn-outline-danger btn-sm">Delete</button>
												</form>
											</td>
										</tr>
									</c:forEach>


								</tbody>
							</table>

						</div>
					</div>
				</div>

			</div>
		<%@ include file="footer.jsp" %>