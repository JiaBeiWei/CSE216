import java.util.*;

/** <p>Title: P2P Project</p>
 *
 * <p>Description: This class gets a test message.       
 * </p>
 *
 * <p>Copyright: none</p>
 *
 * <p>Company: Lehigh University</p>
 *
 * @author Bill Phillips 
 *
 */

public class CSE216ClientCommandLineInterface {
   
   private final RunTimeVars rtv =  RunTimeVars.Instance();
   private final ConfigFile cf   =  ConfigFile.Instance(); 
   private final String hostname =  cf.getMyHostName();
   private final int portnumber  =  rtv.getServerPort();
   

   private final String prompt;
   private final Scanner    sc;
   private int             sel;
   
   public CSE216ClientCommandLineInterface (final String hname, final String m) 
   {

      prompt = "Enter a string: ";
      sc     =  new Scanner(System.in);
      
   }
   
   //
   // This function prompts
   // the user to enter a string
   // to be encrypted and sent to
   // the server.  If "quit" is
   // entered System.exit(0) is
   // called to terminate the
   // program.
   //
   public CState getUserSelection() 
   {
      
      CState cs =  new CState();
      cs.mid    = MessageID.MSG;
      String enteredString = "abcdefg";
      
      System.out.print (prompt);

      // Get the string from the user //
      enteredString = sc.nextLine();
 
      // If the string is "quit"
      if ("quit".equals(enteredString))
         System.exit(0);

      cs.setMessage(enteredString);
      return cs;
      
   }
   
}
