public class HistoricalEvent {
    protected String description;
    protected Date date;

    public HistoricalEvent() 
    {
        this.description = "None";
        this.date = new Date();
    }

    public HistoricalEvent(String description, Date date) 
    {
        this.description = description;
        this.date = date;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public Date getDate() 
    {
        return date;
    }

    public void setDate(Date date) 
    {
        this.date = date;
    }

    @Override
    public String toString() 
    {
        return this.date.toString() + " --- " + this.description;
    }

    public void teach() 
    {
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object other) 
    {
        if (this == other)
            return true;
        if (!(other instanceof HistoricalEvent))
            return false;
        HistoricalEvent that = (HistoricalEvent) other;
        return this.description.equals(that.description) && this.date.equals(that.date);
    }
    
    public int compareTo(HistoricalEvent other) 
    {
        if (this.date.precedes(other.date)) 
        {
            return -1;
        } 
        else if (this.date.equals(other.date)) 
        {
            return 0;
        } 
        else 
        {
            return 1;
        }
    }
}