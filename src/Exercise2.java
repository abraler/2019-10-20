/*
在这需要注意一下，如果你在原有的文件上直接写入你要写的数据，你原有的文件首先会被清空，所以如果
要在后面加入你要输入的文件，要用FileOutputStream的构造函数 FileOutputStream（String str，boolean append ）

 */


import java.io.FileOutputStream;

public class Exercise2 {
//    public static void main(String[] args) throws Exception{
//        FileOutputStream out =new FileOutputStream("out.txt");
//        String str="hello world";
//        out.write(str.getBytes());
//        out.close();
//    }
public static void main(String[] args) throws Exception{
    FileOutputStream out =new FileOutputStream("out.txt",true);
    String str="hello China";
    out.write(str.getBytes());
    out.close();
}
}
