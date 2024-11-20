package myPkg;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class totalCaseTagHandler extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            String SQL_Query = "SELECT SUM(total) FROM caseInfo";
            Connection con = myPkg.Utility.connectDB();
            PreparedStatement ps = con.prepareStatement(SQL_Query);
            
            ResultSet rs = ps.executeQuery();
            rs.next();
            out.println(rs.getString(1));
        } catch (Exception ex) {
            throw new JspException("Error in totalCaseTagHandler tag", ex);
        }
    }
    
}
