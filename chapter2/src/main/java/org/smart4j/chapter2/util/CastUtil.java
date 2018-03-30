package org.smart4j.chapter2.util;


import org.apache.commons.lang3.StringUtils;

/**
 * 转换操作工具类
 */
public final class CastUtil {
  /**
   * 转为String型
   */
  public static String castString(Object obj) {
    return castString(obj, "");
  }

  /**
   * 转为String型(提供默认值)
   */
  public static String castString(Object obj, String defaultValue) {
    return obj != null ? String.valueOf(obj) : defaultValue;
  }

  /**
   * 转为double型
   */
  public static Double castDouble(Object obj) {
    return castDouble(obj, 0);
  }

  /**
   * 转为double型(提供默认值)
   */
  public static Double castDouble(Object obj, double defaultValue) {
    double doubleValue = defaultValue;
    if (obj != null) {
      String strValue = castString(obj);
      if (StringUtil.isNotEmpty(strValue)) {
        try {
          doubleValue = Double.parseDouble(strValue);
        } catch (NumberFormatException e) {
          doubleValue = defaultValue;
        }
      }
    }
    return doubleValue;
  }

  /**
   * 转为long型
   */
  public static Long castLong(Object obj) {
    return castLong(obj, 0L);
  }

  /**
   * 转为long型(提供默认值)
   */
  public static Long castLong(Object obj, Long defaultValue) {
    Long longValue = defaultValue;
    if (obj != null) {
      String strValue = castString(obj);
      if (StringUtil.isNotEmpty(strValue)) {
        try {
          longValue = Long.valueOf(strValue);
        } catch (NumberFormatException e) {
          longValue = defaultValue;
        }
      }
    }
    return longValue;
  }

  /**
   * 转为int型
   */
  public static int castInt(Object obj) {
    return castInt(obj, 0);
  }

  /**
   * 转为int型(提供默认值)
   */
  public static int castInt(Object obj, int defaultValue) {
    int intValue = defaultValue;
    if (obj != null) {
      String strValue = castString(obj);
      if (StringUtil.isNotEmpty(strValue)) {
        try {
          intValue = Integer.valueOf(strValue);
        } catch (NumberFormatException e) {
          intValue = defaultValue;
        }
      }
    }
    return intValue;
  }

  /**
   * 转为Boolean型
   */
  public static boolean castBoolean(Object obj) {
    return castBoolean(obj, false);
  }

  /**
   * 转为Boolean型(提供默认值)
   */
  public static boolean castBoolean(Object obj, boolean defaultValue) {
    Boolean boolValue = defaultValue;
    if (obj != null) {
      boolValue = Boolean.valueOf(castString(obj));
    }
    return boolValue;
  }
}
