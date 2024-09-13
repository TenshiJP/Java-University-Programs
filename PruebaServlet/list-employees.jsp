<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
	<title>Lista de Empleados</title>
	
	<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>Lista de Empleados</h2>
		</div>
	</div>

	<div id="container">
	
		<div id="content">
			<input type="button" value="Registro Nuevo"
			onclick="window.location.href='new-record.jsp';
			return false;"
			/>		
			<table>
			
				<tr>
					<th>ID</th>
					<th>Fecha Nacimiento</th>
					<th>Nombre</th>
					<th>Apellido</th>
					<th>Genero</th>
					<th>Fecha Contratacion</th>
				</tr>
				
				<c:forEach var="tmpEmployee" items="${EMPLOYEE_LIST}">
					
					<tr>
						<td> ${tmpEmployee.empNo} </td>
						<td> ${tmpEmployee.birthDate} </td>
						<td> ${tmpEmployee.firstName} </td>
						<td> ${tmpEmployee.lastName} </td>
						<td> ${tmpEmployee.gender} </td>
						<td> ${tmpEmployee.hireDate} </td>
					</tr>
				
				</c:forEach>
				
			</table>
		
		</div>
	
	</div>
</body>


</html>








