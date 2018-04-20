// Contains code that should match for the following tests:
//
// proprietary-servlet-01000-test
// proprietary-servlet-03000-test
//
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.proprietary.servlet.annotation.ProprietaryInitParam;
import com.example.proprietary.servlet.annotation.ProprietaryServlet;

/**
 * This is an example of a servlet that uses the proprietary
 * @ProprietaryServlet and @ProprietaryInitParam annotations.
 *
 * This is not a fully functional class. Its sole purpose is
 * to demonstrate RHAMT rule testing.
 *
 * @author windup-team
 */
@ProprietaryServlet (
    name = "catalog",
    initParams = {
        @ProprietaryInitParam (name="catalog", value="migrations"),
        @ProprietaryInitParam (name="language", value="English")
     },
     mapping = {"/catalog/*"}
)
public class SampleProprietaryServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        // noop
    }

}

