
package Tuan1_Network;
import java.net.InetAddress;
/**
 *
 * @author ngocanh
 */
public class ex1_Start {

    public static void main(String[] args) {
        try{
            InetAddress inet = InetAddress.getByName("google.com");
            boolean isKn = inet.isReachable(5000);
            if(isKn){
                System.out.println("Co internet: " );
            }else{
                System.out.println("Khong ket noi");
            }
        }catch(Exception e){
            
        }
    }
}
