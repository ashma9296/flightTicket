<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Book Flight</title>
</head>
<body>

	<form:form id="loginForm" modelAttribute="flightobject" action="process-flight"
		method="post">

		<table align="center">
			<tr>
				<td><form:label path="triptype">Trip : </form:label></td>
				<td><input type="radio" name="triptype" path="triptype"
					value="oneway" checked> One Way <input type="radio"
					name="triptype" path="triptype" value="roundtrip"> Round
					Trip</td>
			</tr>
			<tr>
				<td><form:label path="to">To : </form:label></td>
				<td><form:input path="to" name="to" id="to" /></td>
			</tr>
			<tr>
				<td><form:label path="from"> From : </form:label></td>
				<td><form:input path="from" name="from" id="from" /></td>
			</tr>
			<tr>
				<td><form:label path="airlines">Airlines: </form:label></td>
				<td><form:select path="airlines">
						<form:option value="united"> United Airlines</form:option>
						<form:option value="american"> American Airlines</form:option>
						<form:option value="spirit"> Spirit Airlines</form:option>
					</form:select></td>
			</tr>

			<tr>
				<td></td>
				<td align="left"><form:button id="process" name="save">Process</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>
	</form:form>

</body>
</html>
