package actions.tutorial;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@ResultPath(value = "/")
@Result(name = "success", location = "tutorial/login/success.jsp")
public class Login extends ActionSupport {

    @Action(value = "/get/data")
    public String execute() {
        return SUCCESS;
    }

    @Action(value = "/tutorial")
    public String input() {
        return INPUT;
    }
}
