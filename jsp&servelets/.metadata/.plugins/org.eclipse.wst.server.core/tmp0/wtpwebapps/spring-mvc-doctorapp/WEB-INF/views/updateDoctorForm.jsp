<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateDoctor">
DoctorName<input type="text" name="doctorName" value="${doctor.doctorName }"readonly ><br>
DoctorId<input type="text" name="doctorId" value="${doctor.doctorId }" readonly><br>
Speciality<input type="text" name="speciality" value="${doctor.speciality }" readonly><br>
Fees<input type="number" name="fees" value="${doctor.fees }" ><br>
Ratings<input type="number" name="ratings" value="${doctor.ratings }" readonly><br>
Experience<input type="number" name="experience" value="${doctor.experience }" readonly><br>

<input type="submit" value="Submit">


</form>

</body>
</html>