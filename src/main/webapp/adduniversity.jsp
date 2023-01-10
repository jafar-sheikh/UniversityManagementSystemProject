<%@ include file="header.jsp"%>
<div class="col py-3">

	<br> <br> <br> <br>

	<div class="container">
		<div class="row justify-content-center">
			<div class="">
				<h2 class="text-center text-success mb-3">${s}</h2>
			</div>
			<div class="col-5">
				<form action="/save" method="post" class="shadow p-4">
					<div>
						<h4 class="text-center">Add University</h4>
					</div>

					<div class="mb-3">
						<label for="exampleInputEmail1" class="form-label">University
							Code :</label> <input name="universitycode" type="text"
							class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp">

					</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">University
							Name :</label> <input name="universityname" type="text"
							class="form-control" id="exampleInputPassword1">
					</div>

					<button type="submit" class="btn btn-primary col-12 d-grid gap-2">Add
						University</button>
				</form>
			</div>
		</div>
	</div>


</div>
<%@ include file="footer.jsp"%>