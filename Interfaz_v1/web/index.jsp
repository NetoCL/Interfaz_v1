<%-- 
    Document   : index
    Created on : 03-05-2018, 13:11:50
    Author     : Neto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>WEB TITLE</title>
    </head>
    <body>
        <h1 align="center">Fragmentación</h1>
        <p align="center">Ingrese los datos necesarios para la conexión a la base datos (MySQL temporalmente)</p>
        <form action="datosdb" method="POST">
             <table align ="center">
                <tr>
                    <th>Dirección del servidor   :</th>
                    <th><input type="text" name="server" value="localhost" readonly /></th>
                </tr>
                <tr>
                    <th>Nombre de la base de datos   :</th>
                    <th><input type="text" name="bd"/></th>
                </tr>
                <tr>
                    <th>Nombre del usuario   :</th>
                    <th><input type="text" name="user"/></th>
                </tr>
                <tr>
                    <th>Contraseña de la base de datos   :</th>
                    <th><input type="text" name="pass"/></th>
                </tr>
                <tr>
                    <th>
                        <input type="submit">
                    </th>
                </tr>
            </table>
            
        </form>
       
    </body>
</html>
