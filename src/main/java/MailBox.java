import com.sun.org.apache.xpath.internal.operations.Bool;

public class MailBox {
    private MailBox(){}
    public static volatile Integer readerNumber = 0;//及时通知到线程内的变量上
    public static Boolean hasWriter = false;
    public static boolean hasReader(){
        if(readerNumber > 0){
            return true;
        } else {
            return false;
        }
    }
}
