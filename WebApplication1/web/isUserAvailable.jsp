<%@page import="java.sql.*" %>
<% 
    String id = request.getParameter("id");
    String sql = "Select * from users where email=?";
    
    Connection con = myPkg.Utility.connectDB();
    
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setString(1,id);
    ResultSet rs = ps.executeQuery();
    
    boolean check = rs.next();
    if(check == false){
        out.println("valid");
    }else{
        out.println("already registered!");
    }
%>
