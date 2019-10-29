package actions.tutorial;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Action(value = "tutorial",
        results = {
        @Result(name = "success", location = "/tutorial/login/success.jsp"),
        @Result(name = "error", location = "/tutorial/login/error.jsp")
})
public class Login {

    public String execute() {
        return "error";
    }
}
