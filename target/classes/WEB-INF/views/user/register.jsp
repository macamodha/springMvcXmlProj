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
			<h3>User Registration Form</h3>
		</div>
		<hr/>
		<c:url var="action" value="/user/create" ></c:url>
		<div class="form-group" style="margin: 10px">
			<form:form method="post" action="${action}" modelAttribute="user">
				<div class="form-group">
					<form:label path="fName" class="font-weight-bold" >First Name </form:label>
					<form:input path="fName" class="form-control" />
					<form:errors  path="fName" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="lName" class="font-weight-bold"  >Last Name </form:label>
					<form:input path="lName" class="form-control" />
					<form:errors  path="lName" class="text-danger" />
				</div>
				<div class="form-group">
					<form:label path="email" class="font-weight-bold"  >Email </form:label>
					<form:input path="email" class="form-control" />
					<form:errors  path="email" class="text-danger" />
				</div>
				<div class="form-group">
					<form:label path="psw" class="font-weight-bold"  >Password </form:label>
					<form:input type="password" path="psw" class="form-control" />
					<form:errors  path="psw" class="text-danger" />
				</div>
				<div class="form-group">
					<form:label path="mobile" class="font-weight-bold"  >Mobile </form:label>
					<form:input path="mobile" class="form-control" />
					<form:errors  path="mobile" class="text-danger" />
				</div>
				<div class="form-group">
					<hr/>
					<input type="submit" value="Add User"  class="btn btn-primary"/>
					<a href="<c:url value='/user/list' />" class="btn btn-success">Return to Users</a>
				</div>
			</form:form>
		</div>
	</jsp:body>
</t:genericpage>