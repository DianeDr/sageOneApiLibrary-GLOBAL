/** "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements; and to You under the Apache License, Version 2.0. "*/
package SageOneIntegration;

public final class SageOneConstants {

	public final static int MAX_STRING_LENGTH = 255; // For mysql, for VARCHAR() and not LONGTEXT/LONGBLOB/BLOBTEXT
	public final static int MAX_DIGIT_LENGTH = 18; // 18/19 for longs
	public final static String GENERAL_DIGIT_REGEX = "[.0-9.]{1," + MAX_DIGIT_LENGTH + "}";
	public final static String GENERAL_PRICE_REGEX = "[.0-9.]+[.]+[.0-9.]{1," + MAX_DIGIT_LENGTH + "}";
	public final static String GENERAL_STRING_REGEX = "[.*\\S .]{1," + MAX_STRING_LENGTH + "}";
	public final static String REPLACEMENT_STRING = "####";
	public final static String SKIP_QUERY_PARAM = "&$skip=";

	@Override
	public final Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}


	//String Construction Code
	public static final String CUSTOMER_STRING = "Customer";//0
	public static final String RETURN_STRING = "Return";//1
	public static final String FORWARD_SLASH_STRING = "/";//2
	public static final String RECEIPT_STRING = "Receipt";//3
	public static final String SUPPLIER_STRING = "Supplier";

}
