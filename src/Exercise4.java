//byte[]数组的大小会决定传输的快慢,但是不是越大越好
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exercise4 {
    public static void main(String[] args)throws Exception {
        FileInputStream in=new FileInputStream("zrn.jpg");
        FileOutputStream out=new FileOutputStream("copyzrn.jpg");
        int i=0;
        byte[]b=new byte[1024];
        long begin=System.currentTimeMillis();
        while((i=in.read(b))!=-1){
            out.write(b,0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println("复制所花的时间"+(end-begin)+"毫秒");
        in.close();
        out.close();
    }
}
