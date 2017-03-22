package api;

import bean.BaseResponse;
import bean.Code;
import com.jfinal.core.Controller;
import common.model.User;

/**
 * Created by Masachi on 2017/3/22.
 */
public class BaseAPIController extends Controller{
    protected User getUser(){
        User user = getAttr("user");
        return getAttr("user");
    }

    public void render404(){
        renderJson(new BaseResponse(Code.NOT_FOUND));
    }

    public void renderArgumentError(String message){
        renderJson(new BaseResponse(Code.ARGUMENT_ERROR, message));
    }

    public void renderSuccess(String message){
        renderJson(new BaseResponse().setMessage(message));
    }

    public void renderFailed(String message){
        renderJson(new BaseResponse(Code.FAIL, message));
    }
}
