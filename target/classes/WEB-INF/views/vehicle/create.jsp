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
			<h3>Create Vehicle </h3>
		</div>
		<hr/>
		<c:url var="action" value="/vehicle/save" ></c:url>
		<div class="form-group" style="margin: 10px">
			<form:form method="post" action="${action}" modelAttribute="vehicle">
				<div class="form-group">
					<form:label path="vehicleType" class="font-weight-bold" >Vehicle Type</form:label>
					
					<form:select path="vehicleType" class="form-control dropdown-toggle" >
						<form:option value="">Select a Vehicle Type</form:option>
						<c:forEach items="${vehicleTypeList}" var="vTypeList">
							<form:option value="${vTypeList.typename}">${vTypeList.typename}</form:option>
						</c:forEach>
					</form:select> 
					<form:errors  path="vehicleType" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="vehicleBrand" class="font-weight-bold"  >Vehicle Brand </form:label>
					
					<form:select path="vehicleBrand" class="form-control dropdown-toggle" > 
						<form:option value="">Select a Vehicle Brand</form:option>
						<c:forEach items="${vehicleBrandList}" var="vbList">
							<form:option value="${vbList.brandId}">${vbList.brandname}</form:option>
		  				</c:forEach>
					</form:select>
					<form:errors  path="vehicleBrand" class="text-danger" />
				</div>
				<div class="form-group">
					<form:label path="manufacyear" class="font-weight-bold" >Manufacture Year</form:label>
					<form:input path="manufacyear" class="form-control" />
					<form:errors  path="manufacyear" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="color" class="font-weight-bold" >Color</form:label>
					<form:input path="color" class="form-control" />
					<form:errors  path="color" class="text-danger"/>
				</div>
				<div class="form-group">
					<form:label path="vehicleNo" class="font-weight-bold" >Vehicle No</form:label>
					<form:input path="vehicleNo" class="form-control" />
					<form:errors  path="vehicleNo" class="text-danger"/>
				</div>
				
				<div class="form-group">
					<hr/>
					<input type="submit" value="Save Vehicle"  class="btn btn-primary"/>
					<a href="<c:url value='/vehicle/list' />" class="btn btn-success">Return to Vehicles</a>
				</div>
			</form:form>
		</div>
	</jsp:body>
</t:genericpage>