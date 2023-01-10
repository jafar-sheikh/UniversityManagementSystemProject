<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Payment Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link" href=""><button
								class="btn">View Payment</button></a></li>


				</ul>

				<div class="container ">
					<div class=" row justify-content-center">
						<table class="table table-hover shadow ">
							<thead>
								<tr class="table-primary">

									<th scope="col">Id</th>
									<th scope="col">Student Name</th>
									<th scope="col">Payment Method</th>
									<th scope="col">Card/Phone Number</th>
									<th scope="col">Transaction Id</th>
									<th scope="col">Semester Name</th>
									<th scope="col">Total</th>
									<th scope="col">Edit</th>
									<th scope="col">Delete</th>


								</tr>
							</thead>
							<tbody>
								<c:forEach var="s" items="${sp}">
									<tr>
										<td>${s.id }</td>
										<td>${s.name }</td>
										<td>${s.p_method }</td>
										<td>${s.phone }</td>
										<td>${s.t_id }</td>
										<td>${s.semestername }</td>
										<td>${s.total }</td>
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
		<%@ include file="footer.jsp" %>