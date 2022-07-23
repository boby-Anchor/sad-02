
package com_class;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.swing.JOptionPane;

public class path {
    public static final String REPORT_BASE_URL = "C:\\com_POS_01\\";
    private static String userLoginDate;
    private static String userLogintime;
    private static int userLoginId;
    public static String CheckPortGetPort(){
        String port = "3316";
        try {
            InputStream input = new FileInputStream(REPORT_BASE_URL+"path.txt");
            Properties prop = new Properties();
            prop.load(input);
            port = prop.getProperty("PORT");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File is missing !!! ","Error Massage",JOptionPane.ERROR_MESSAGE);
        }
        return port;
    }

    public static String getUserLoginDate() {
        return userLoginDate;
    }

    public static void setUserLoginDate(String userLoginDate) {
        path.userLoginDate = userLoginDate;
    }

    public static String getUserLogintime() {
        return userLogintime;
    }

    public static void setUserLogintime(String userLogintime) {
        path.userLogintime = userLogintime;
    }

    public static int getUserLoginId() {
        return userLoginId;
    }

    public static void setUserLoginId(int aUserLoginId) {
        userLoginId = aUserLoginId;
    }
    
}
