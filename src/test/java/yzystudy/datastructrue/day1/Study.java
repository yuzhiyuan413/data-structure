package yzystudy.datastructrue.day1;

import java.util.Arrays;

/**
 * @className: Study
 * @description:
 * @author: YuZhiYuan
 * @date: 2020-05-27 11:53
 **/
public class Study {
    public static void main(String[] args) {
        //fun1();
        fun2();
    }

    /**
     * 对于输入的数组，输出与它逆序的数组，例如输入a = [1,2,3,4,5], 输出[5,4,3,2,1]
     * 思路：1、创建数组a与原数组等长
     * 2、从左到右遍历原数组，然后已从右到左的方式数组a赋值
     * 3、输出数组a的结果
     * 时间复杂度：O(n)
     */
    public static void fun1(){
        int []a = {1,2,3,4,5};
        int []b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            b[a.length -i -1] = a[i];
        }
        System.out.println("原数组："+ Arrays.toString(a));
        System.out.println("新数组："+ Arrays.toString(b));
    }

    /**
     * 思路2：定义缓存变量tmp,通过for循环，从0遍历到数组长度一半的位置
     * 通过tmp变量进行首位互换，得到的新数组就是逆序的
     * 时间复杂度：O(n/2)
     */
    public static void fun2(){
        int []a = {1,2,3,4,5};
        System.out.println("原数组："+ Arrays.toString(a));
        int tmp = 0 ;
        for(int i = 0; i < (a.length)/2; i++) {
            tmp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = tmp;
        }
        System.out.println("新数组："+ Arrays.toString(a));
    }
}