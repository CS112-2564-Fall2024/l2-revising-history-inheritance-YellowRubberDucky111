public class RevisedHistoricalEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedHistoricalEvent(String description, Date date, String revisedDescription, String citation) 
    {
        super(description, date);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    public String getRevisedDescription() 
    {
        return revisedDescription;
    }

    public void setRevisedDescription(String revisedDescription) 
    {
        this.revisedDescription = revisedDescription;
    }

    public String getCitation() 
    {
        return citation;
    }

    public void setCitation(String citation) 
    {
        this.citation = citation;
    }

    @Override
    public void teach() 
    {
        super.teach();
        System.out.println("Revised Description: " + revisedDescription);
        System.out.println("Citation: " + citation);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object other) 
    {
        if (!super.equals(other)) return false;
        RevisedHistoricalEvent that = (RevisedHistoricalEvent) other;
        return this.revisedDescription.equals(that.revisedDescription) && this.citation.equals(that.citation);
    }
}