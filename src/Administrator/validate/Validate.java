/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.project.validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nam Nguyen
 */
public class Validate {

    private static final Pattern emailRegex = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,3}$", Pattern.CASE_INSENSITIVE);
    private static final String phoneRegex = "^\\+84(1\\d{9}|9\\d{8})$";
    private static final String BIRTHDAY_REGEX = "^\\d{2}/\\d{2}/\\d{4}"; 
    public static boolean valiEmail(String emailStr) {
        Matcher matcher = emailRegex.matcher(emailStr);
        return matcher.matches();
    }

    public static boolean valiPhoneNumber(String phone) {
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
   
    public static boolean valiBirthday(String txtBrithday) {
        Pattern p = Pattern.compile(BIRTHDAY_REGEX);
        Matcher m = p.matcher(txtBrithday);
        return m.matches();
    }
}
