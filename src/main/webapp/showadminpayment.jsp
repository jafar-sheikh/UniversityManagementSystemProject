<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Payment Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link" href="/showstudentpayment"><button
								class="btn">View Payment</button></a></li>


				</ul>


				<div class="container text-center">
					<div class="row">

						<h3>Create Payment</h3>


						<table class="table table-hover shadow ">
							<thead>
								<tr class="table-primary">

									<th scope="col">Student Id</th>
									<th scope="col">Student Name</th>
									<th scope="col">Semester Name</th>
									<th scope="col">Department</th>
									<th scope="col">Action</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="s" items="${as}">
									<tr>
										<td>${s.id}</td>
										<td>${s.name}</td>
										<td>${s.semestername}</td>
										<td>${s.departmentname}</td>


										<td>
											<form action="/createadminpayment/${s.getId()}">
												<button type="submit" class="btn btn-outline-info btn-sm">Create
													Payment</button>
											</form>
										</td>

									</tr>
								</c:forEach>


							</tbody>
						</table>

					</div>
				</div>


			</div>
		<%@ include file="footer.jsp" %>