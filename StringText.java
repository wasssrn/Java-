package ZIXUE;
/*
String类型变量的使用
1.String属于引用数据类型,翻译为：字符串
2.声明String类型变量时，要使用一对""
3.String可以和8种基本数据变量做运算，且运算只能是链接运算：+
4.运算的结果仍为String类型


 */
public class StringText {
    public static void main(String[] args) {
        String s1 = "Hello world";
        System.out.println(s1);

        String s2 = "a";
        String s3 = " ";
        System.out.println(s2);
        System.out.println(s3);
        int number = 1001;
        String numberStr = "学号";
        String info = numberStr + number;
        boolean b1 = true;
        String info1 = info+b1;//+:链接运算
        System.out.println(info);
        System.out.println(info1);
        //练习1
        char c ='a';//97  'A':65
        int num = 10;
        String str = "hello";
        System.out.println(c+str+num);//ahello10
        System.out.println(c+num+str);//a10hello
        System.out.println(c+(num+str));//a10hello
        System.out.println((c+num)+str);//a10hello
        System.out.println(str+num+c);//hello10a
        //只要出现一个String类型，就都是String类型
        //练习2
        System.out.println("*  *");//可以
        System.out.println('*'+'\t'+'*');//不可以
        System.out.println('*'+"\t"+'*');//可以
        System.out.println('*'+'\t'+"*");//不可以
        System.out.println('*'+('\t'+"*"));//可以
        //String出现之前都是计算，String出现时变成链接符

    }
}
