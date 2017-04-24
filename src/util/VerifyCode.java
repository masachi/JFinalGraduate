package util;

import com.java4less.ocr.tess3.OCRFacade;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by Masachi on 2017/4/24.
 */
public class VerifyCode {

    public static String getVerifyCode(){
        ITesseract iTesseract = new Tesseract();
        iTesseract.setDatapath("libs/tessdata/");
        String text = "";
        try{
            text = iTesseract.doOCR(new File("file/temp.jpg"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return text;
    }
}
