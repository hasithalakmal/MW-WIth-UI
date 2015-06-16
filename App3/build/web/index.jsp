<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>MW Assignment</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style  type="text/css">
            *{
                /*margin:0;
                border:0;
                padding:0;*/
                margin:10;
                font-weight:bold;

            }
            body{

                background:#f0f0f0;
                font:14px/20px Arial , San-Serif;
                color: #0000FF;
                margin-left:100px;


            }
            h2{
                text-align:left;
                font-size:180%;
                line-height:120%;
                padding: 5% 0;
            }


            .a{
                color:#FFFFFF;
                text-decoration:none;
                font-weight:bold;
                background-color: #000000;
            }
            #operation{
                color:990000;
                font-weight:bold;
            }

        </style>
    </head>

    <body>
        <%
            String res = (String) request.getAttribute("res");
        %>
        <h2 style="color: maroon"> Calculate Numbers</h2>
        <form action="getResult" method="post">
            <table style="background-color: yellow;">
                <tr>
                    <td>First Number </td>
                    <td><input type="number" name="fn" placeholder="Enetr number"/></td>
                </tr>
                <tr>
                    <td>Second Number</td>
                    <td><input type="number" name="ln" placeholder="Enetr number"/></td>
                </tr>
                <tr>
                    <td>Operator</td>
                    <td><select id = "operation" name="op">
                <option value="+"> Addition </option>
                <option value="-"> Substract</option>
                <option value="*"> Multiplication </option>
                <option value="/"> Division</option>
            </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input class = "a" type="submit" value="Submit"/></td>
                </tr>
            </table>
            
        </form>
        <h1>Your Answer is = <%=res%></h1>
    </body>
</html>
