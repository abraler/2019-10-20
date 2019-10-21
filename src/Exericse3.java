//这种拷贝的能力太过低，一般不建议这种拷贝
// 举一个例子
/*
寄快递，你要向一个地方寄一万件快递，你不能一件一件寄过去把，显然，这种效率太低了，
我们肯定装在车上， 一批一批的寄过去，这里车就相当于缓冲区
就这个复制图片而言，我们就可以先建一个数组，相当于车，作为缓冲区
我就在Exercise4中写了
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exericse3 {
    public static void main(String[] args)throws Exception {
        //创建输入的文件

        FileInputStream in=new FileInputStream("zrn.jpg");
        //创建需要复制的地方
        FileOutputStream out=new FileOutputStream("src.jpg");
        int i=0;
        //开始时间
        long begin=System.currentTimeMillis();
        while((i=in.read())!=-1){
            out.write(i);
        }
        //结束时间
        long end=System.currentTimeMillis();
        System.out.println("复制所花的时间"+(end-begin)+"毫秒");
        in.close();
        out.close();
    }
}
