<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nuevo Empleado</title>

<link type= "text/css" rel="stylesheet" href="css/style.css">
<link type= "text/css" rel="stylesheet" href="css/new-record-style.css">

</head>
<body>

	<div id="wrapper">
		<div id="header">
		<h2> Empleados</h2>
		</div>
	</div>
	
	<div id="container">
	<h3>Nuevo registro</h3>
	
	<form action="EmployeeControllerServlet" method="GET">
		<input type="hidden" name="opcion" value="Nuevo"/>
		<table>
			<tbody>
				<tr>
					<td><label> Fecha nacimiento</label></td>
					<td><input type="text" name="birthDate" required /></td>
				</tr>
			
				<tr>
					<td><label> Nombre</label></td>
					<td><input type="text" name="firstName" required/></td>
				</tr>

				<tr>
					<td><label> Apellido</label></td>
					<td><input type="text" name="lastName" required/></td>
				</tr>		
				
				<tr>
					<td><label> Genero</label></td>
					<td><input type="text" name="gender" required/></td>
				</tr>
				<tr>
					<td><label> Fecha de Contratacion</label></td>
					<td><input type="text" name="hireDate" required/></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Guardar" class="save"/></td>
				</tr>
				
			</tbody>
		</table>
	</form>
	
	<div style="clear: both;"></div>
	
	<p>
		<a href="EmployeeControllerServlet">Regresar</a>
	
	</div>

</body>
</html>