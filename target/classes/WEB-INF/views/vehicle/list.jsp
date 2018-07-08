<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:attribute name="header"></jsp:attribute>
    <jsp:attribute name="footer"></jsp:attribute>
    <jsp:body>
		<div style="margin: 10px">
			<h3>Vehicles</h3>
		</div>
		<hr/>
		<spring:url value="/vehicle/create" var="save" />
		<div class="form-group">
			<a class="btn btn-outline-primary btn-sm" href="${save}"> Add Vehicle</a>
			<br/>
		</div>
		
		<c:if test="${!empty vehicleList}">
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<caption>List of Vehicles</caption>
				<thead class="thead-light">
					<tr>
						<th>ID</th>
						<th>Vehicle Type</th>
						<th>Vehicle Brand</th>
						<th>Manufacture Year</th>
						<th>Color</th>
						<th>Vehicle No</th>
						<th></th>
					</tr>
				</thead>
				<c:forEach items="${vehicleList}" var="vList">
					<tr>
						<td><c:out value="${vList.vehicleId}" /></td>
						<td><c:out value="${vList.vehicleType}" /></td>
						<td><c:out value="${vList.vehicleBrand}" /></td>
						<td><c:out value="${vList.manufacyear}" /></td>
						<td><c:out value="${vList.color}" /></td>
						<td><c:out value="${vList.vehicleNo}" /></td>
						
						<td>
							<a href="<c:url value='/vehicle/edit/${vList.vehicleId}'/>"    class="btn btn-outline-warning btn-sm" >Edit</a>
							<a href="<c:url value='/vehicle/delete/${vList.vehicleId}'/>"  class="btn btn-outline-danger btn-sm"  >Delete</a>
							<a href="<c:url value='/vehicle/details/${vList.vehicleId}'/>" class="btn btn-outline-success btn-sm" >Details</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</c:if>
	</jsp:body>
</t:genericpage>