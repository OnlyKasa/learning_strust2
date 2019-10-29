package actions.tutorial;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Action("tutorial")
@Results(@Result(name = "success", location="/tutorial/login/success.jsp"))
public class Login {

    public String execute() throws Exception {
        return "success";
    };
}
