package org.smart4j.chapter2.util;


import org.apache.commons.lang3.StringUtils;

/**
 * 转换操作工具类
 */
public final class CastUtil {
    /**
     * 转为String型
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj,"");
    }

    /**
     * 转为String型(提供默认值)
     */
    public static String castString(Object obj,String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     */
    public static Double castDouble(Object obj){
        return CastUtil.castDouble(obj,0);
    }

    /**
     * 转为double型(提供默认值)
     */
    public static Double castDouble(Object obj,double defaultValue){
//        double doubleValue = defaultValue;
//        if (obj != null){
//            String strValue = castString(obj);
//            if (StringUtils.isNotEmpty(strValue)){
//                try {
//                    doubleValue = Double.parseDouble(strValue);
//                } catch (NumberFormatException e){
//                    doubleValue = defaultValue;
//                }
//            }
//        }
//        return doubleValue;
        double doubleValue = Double.valueOf(defaultValue);
        return obj != null ? doubleValue:defaultValue;
    }
}
