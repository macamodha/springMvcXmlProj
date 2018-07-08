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
			<h3>User Types</h3>
		</div>
		<hr/>
		<spring:url value="/userType/create" var="save" />
		<div class="form-group">
			<a class="btn btn-outline-primary btn-sm" href="${save}"> Add User Type</a>
			<br/>
		</div>
		
		<c:if test="${!empty userTypeList}">
		<div class="table-responsive">
			<table class="table table-striped table-hover">
				<caption>List of user types</caption>
				<thead class="thead-light">
					<tr>
						<th>ID</th>
						<th>User Type Description</th>
						<th>Status</th>
						<th>Settings</th>
					</tr>
				</thead>
				<c:forEach items="${userTypeList}" var="usrTp">
					<tr>
						<td><c:out value="${usrTp.uTypeId}" /></td>
						<td><c:out value="${usrTp.uTypeDescr}" /></td>
						<td><c:out value="${usrTp.uTypeStat}" /></td>
						
						<td>
							<a href="<c:url value='/userType/edit/${usrTp.uTypeId}'/>"    class="btn btn-outline-warning btn-sm" >Edit</a>
							<a href="<c:url value='/userType/delete/${usrTp.uTypeId}'/>"  class="btn btn-outline-danger btn-sm"  >Delete</a>
							<a href="<c:url value='/userType/details/${usrTp.uTypeId}'/>" class="btn btn-outline-success btn-sm" >Details</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</c:if>
	</jsp:body>
</t:genericpage>