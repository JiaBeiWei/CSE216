/**
 * <p>
 * Title: CSE216Crypto</p>
 *
 * <p>
 * Description: This class handles
 * the crypto operations for the
 * CSE216 Subsystem.
 * </p>
 *
 * <p>
 * Copyright: none</p>
 *
 * <p>
 * Company: Lehigh University</p>
 *
 * @author Bill Phillips
 *
 */
public class CSE216Crypto
{
   private String tStr = " ";
   
   public void encrypt(String s){ tStr = s; } 
   public void decrypt(String s){ tStr = s; }
   public String getMsg()    { return tStr; }
   
}
