package util;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import net.sourceforge.htmlunit.cyberneko.HTMLElements;

/**
 * Created by Masachi on 2017/4/4.
 */
public class AutoLogin {
    private WebClient webClient = new WebClient();
    private String URL = "http://202.118.201.228/homepage/index.do";
    private HtmlPage page;
    //http://202.118.201.228/academic/getCaptcha.do

    public void loginToRemoteServer(String username,String password, String capture){
        try {
            getPage();
            HtmlElement usernameElement = page.getElementByName("j_username");
            HtmlElement passwordElement = page.getElementByName("j_password");
            HtmlElement captureElement = page.getElementByName("j_captcha");
            HtmlElement loginButton = page.getElementByName("login");
            HtmlImage captureImg = (HtmlImage) page.getElementByName("jcaptcha");
            // TODO: 2017/4/4 htmlimage下载成图片然后OCR
            usernameElement.focus();
            usernameElement.type(username);
            passwordElement.focus();
            passwordElement.type(password);
            captureElement.focus();
            captureElement.type(capture);
            loginButton.click();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private void getPage(){
        try{
            page = webClient.getPage(URL);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
