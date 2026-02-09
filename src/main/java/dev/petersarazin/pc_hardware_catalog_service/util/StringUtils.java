package dev.petersarazin.pc_hardware_catalog_service.util;

public class StringUtils {

    public static boolean isNullOrEmpty( String str ) { return str == null || str.trim().isEmpty(); }
    public static boolean isPresent( String str ) { return !isNullOrEmpty( str ); }
}
