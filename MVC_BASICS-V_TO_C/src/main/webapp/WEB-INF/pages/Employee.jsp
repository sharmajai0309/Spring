<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
</head>
<body>
<h1>Welcome to Employee History
</h1>
<form method ="post"action="/employee/save">
    <table>
        <tr>
            <th>EMPID</th>
            <td>
                <input type="text" name="empid">
            </td>
        </tr>
        <tr>
            <th>EMPNAME</th>
            <td>
                <input type="text" name="empName">
            </td>
        </tr>
        <tr>
            <th>EMPSAL</th>
            <td>
                <input type="text" name="empsal">
            </td>
        </tr>
        <tr>
            <th>EMPPWD</th>
            <td>
                <input type="text" name="empwd">
            </td>
        </tr>
        <tr>
            <th>EMPDEPT</th>
            <td>
                <input type="text" name="empDept">
            </td>
        </tr>
        <tr>
            <th>EMPADDR</th>
            <td>
                <input type="text" name="empAddr">
            </td>
        </tr>
    </table>
     <input type="submit" value ="save">
            
   
</form>

</body>
</html>