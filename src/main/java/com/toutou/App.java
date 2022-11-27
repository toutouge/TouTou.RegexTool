package com.toutou;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        boolean domain = TouTouRegex.CheckDomain2("https://tieba.baidu.com/f?kw=", "baidu.com");
        System.out.println(domain);
        System.out.println( "Hello World!" );
    }
}
