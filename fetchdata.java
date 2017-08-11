import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;


public class fetchdata{

public static void main(String[] args)
{
    try
    {
        File newFile=new File("/home/nishant/test.txt");
        FileOutputStream fop=new FileOutputStream(newFile);
        ArrayList htmlLine=new ArrayList();

        URL url = new URL("https://www.makemytrip.com/mmthtl/site/hotels/search?checkin=03192017&checkout=03212017&city=GOI&country=IN&area=&roomStayQualifier=2e0e&searchText=Goa,%20India&sTime=1489914631726");
        URLConnection conn = url.openConnection();
        DataInputStream in = new DataInputStream ( conn.getInputStream (  )  ) ;
        BufferedReader d = new BufferedReader(new InputStreamReader(in));
        //int i=0;
        while(d.ready())
        {
            htmlLine.add(d.readLine()+"\n");
            //i++;
        }
        Iterator itr=htmlLine.iterator();
        while(itr.hasNext())
        {
            fop.write(itr.next().toString().getBytes());
        }
        fop.flush();
        fop.close();

    }
    catch(Exception e)
    {
        System.out.println("The following error was thrown " + e);
    }
     }
}