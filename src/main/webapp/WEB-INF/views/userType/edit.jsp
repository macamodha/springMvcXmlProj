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
			<h3>Edit User Type </h3>
		</div>
		<hr/>
		<c:url var="action" value="/userType/update" ></c:url>
		<div class="form-group" style="margin: 10px">
			<form:form method="post" action="${action}" modelAttribute="userType">
			
				<div class="form-group">
					<form:hidden path="uTypeId"/>
					<form:label path="uTypeDescr" class="font-weight-bold" >User Type Description </form:label>
					<form:input path="uTypeDescr" class="form-control" />
					<form:errors  path="uTypeDescr" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="uTypeStat" class="font-weight-bold"  >Status </form:label>
					<form:select path="uTypeStat" class="form-control dropdown-toggle" > 
						<form:option value="">Select a status</form:option>
						<form:option value="A">Active</form:option>
		  				<form:option value="I">Inactive</form:option>
					</form:select>
					<form:errors  path="uTypeStat" class="text-danger" />
				</div>
				
				<div class="form-group">
					<hr/>
					<input type="submit" value="Update User Type"  class="btn btn-primary"/>
					<a href="<c:url value='/userType/list' />" class="btn btn-success">Return to User Types</a>
				</div>
			</form:form>
		</div>
	</jsp:body>
</t:genericpage>