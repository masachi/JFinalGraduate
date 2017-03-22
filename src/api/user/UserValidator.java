package api.user;


import com.jfinal.core.Controller;
import common.model.User;

/**
 * Created by Masachi on 2017/3/22.
 */
public class UserValidator extends com.jfinal.validate.Validator{

    protected void validate(Controller controller) {
        validateRequiredString("user.name", "nameMsg", "请输入User昵称!");
        validateRequiredString("user.password", "passwordMsg", "请输入User密码!");
    }
    @Override
    protected void handleError(Controller controller) {

        String actionKey = getActionKey();
        if (actionKey.equals("/api/user/save"))
            controller.render("add.html");
        else if (actionKey.equals("/api/user/update"))
            controller.render("edit.html");
    }
}
