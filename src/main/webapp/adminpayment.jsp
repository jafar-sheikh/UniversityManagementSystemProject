<%@ include file="header.jsp" %>
			<div class="col py-3">

				<h2 class="text-center">Payment Information</h2>

				<ul class="nav nav-tabs">
					<li class="nav-item"><a class="nav-link" href="/showstudentpayment"><button
								class="btn">View Payment</button></a></li>


				</ul>

				<div class="container ">
				<div class=" row justify-content-center">
				<div class="col-5">
				<h2 class="text-center">Create payment</h2>
					<form  role="search" action="/searchadminpayment" class="shadow p-4">
						<label for="id" class="form-label">Select Department</label> <select
							name="departmentname" class="form-select"
							aria-label="Default select example" id="id">
							<c:forEach var="d" items="${de}">
								<option value="${d.departmentname }">${d.departmentname }</option>
							</c:forEach>

						</select>
						<label for="id" class="form-label">Select Semester</label> <select
							name="semestername" class="form-select mb-3"
							aria-label="Default select example" id="id">
							<c:forEach var="s" items="${se}">
								<option value="${s.semestername }">${s.semestername }</option>
							</c:forEach>

						</select>
						<button class="btn btn-primary col-12 d-grid gap-2" type="submit">Go</button>
					</form>
					</div>
				</div>
				</div>


			</div>
		<%@ include file="footer.jsp" %>