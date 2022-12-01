package com.yyyu.db.std.portal.app.utils;

import android.content.Context;
import android.support.annotation.StringRes;
import android.text.TextUtils;

import com.yyyu.baselibrary.utils.ResourceUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能：字符串操作工具类
 *
 * @author yu
 * @version 1.0
 * @date 2021/05/31
 */
public class StringUtils {

	/**
	 * 判断字符串是否有值，如果为null或者是空字符串或者只有空格或者为"null"字符串，则返回true，否则则返回false
	 */
	public static boolean isEmpty(CharSequence str) {
		if (str == null) {
			return true;
		}
		if (str.length() == 0) {
			return true;
		}
		if (str.toString().toUpperCase(Locale.getDefault()).equals("NULL")) {
			return true;
		}
		return false;
	}

	public static boolean isNotEmpty(CharSequence str) {
		return !isEmpty(str);
	}

	/**
	 * 判断字符串中是否是Double
	 *
	 * @param str
	 * @return
	 */
	public static boolean isDouble(String str) {
		if (!TextUtils.isEmpty(str)) {
			return str.toString().matches("^\\d+(\\.[\\d]+)?$");
		}
		return false;
	}

	/**
	 * 判断字符串是否是邮箱
	 *
	 * @param email email
	 * @return 字符串是否是邮箱
	 */
	public static boolean isEmail(String email) {
		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(" +
				"([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);
		return m.matches();
	}

	/**
	 * 判断手机号字符串是否合法
	 *
	 * @param phoneNumber 手机号字符串
	 * @return 手机号字符串是否合法
	 */
	public static boolean isPhoneNumberValid(String phoneNumber) {
		boolean isValid = false;
		String expression = "^1[1|2|3|4|5|6|7|8|9]\\d{9}$";
		CharSequence inputStr = phoneNumber;
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		}
		return isValid;
	}

	/**
	 * 判断手机号字符串是否合法
	 *
	 * @param areaCode    区号
	 * @param phoneNumber 手机号字符串
	 * @return 手机号字符串是否合法
	 */
	public static boolean isPhoneNumberValid(String areaCode, String phoneNumber) {
		if (TextUtils.isEmpty(phoneNumber)) {
			return false;
		}

		if (phoneNumber.length() < 5) {
			return false;
		}

		if (TextUtils.equals(areaCode, "+86") || TextUtils.equals(areaCode, "86")) {
			return isPhoneNumberValid(phoneNumber);
		}

		boolean isValid = false;
		String expression = "^[0-9]*$";
		CharSequence inputStr = phoneNumber;
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		}
		return isValid;
	}

	/**
	 * 判断字符串是否是手机号格式
	 *
	 * @param areaCode    区号
	 * @param phoneNumber 手机号字符串
	 * @return 字符串是否是手机号格式
	 */
	public static boolean isPhoneFormat(String areaCode, String phoneNumber) {
		if (TextUtils.isEmpty(phoneNumber)) {
			return false;
		}

		if (phoneNumber.length() < 7) {
			return false;
		}

		boolean isValid = false;
		String expression = "^[0-9]*$";
		CharSequence inputStr = phoneNumber;
		Pattern pattern = Pattern.compile(expression);
		Matcher matcher = pattern.matcher(inputStr);
		if (matcher.matches()) {
			isValid = true;
		}
		return isValid;
	}

	/**
	 * 判断字符串是否为纯数字
	 *
	 * @param str 字符串
	 * @return 是否纯数字
	 */
	public static boolean isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}


	/**
	 * 去除第一个字符
	 */
	public static String delFirstWord(String str) {
		String result = "";
		if (isNotEmpty(str)&& str.length()>1){
			StringBuffer buffer = new StringBuffer(str);
			StringBuffer replace = buffer.replace(0, 1, "");
			result = replace.toString();
		}
		return result;
	}

	/**
	 * 修改编码格式
	 */
	public static String toUtf8(String str) {
	    String result = "";
	    try {
	            result = new String(str.getBytes("UTF-8"), "UTF-8");
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	    return result;
	 }

	/**
	 * 转义html格式
	 */
	public static String translationHtml(String content) {
		String replace = content.replace("&lt;", "<");
		String replace1 = replace.replace("&gt;", ">");
		String replace2 = replace1.replace("&amp;", "&");
		String replace3 = replace2.replace("&quot;", "\"");
		return replace3.replace("&copy;", "©");
	}


	/**
	 * 网页GET请求时数据编码为UTF-8
	 *
	 */
	public static String getDecoderUTF8(String str) {
		if (null == str)
			return "";
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}

	/**
	 * 将元数据前补零，补后的总长度为指定的长度，以字符串的形式返回
	 * @param sourceDate
	 * @param formatLength
	 * @return 重组后的数据
	 */
	public static String frontCompWithZore(int sourceDate,int formatLength) {
		/**
		 　　* 0 指前面补充零
		 　　* formatLength 字符总长度为 formatLength
		 　　* d 代表为正数。
		 　　*/
		String newString = String.format("%0"+formatLength+"d", sourceDate);
		return newString;
	}


	/**
	 * 根据资源id格式化字符串
	 * @param resId
	 * @param args
	 * @return
	 */
	public static String format(Context context,@StringRes final int resId, Object ... args){
		return String.format(ResourceUtils.getInstance(context).getStr(resId),args);
	}

	public static String format(String formatStr,Object ... args){
		return String.format(formatStr,args);
	}

	/**
	 * 用户身份证号码的打码隐藏加星号加*
	 * <p>18位和非18位身份证处理均可成功处理</p>
	 * <p>参数异常直接返回null</p>
	 *
	 * @param idCardNum 身份证号码
	 * @param front     需要显示前几位
	 * @param end       需要显示末几位
	 * @return 处理完成的身份证
	 */
	public static String maskStr(String idCardNum, int front, int end) {
		//身份证不能为空
		if (TextUtils.isEmpty(idCardNum)) {
			return null;
		}
		//需要截取的长度不能大于身份证号长度
		if ((front + end) > idCardNum.length()) {
			return null;
		}
		//需要截取的不能小于0
		if (front < 0 || end < 0) {
			return null;
		}
		//计算*的数量
		int asteriskCount = idCardNum.length() - (front + end);
		StringBuffer asteriskStr = new StringBuffer();
		for (int i = 0; i < asteriskCount; i++) {
			asteriskStr.append("*");
		}
		String regex = "(\\w{" + String.valueOf(front) + "})(\\w+)(\\w{" + String.valueOf(end) + "})";
		return idCardNum.replaceAll(regex, "$1" + asteriskStr + "$3");
	}

}
