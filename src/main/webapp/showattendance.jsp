<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Attendance Information</h2>

				


				<div class="container text-center">
					<div class="row">

						


						<table class="table table-hover shadow ">
							<thead>
								<tr class="table-primary">

									<th scope="col">Student Id</th>
									<th scope="col">Student Name</th>
									<th scope="col">Semester Name</th>
									<th scope="col">Course</th>
									<th scope="col">Department</th>
									<th scope="col">Present/Absent</th>
									<th scope="col">Date</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="s" items="${attendance}">
									<tr>
										<td>${s.id}</td>
										<td>${s.name}</td>
										<td>${s.semestername}</td>
										<td>${s.coursename}</td>
										<td>${s.departmentname}</td>
										<td>${s.checking}</td>
										<td>${s.date}</td>
									</tr>
								</c:forEach>


							</tbody>
						</table>

					</div>
				</div>


			</div>
		<%@ include file="footer.jsp" %>