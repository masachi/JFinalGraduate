package api.user;

import api.BaseAPIController;

/**
 * Created by Masachi on 2017/3/22.
 */
public class UserController extends BaseAPIController{
    public void submit(){
        String name = getPara("username");
        String password = getPara("password");
        String capture = getPara("capture");

    }
}
