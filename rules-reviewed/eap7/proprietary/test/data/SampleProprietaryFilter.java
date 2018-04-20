// Contains code that should match for the following tests:
//
// proprietary-servlet-02000-test
// proprietary-servlet-03000-test
//

import javax.servlet.Filter;

import com.example.proprietary.servlet.annotation.ProprietaryInitParam;
import com.example.proprietary.servlet.annotation.ProprietaryFilter;

/**
 * This is an example of a servlet that uses the proprietary
 * @ProprietaryFilter and @ProprietaryInitParam annotations.
 *
 * This is not a fully functional class. Its sole purpose is
 * to demonstrate Windup rule addon processing.
 *
 * @author Windup-Team
 */
@ProprietaryFilter (
    name = "MyHintsRuleFilter",
    initParams = {
        @ProprietaryInitParam (name="catalog", value="migrations"),
        @ProprietaryInitParam (name="language", value="English")
     },
     mapping = {"/catalog/*"}
)
public class SampleProprietaryFilter implements Filter {
    // noop
}

