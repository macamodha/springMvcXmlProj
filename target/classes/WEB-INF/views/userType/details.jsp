<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:genericpage>
    <jsp:attribute name="header">
     <!--  <h1>Welcome</h1> -->
    </jsp:attribute>
    <jsp:attribute name="footer">
      <!-- <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p> -->
    </jsp:attribute>
    <jsp:body>
        <div style="margin: 10px">
		<h3>User Type Details</h3>
	</div>
	<hr/>
	
	<div class="form-group" style="margin: 10px">
		<form:form method="post" >
			<div class="form-group">
				<label class="font-weight-bold">First Name </label>
				<input type="text" value="${uTypeDescr}" disabled class="form-control"/>
				
			</div>
			<div class="form-group">
				<label class="font-weight-bold">Status </label>
				<input type="text" value="${uTypeStat}" disabled class="form-control"/>
			</div>
			
			<div style="margin: 10px">
			<a href="<c:url value='/userType/delete/${uTypeId}' /> " class="btn btn-danger">Delete</a>
			<a href="<c:url value='/userType/list' /> " class="btn btn-success" >Return to list</a>
		</div>
		</form:form>
		
	</div>
    </jsp:body>
</t:genericpage>