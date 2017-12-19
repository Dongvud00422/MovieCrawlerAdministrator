/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.project.view;

import com.fpt.project.entity.Account;
import java.util.HashMap;

/**
 *
 * @author Nam Nguyen
 */
public class ValidateLogin {
    public HashMap<String, String> ValidateLoginAcc(Account acc){
         HashMap<String, String> errors = new HashMap<>();
          if (acc.getAccount().isEmpty()) {
            errors.put("txtAccount", "*Vui lòng nhập tài khoản!");
        }
           if (acc.getPassword().isEmpty()) {
            errors.put("txtPassword", "*Vui lòng nhập mật khẩu!");
        }
         return errors;
     }
}
