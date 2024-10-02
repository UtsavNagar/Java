import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DataProvider extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String cntry = req.getParameter("t1");
        
        int ttl = 0,
            active=0,
            death=0,
            recover=0;
        
        switch(cntry){
            case "india":
                        ttl = 100;
                        active=200;
                        death=300;
                        recover=400;
                break;
            case "pakistan":
                        ttl = 20;
                        active=400;
                        death=1000;
                        recover=10;
                break;
            case "uk":
                        ttl = 400;
                        active=10;
                        death=30000;
                        recover=0;
                break;
        }
        
         PrintWriter out = res.getWriter();
//         out.println("Total :"+ttl);
//         out.println("active :"+active);
//         out.println("death :"+death);
//         out.println("recover :"+recover);

        out.println(" <html> <body> <h1> Covid - 19 Information </h1> <hr>"
                + "<h2> Total :"+ttl+"</h2> <br>"
                + "<h2> active :"+active+"</h2> <br>"
                + "<h2> death :"+death+"</h2> <br>"
                + "<h2> recover :"+recover+"</h2> <br>"
                + "<marquee> Stay home, Be safe   </marquee>"
                + "</body> </html> ");
         
         out.close();
    }
    
}
