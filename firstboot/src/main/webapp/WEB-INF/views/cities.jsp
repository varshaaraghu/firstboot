<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/style.css" rel ="stylesheet">
<script src="resources/jquery-3.4.1.min.js"></script>
<script src="resources/script.js"></script>

</head>
<body>
	<div class="searchbox">
		Search a city &nbsp;&nbsp;&nbsp;&nbsp; <input type="text" id="city"><br><br><br>
		Select a country
		<select id="country">
		<c:forEach items="${countries}" var="x">
			<option value="${x.code}">${x.name }</option>
		</c:forEach>
		</select>
	</div>
<span>	
<table>
	<thead>
	<tr>
		<th>CITY</th>
		<th>DISTRICT</th>
		<th>POPULATION</th>
	</tr>	
	</thead>
	<tbody id="tdata"></tbody>
</table>
</span>	
<!--<table>
	<thead>
	<tr>
		<th>CODE</th>
		<th>NAME</th>
		<th>CONTINENT</th>
		<th>CAPITAL</th>
		<th>POPULATION</th>
	</tr>	
	</thead>
	<tbody id="tdata1"></tbody>
</table>	
-->
</body>
</html>