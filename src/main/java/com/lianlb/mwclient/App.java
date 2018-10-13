package com.lianlb.mwclient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Math m = new Math() ;
//        try{
//            System.out.println("除法操作：" + m.div(10,0)) ;
//        }catch(Exception e){
//            System.out.println("异常产生：" + e) ;
//        }
        m.div(10,0);
    }
}
class Math{
    public int div(int i,int j) throws MyException {    // 定义除法操作，如果有异常，则交给被调用处处理
        System.out.println("***** 计算开始 *****") ;
        int temp = 0 ;    // 定义局部变量
        try{
            temp = i / j ;    // 计算，但是此处有可能出现异常
        }catch(Exception e){
            throw e ; //抛出异常。
        }finally{    // 不管是否有异常，都要执行统一出口
            System.out.println("***** 计算结束 *****") ;
        }
//        temp = i / j ;
//        System.out.println("***** 计算结束 *****") ;
        return temp ;
    }
}

class MyException extends RuntimeException {

    public MyException(String message) {
        super(message);
    }
}