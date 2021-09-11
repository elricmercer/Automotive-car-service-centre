package apucsc_1.pkg2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class APUCSC_12
{
    public static ArrayList<Customer> allCustomer;
    public static ArrayList<Ticket> allTicket;
    public static ArrayList<Manager> allManager;
    public static ArrayList<Techs> allTechs;
    public static ArrayList<LightDuty>allLightDuty;
    public static ArrayList<HeavyDuty>allHeavyDuty;
    public static Manager loginM;
    public static Techs loginT;
    public static Customer customerName;
    public static Customer customerID;
    public static Ticket ticket;
    public static LightDuty lightDuty;
    public static HeavyDuty heavyDuty;
    public static Techs techs;
    
    //GUI 1 welcome 
    //GUI 2 manager UI 
    //GUI 3 tech UI
    //GUI 4 admin UI 
    //GUI 5 register manager (man)
    //GUI 6 register manager 2(admin)
    //GUI 7 login
    //GUI 8 register techs (man)
    //GUI 9 register techs 2(admin)
    //GUI 10 edit tech details (man)
    //GUI 11 edit tech details (admin)
    //GUI 12 edit manager details (man)
    //GUI 13 edit manager details (admin)
    //GUI 14 delete techs details (man)
    //GUI 15 delete techs details (admin)
    //GUI 16 delete manager details (man)
    //GUI 17 delete manager details (admin)
    //GUI 18 view techs details (man)
    //GUI 19 view techs details (admin)
    //GUI 20 view manager details (man)
    //GUI 21 view manager details (admin)
    //GUI 22 job options (man)
    //GUI 23 cus info for light (admin)*xxxxxxxx
    //GUI 45 cus info for light (man)*xxxxxxx
    //GUI 47 cus inf0 for heavy (man)*xxxxxxxx
    //GUI 46 cus info for heavy (admin)*xxxxxxx
    //GUI 24 job options (admin)
    //GUI 25 customer details (man)
    //GUI 26 customer details (admin)
    //GUI 27 delete customer (man)
    //GUI 28 delete customer (admin)
    //GUI 29 view cus details (man)
    //GUI 30 view cus details (admin)
    //GUI 31 jobs (man)
    //GUI 32 jobs (admin)
    //GUI 33 light duty view (man)
    //GUI 34 light duty view (admin)
    //GUI 35 heavy duty view (man)
    //GUI 36 heavy duty view (admin)
    //GUI 37 job options for remove (man)
    //GUI 38 job options for remove (admin)
    //GUI 39 remove light (man)
    //GUI 40 remove light (admin)
    //GUI 41 remove heavy (man)
    //GUI 42 remove heavy (admin)
    //GUI 43 light job (techs)
    //GUI 44 heavy job (techs)
    //GUI 48 workers avail light (admin)
    //GUI 49 workers avail light (man)
    //GUI 50 workers avail heavy (admin)
    //GUI 51 workers avail heavy (man)
    public static void main(String[] args)
    {
        allCustomer = new ArrayList<Customer>();
        allTicket = new ArrayList<Ticket>();
        allManager = new ArrayList<Manager>();
        allTechs = new ArrayList<Techs>();
        allLightDuty = new ArrayList<LightDuty>();
        allHeavyDuty = new ArrayList<HeavyDuty>();
        try
        {
            Scanner s = new Scanner(new File("manager.txt"));
            while(s.hasNext())
            {
                String a = s.nextLine();//user id
                String b = s.nextLine();//password
                String c = s.nextLine();//name
                String d = s.nextLine();//email
                s.nextLine(); 
                Manager m = new Manager(a,b,c,d);
                allManager.add(m);
            }
            s.close();
        }
        catch(Exception e)
        {
            
        }
        try
        {
            Scanner s = new Scanner(new File("techs.txt"));
            while(s.hasNext())
            {
                String a = s.nextLine();//user id
                String b = s.nextLine();//password
                String c = s.nextLine();//name
                String d = s.nextLine();//email
                s.nextLine();
                Techs t = new Techs(a,b,c,d);
                allTechs.add(t);
            }
            s.close();
        }
        catch(Exception e)
        {
            
        }
        try
        {
            Scanner s = new Scanner(new File("ticket.txt"));
            while(s.hasNext())
            {
                String a = s.nextLine();
                String b = s.nextLine();
                String c = s.nextLine();
                String d = s.nextLine();
                String e = s.nextLine();
                s.nextLine();
                Customer customer = null;
                for(int i=0;i<allCustomer.size();i++)
                {
                    Customer x = allCustomer.get(i);
                    if(c.equals(x.getName()))
                    {
                        customer = x;
                        break;
                    }
                }
                Customer id = null;
                for(int i=0;i<allCustomer.size();i++)
                {
                    Customer x = allCustomer.get(i);
                    if(d.equals(x.getId()))
                    {
                        id = x;
                        break;
                    }
                }
                Techs worker = null;
                for(int i=0;i<allTechs.size();i++)
                {
                    Techs x = allTechs.get(i);
                    if(e.equals(x.getUserId()));
                    {
                        worker = x;
                        break;
                    }
                }
                Ticket t = new Ticket(a,b,customer,id,worker);
                allTicket.add(t);
            }
            s.close();
        }
        catch(Exception e)
        {
            
        }
        try
        {
            Scanner s = new Scanner(new File("customer.txt"));
            while(s.hasNext())
            {
                String a = s.nextLine();
                String b = s.nextLine();
                String c = s.nextLine();
                String d = s.nextLine();
                s.nextLine();
                Customer cus = new Customer(a,b,c,d);
                allCustomer.add(cus);
            }
            s.close();
        }
        catch(Exception e)
        {
            
        }
        try
        {
            Scanner s = new Scanner(new File("light_duty.txt"));
            while(s.hasNext())
            {
                String a = s.nextLine();
                String b = s.nextLine();
                int c = Integer.parseInt(s.nextLine());
                int d = Integer.parseInt(s.nextLine());
                String e = s.nextLine();
                String f = s.nextLine();
                String g = s.nextLine();
                s.nextLine();
                Techs worker = null;
                for(int i=0;i<allTechs.size();i++)
                {
                    Techs x = allTechs.get(i);
                    if(a.equals(x.getUserId()))
                    {
                        worker = x;
                        break;
                    }
                }
                Customer cus = null;
                for(int i=0;i<allCustomer.size();i++)
                {
                    Customer x = allCustomer.get(i);
                    if(f.equals(x.getName()))
                    {
                        cus = x;
                        break;
                    }
                }
                Customer id = null;
                for(int i=0;i<allCustomer.size();i++)
                {
                    Customer x = allCustomer.get(i);
                    if(g.equals(x.getId()))
                    {
                        id = x;
                        break;
                    }
                }
                Ticket t = null;
                for(int i=0;i<allTicket.size();i++)
                {
                    Ticket x = allTicket.get(i);
                    if(e.equals(x.getTicketNumber()))
                    {
                        t = x;
                        break;
                    }
                }
                LightDuty ld = new LightDuty(worker,b,c,d,t,cus,id);
                allLightDuty.add(ld);
            }
            s.close();
        }
        catch(Exception e)
        {
            
        }
        try
        {
            Scanner s = new Scanner(new File("heavy_duty.txt"));
            while(s.hasNext())
            {
                String a = s.nextLine();
                String b = s.nextLine();
                int c = Integer.parseInt(s.nextLine());
                int d = Integer.parseInt(s.nextLine());
                String e = s.nextLine();
                String f = s.nextLine();
                String g = s.nextLine();
                s.nextLine();
                Techs worker = null;
                for(int i=0;i<allTechs.size();i++)
                {
                    Techs x = allTechs.get(i);
                    if(a.equals(x.getUserId()))
                    {
                        worker = x;
                        break;
                    }
                }
                Customer cus = null;
                for(int i=0;i<allCustomer.size();i++)
                {
                    Customer x = allCustomer.get(i);
                    if(f.equals(x.getName()))
                    {
                        cus = x;
                        break;
                    }
                }
                Customer id = null;
                for(int i=0;i<allCustomer.size();i++)
                {
                    Customer x = allCustomer.get(i);
                    if(g.equals(x.getId()))
                    {
                        id = x;
                        break;
                    }
                }
                Ticket t = null;
                for(int i=0;i<allTicket.size();i++)
                {
                    Ticket x = allTicket.get(i);
                    if(e.equals(x.getTicketNumber()))
                    {
                        t = x;
                        break;
                    }
                }
                HeavyDuty ld = new HeavyDuty(worker,b,c,d,t,cus,id);
                allHeavyDuty.add(ld);
            }
            s.close();
        }
        catch(Exception e)
        {
            
        }
        new GUI_1().setVisible(true);
    }
    
    
}
