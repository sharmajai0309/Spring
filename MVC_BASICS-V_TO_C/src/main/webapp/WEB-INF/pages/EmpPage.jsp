<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Records</title>
</head>
<body>
    <!-- toString() gets called -->
    <h1>UserObject details :: ${obj}</h1>

    <hr>

    <!-- Getter methods will be called -->
    <p>Employee ID is      :: ${obj.empid}</p>
    <p>NAME is             :: ${obj.empName}</p>
    <p>Salary is           :: ${obj.empsal}</p>
    <p>Employee PW is      :: ${obj.empwd}</p>
    <p>Employee Dept       :: ${obj.empDept}</p>
    <p>Employee address    :: ${obj.empAddr}</p>
</body>
</html>
