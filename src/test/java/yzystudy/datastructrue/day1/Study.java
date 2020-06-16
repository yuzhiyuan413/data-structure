package yzystudy.datastructrue.day1;

import java.util.*;

/**
 * @className: Study
 * @description:
 * @author: YuZhiYuan
 * @date: 2020-05-27 11:53
 **/
public class Study {
    public static void main(String[] args) {
        //fun1();
        //fun2();
        //fun5();
        //fun6();
        //fun7();

        treeTest();
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

    /**
     * 3元，5元，7元纸币，凑到100元的各种组合
     * 思路：3x + 5y + 7z = 100,求 x,y,z
     */
    public static void fun5() {
        for(int i=1;i < 100/7;i++) {
            for(int j=1; j < 100/5;j++) {
                int m = (100-(7*i+5*j));
                if(m >0 && m%3 ==0) {
                    System.out.println("7*"+i + "+5*"+j+"+3*" +m/3+ "=100");
                }
            }
        }
    }

    /**
     * 找到数组最大值，然后将其删除 a = [1,4,6,2,3],时间复杂度O(n)
     */
    public static void fun6(){
        int [] arr = {1,4,6,2,3};
        int max_val = -1;
        int max_index = -1;

        int min_val = -1;
        int min_index = -1;
        // 第一步找到最大值的元素和索引值
        for(int i = 0; i< arr.length;i++) {
            if(arr[i] > max_val) {
                max_val = arr[i];
                max_index = i;
            }
            if(arr[i] < max_val) {
                min_val = arr[i];
                min_index = i;
            }

        }
        int inx1 = max_index;
        int inx2 = min_index;
        if(max_index < min_index) {
            inx1 = min_index;
            inx2 = max_index;
        }
        for(int i = inx1; i < arr.length-1;i++) {

            arr[i] = arr[i+1];
        }

        for(int i = inx2; i < arr.length-1;i++) {

            arr[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 比对字符串中的括号是否对称出现，例如（{[]})是满足的
     */
    public static Boolean fun7(){
        String str = "({[]})";
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']','[');
        map.put('}','{');
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++) {
            // 左括号push
            if(map.containsValue(chars[i])) {
                stack.push(chars[i]);
            }
            // 当前字符是右括号，出栈，如果stack为空返回false，出栈的是当前右括号对应的左括号，要匹配
            if(map.containsKey(chars[i])) {
                if(stack.empty() || stack.pop() != map.get(chars[i])) {
                    System.out.println("字符串："+str + ",是否匹配：false");
                    return false;
                }
            }
        }
        System.out.println("字符串："+str + ",是否匹配："+stack.empty());
        return stack.empty();
    }

    public static void treeTest() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(30);
        binaryTree.insert(25);
        binaryTree.insert(35);
        binaryTree.insert(22);
        System.out.println(binaryTree.findMax().toString());
        System.out.println(binaryTree.findMix().toString());
        System.out.println(binaryTree.findNode(23));
    }
}