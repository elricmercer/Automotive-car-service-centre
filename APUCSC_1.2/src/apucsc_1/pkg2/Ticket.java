package apucsc_1.pkg2;
public class Ticket
{
    private String ticketNumber;
    private String charge;
    private Customer customer;
    private Customer id;
    private Techs worker; 
    public Ticket(String ticketNumber, String charge, Customer customer, Customer id, Techs worker)
    {
        this.ticketNumber = ticketNumber;
        this.charge = charge;
        this.customer = customer;
        this.id = id;
        this.worker = worker;
    }
    public String getTicketNumber() 
    {
        return ticketNumber;
    }

    public String getCharge() 
    {
        return charge;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public Customer getId() 
    {
        return id;
    }

    public Techs getWorker() 
    {
        return worker;
    }
    
}
