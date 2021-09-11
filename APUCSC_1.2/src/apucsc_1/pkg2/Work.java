package apucsc_1.pkg2;
public class Work 
{
    private Techs worker;
    private String day;
    private int beginTime;
    private int endTime;
    private Ticket ticketNumber;
    private Customer cusName;
    private Customer cusID;

    public Work(Techs worker, String day, int beginTime, int endTime, Ticket ticketNumber, Customer cusName, Customer cusID) {
        this.worker = worker;
        this.day = day;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.ticketNumber = ticketNumber;
        this.cusName = cusName;
        this.cusID = cusID;
    }

    public Techs getWorker() {
        return worker;
    }

    public String getDay() {
        return day;
    }

    public int getBeginTime() {
        return beginTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public Ticket getTicketNumber() {
        return ticketNumber;
    }

    public Customer getCusName() {
        return cusName;
    }

    public Customer getCusID() {
        return cusID;
    }
    
}
