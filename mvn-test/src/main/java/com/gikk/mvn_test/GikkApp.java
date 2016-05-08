package com.gikk.mvn_test;

/**
 * Hello world!
 *
 */
public class GikkApp 
{
	/**Testing JavaDoc. See {@link GikkApp#getMessage()}
	 * 
	 * @param args these args
	 */
    public static void main( String[] args )
    {
        System.out.println( "Hello World! This is a SnapShot" );
    }
    
    /**More testing of JavaDocs. See {@link GikkApp}
     * 
     * @return a message
     */
    public static String getMessage(){
    	return "Hello World 2! This is a SnapShot";
    }
}
