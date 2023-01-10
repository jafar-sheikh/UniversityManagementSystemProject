<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Result Information</h2>

				

				<br> <br>

				<div class="container">
					<div class="row justify-content-center">

						<div class="col-12">

							<div class="container ">
								<div class="row">
									<div class="col">
										<h5>All Result</h5>
									</div>
									<div class="col">
										<form class="d-flex" role="search" action="">
											<input name="departmentname" class="form-control me-2" type="search"
												placeholder="Search by department name" aria-label="Search">
											<button class="btn btn-outline-success" type="submit">Search</button>
										</form>
									</div>
								</div>

							</div>

							<br>

							<table class="table table-hover shadow ">
								<thead>
									<tr class="table-primary">

										<th scope="col">ID</th>
										<th scope="col"> Name</th>
										
										<th scope="col">Semester Name</th>
										<th scope="col">Course Name</th>
										<th scope="col">Test 1 Number</th>
										<th scope="col">Test 2 Number</th>
										<th scope="col">Mid Number</th>
										<th scope="col">Final Number</th>
										<th scope="col">GPA</th>
										<th scope="col">Gread</th>
										<th scope="col">Edit</th>
										<th scope="col">Delete</th>


									</tr>
								</thead>
								<tbody>
									<c:forEach var="d" items="${facultyresult}">
										<tr>
											<td>${d.id }</td>
											<td>${d.name }</td>
											<td>${d.sementername }</td>
											<td>${d.coursename }</td>
											<td>${d.test1 }</td>
											<td>${d.test2 }</td>
											<td>${d.mid }</td>
											<td>${d.finaltest }</td>
											<td>${d.cgpa }</td>
											<td>${d.gread }</td>
											<td>
												<form action="">
													<button type="submit" class="btn btn-outline-info btn-sm">Update</button>
												</form>
											</td>
											<td>
												<form action="">
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