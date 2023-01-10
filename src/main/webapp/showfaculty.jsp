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

						<div class="col-12">

							<div class="container ">
								<div class="row">
									<div class="col">
										<h5>All Faculty</h5>
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

										<th scope="col">Faculty Id</th>
										<th scope="col">Faculty Name</th>
										<th scope="col">Email</th>
										<th scope="col">Phone</th>
										<th scope="col">Address</th>
										<th scope="col">Date of Birth</th>
										<th scope="col">Blood Group</th>
										<th scope="col">Designation</th>
										<th scope="col">Department</th>
										<th scope="col">Gender</th>
										
										<th scope="col">Edit</th>
										<th scope="col">Delete</th>


									</tr>
								</thead>
								<tbody>
									<c:forEach var="f" items="${fc}">
										<tr>
											<td>${f.id}</td>
											<td>${f.name}</td>
											<td>${f.email}</td>
											<td>${f.phone}</td>
											<td>${f.address}</td>
											<td>${f.bod}</td>
											<td>${f.bloodgroup}</td>
											<td>${f.designation}</td>
											<td>${f.departmentname}</td>
											<td>${f.gender}</td>
											
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