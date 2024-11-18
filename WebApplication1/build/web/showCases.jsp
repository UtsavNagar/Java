<%!
    int getPer(int deaths,int total){
        return deaths * 100 / total;
    }
%>
<%
    String sql = "SELECT * FROM caseInfo";
    java.sql.Connection con = myPkg.Utility.connectDB();
    java.sql.PreparedStatement ps = con.prepareStatement(sql);
    java.sql.ResultSet rs = ps.executeQuery();
    int srno = 1;
%>
<html>
    <body>
        <h3>Covid Data</h3>
        <hr>
        <table border="2">
            <thead>
                <tr>
                    <td>Sr.no.</td>
                    <td>State</td>
                    <td>Date</td>
                    <td>Total</td>
                    <td>Active</td>
                    <td>Deaths</td>
                    <td>Deaths %</td>
                 </tr>
            </thead>
            <tbody>
            <%
                while(rs.next()){
                    String date = rs.getString(2);
                    String state = rs.getString(3);
                    int total = rs.getInt(4);
                    String active = rs.getString(5);
                    int deaths = rs.getInt(1);
            %>
                <tr>
                    <td><%= srno %></td>
                    <td><%= state%></td>
                    <td><%= date %></td>
                    <td><%= total%></td>
                    <td><%= active%></td>
                    <td><%= deaths%></td>
                    <td><%= getPer(deaths,total) + "%" %></td>
                </tr>
            <%
                    srno++;
                }
            %>
            </tbody>
        </table>
    </body>
</html>

<%
    con.close();
%>
