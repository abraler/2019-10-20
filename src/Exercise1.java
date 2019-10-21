//字节流读入文件
/*
int read()       从输入流读入一个8位的字节，把它转为0~255的整数，并且返回
void close()    关闭此输入流并释放与改输入流有关的所有系统资源
 */
import java.io.*;
import javax.imageio.stream.FileImageInputStream;
public class Exercise1 {
    public static void main(String[] args)throws Exception {
       FileInputStream in=new FileInputStream("ppp.txt");
        int b=0;
        while((b=in.read())!=-1){
            System.out.println(b);
        }
        in.close();
    }

}
