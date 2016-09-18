package com.learn.odd;

public class OddQuestion
{
    private static boolean isOdd(int i)
    {
        System.out.println(i + " % 2 == " + i % 2);
        return i % 2 == 1;
    }
    
    /** <一句话功能简述>
     * <功能详细描述>
     * @param args [参数说明]
     * 
     * @return void [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args)
    {
        System.out.println(isOdd(5));
        System.out.println(isOdd(6));
        System.out.println(isOdd(-5));
        System.out.println(isOdd(-6));
    }
}
