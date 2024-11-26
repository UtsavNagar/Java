package myPkg;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class dateTagHandler extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();

        try {
            java.util.Date dt = new java.util.Date();
            String dateStr = dt.toString();
            out.println("<h4>" + dateStr + "</h4>");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
