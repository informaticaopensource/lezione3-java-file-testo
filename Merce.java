import java.util.*;
import java.lang.*;
import java.io.*;
// Questa verione utilizza i file di testo e 
// i token per leggere i valori dell'oggetto
public class Merce 
{
    public Merce()
    {
    }
    public void scrivi()
    {
        InputStreamReader S_input =new InputStreamReader(System.in);
        BufferedReader linea = new BufferedReader(S_input);
        String tmp="",tmp1="";
        float pr=0;
        int q=0;
        boolean ok=false;
        try {FileWriter f = new FileWriter("elenco.txt",true);
            PrintWriter fout= new PrintWriter(f);
            do {
        try 
        {   
            System.out.println("Inserimento Prodotto:");
            System.out.println("\nCodice Prodotto max 6 caratteri");
            tmp=linea.readLine();
            System.out.println("\nInserisci Desscrizione:");
            tmp1=linea.readLine();
            System.out.println("\nInserisci il prezzo");
            pr=Float.parseFloat(linea.readLine());
            System.out.println("\nInserisci la quantità:");
            q=Integer.parseInt(linea.readLine());
             Prodotto p =new Prodotto(tmp, tmp1, pr, q);
             fout.println(p.out());
             fout.flush();
            ok=true;
            fout.close();

        }
        catch (Exception e)
        {
            System.out.println("\nErrore nell'input !");
            ok=false;
        }
        if (!ok  )
            System.out.println("\nErrore nell'inserimento dati ! riprova");
        } while (!ok);
        System.out.println("\n Prodotti inserito all'archivio ");
        }
        catch (IOException e)
        {
            System.out.println("Errore nell'apertura del file !");
        }
        
    }
    public void leggi()
    {     Prodotto p; 
            String s;
                StringTokenizer st; 
                String c,d;
                    float pr;
                        int q;
                
    try {
       FileReader f = new FileReader("elenco.txt");
       BufferedReader fin = new BufferedReader(f);
        s=fin.readLine();
        d="";
        c="";
        pr=0;
        q=0;
            /* st=new StringTokenizer(s,",");
            c=st.nextToken();
            d =st.nextToken();
            pr=Float.parseFloat(st.nextToken());
            q=Integer.parseInt(st.nextToken());
            p=new Prodotto(c,d,pr,q);
            p.toString();*/
            fin.readLine();
      while (s!=null)
       {   
         
          st=new StringTokenizer(s,",");
            //System.out.println(st);
            c=st.nextToken();
            d =st.nextToken();
            System.out.println(d+"\n");
           pr=Float.parseFloat(st.nextToken());
            q=Integer.parseInt(st.nextToken());
            p=new Prodotto(c,d,pr,q);
            System.out.println(p.toString());
            p.toString();
            s = fin.readLine();
        }
               fin.close();
            }
               catch (IOException e) 
            {   e.printStackTrace();
                System.out.println("Errore nell'apertura del file !");}
        
           }
        }
         
    
