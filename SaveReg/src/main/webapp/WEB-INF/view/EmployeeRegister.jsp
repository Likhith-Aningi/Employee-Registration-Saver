<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
        body {
            background-image: url('data:image/jpeg;base64,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');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 100% 100%;
        }

        legend {
            background-color: gray;
            color: rgb(84, 255, 4);
            padding: 120px, 180px;
            border-radius: 5px;
        }

        .bt {
            margin-bottom: 5px;
        }
    </style>
</head>
<body>

<form action="<%=request.getContextPath()%>/register" method='post'>
<fieldset style="border-radius: 10px;">
            <legend>Fill here to register the employee account</legend>
            <table>
            <tr>
            <td><label for="firstName">First Name</label></td>
            <td> <input class="bt" type="text" name="firstName" id="firstName" required placeholder="Enter firstName"><br></td>
            </tr>
            <tr>
            <td><label for="lastName">Last Name</label></td>
            <td> <input class="bt" type="text" name="lastName" id="lastName" required placeholder="Enter lastName"><br></td>
            </tr>
            <tr>
            <td><label for="userName">User Name</label></td>
            <td> <input class="bt" type="text" name="userName" id="userName" required placeholder="Enter UserName"><br></td>
            </tr>
            <tr>
            <td><label for="password">password</label></td>
            <td> <input class="bt" type="password" name="password" id="password" required placeholder="Enter Password"><br></td>
            </tr>
            <tr>
            <td><label for="address">Address</label></td>
            <td> <input class="bt" type="text" name="address" id="address" required placeholder="Enter Address"><br></td>
            </tr>
            <tr>
            <td><label for="contact">Contact</label></td>
            <td> <input class="bt" type="tel" name="contact" id="contact" required placeholder="contact"><br></td>
            </tr>
            <tr>
            <td><button style="color:azure;background-color:blue;border-radius:5px;cursor: pointer;">SUBMIT</button></td>
            <td><button type="reset" style="color:azure;background-color:rgb(255, 2, 234);border-radius:5px;cursor: pointer;">RESET</button>
            </td>
            </tr>
            </table>
</fieldset>

</form>
</body>
</html>