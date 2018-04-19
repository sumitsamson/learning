<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome</title>
    </head>
    <body>
        <table align="center">
            <tr>
                <td><a href="login">Login</a>
                </td>
                <td><a href="register">Register</a>
                </td>
            </tr>
        </table>
        <div>
        <h4>Database info</h4>
         <h5>Database server host :${db_host}</h5>
        <h5>Database name :${db_name}</h5>
        <h5>Database URL :${db_url}</h5>
        <h5>Database user :${db_user}</h5>  
        <h5>Exception :${db_exception}</h5>      
        </div>
        
        <p><a href="https://dzone.com/articles/spring-mvc-example-for-user-registration-and-login-1">Reference</a></p>
    </body>
    </html>