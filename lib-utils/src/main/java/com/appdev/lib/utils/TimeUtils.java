package com.appdev.lib.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeUtils {

    /**
     * 将毫秒时间格式化
     * @param pattern
     * @param millis
     * @return
     */
    public static String formatMillisToTimeString(String pattern,long millis){
        DateFormat format = new SimpleDateFormat(pattern, Locale.CHINA);
        return format.format(new Date(millis));
    }


}
