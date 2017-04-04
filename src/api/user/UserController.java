package api.user;

import api.BaseAPIController;
import common.model.User;

/**
 * Created by Masachi on 2017/3/22.
 */
public class UserController extends BaseAPIController{
    public void login(){
        String username = getPara("username");
        String password = getPara("password");
        String capture = getPara("capture");

        User user = new User(username,password,capture);

        // TODO: 2017/4/4 自动登录逻辑
    }
}
