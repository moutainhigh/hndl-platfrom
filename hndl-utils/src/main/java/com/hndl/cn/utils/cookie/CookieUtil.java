package com.hndl.cn.utils.cookie;

import com.hndl.cn.utils.string.StringUtils;

import javax.servlet.http.Cookie;

/**
 * @Classname 赵俊凯
 * @Description  操作cookis的一些方法
 * @Date 2019/3/14 13:45
 * @Created by 湖南达联
 */
public class CookieUtil {

    public static String getCookieByKey(Cookie[] cookies ,String key){
        if(cookies != null && StringUtils.isNotBlank(key)){
            for (Cookie cookie : cookies) {
                if (key.equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }

    public static void setCookieByKey(Cookie[] cookies ,String key,String value){
        if(cookies == null){
            return;
        }

            for (Cookie cookie : cookies) {
                if (key.equals(cookie.getName())) {
                     cookie.setValue(value);
                     break;
                }

        }
    }

}
