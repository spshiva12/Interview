<%@ page import="java.util.ArrayList"%>
<%@ page import="com.ojas.beans.Product"%>

<!DOCTYPE html>
<html>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<head>
<title>Product Details</title>
</head>
<body>
	<form class="container">

		<%
		// Assume you have an ArrayList of Student objects named "students"
		ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("productList");
		%>
		<table class="table table-hover table-dark table-striped">
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th colspan="3">Actions</th>
				</tr>
			</thead>
			<tbody>
				<%
				for (Product pro : products) {
				%>
				<tr>
					<td><%=pro.getPid()%></td>
					<td><%=pro.getPname()%></td>
					<!-- <td><input type="submit" value="View" id="button-1" /></td>
				<td><input type="submit" formaction="" value="Update"
					id="button-2" /></td> -->
					<td><input type="submit" value="delete"
						formaction="deleteData/<%=pro.getPid()%>" id="button-3" /></td>
				</tr>
				<%
				}
				%>
			</tbody>
		</table>
	</form>
</body>
</html>
