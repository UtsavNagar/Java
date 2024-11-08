<%
    String state = request.getParameter("state");
    String contact = state + " Ka number" ;
%>
<html>
    <body>
        <h3>Helpline number for <%= state %> </h3>
        Number <i><%= contact %></i>
    </body>
</html>
