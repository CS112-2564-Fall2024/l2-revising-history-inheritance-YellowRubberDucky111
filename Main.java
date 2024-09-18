public class Main {
	public static void main(String[] args) 
	{
        HistoricalEvent[] array = new HistoricalEvent[11];
        array[0] = new HistoricalEvent("Wave of strikes begins in Poland.", new Date(4, 21, 1988));
        array[1] = new HistoricalEvent("Strikes at the July Manifesto coal mine; workers demand re-legalization of Solidarity.", new Date(8, 15, 1988));
        array[2] = new HistoricalEvent("Lech Wałęsa invited to Warsaw for talks with communist authorities.", new Date(8, 31, 1988));
        array[3] = new HistoricalEvent("Round Table discussions begin in Warsaw.", new Date(2, 6, 1989));
        array[4] = new HistoricalEvent("Round Table Agreement signed, legalizing Solidarity and allowing partly free elections.", new Date(4, 4, 1989));
        array[5] = new HistoricalEvent("Solidarity achieves overwhelming victory in parliamentary elections.", new Date(6, 4, 1989));
        array[6] = new HistoricalEvent("Tadeusz Mazowiecki nominated as Prime Minister, marking a shift to non-communist leadership.", new Date(8, 19, 1989));
        array[7] = new HistoricalEvent("Sejm amends the constitution, changing the country's name to the Republic of Poland.", new Date(12, 29, 1989));
        array[8] = new HistoricalEvent("Communist Polish United Workers' Party dissolves itself.", new Date(1, 29, 1990));
        array[9] = new HistoricalEvent("Wałęsa becomes the first non-communist president of Poland.", new Date(11, 21, 1990));
        RevisedHistoricalEvent revisedEvent = new RevisedHistoricalEvent("Round Table Agreement signed, legalizing Solidarity and allowing partly free elections.", new Date(4, 4, 1989), "The Round Table talks resulted in significant political reforms and the establishment of a democratic government.", "Source: Revolutions of 1989 - Wikipedia");
        array[10] = revisedEvent;

		for (int j = 0; j < array.length - 1; j++) 
		{
			for (int i = 0; i < array.length - 1 - j; i++) 
			{
				if (array[i].compareTo(array[i + 1]) > 0) 
				{
                    HistoricalEvent temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

		for (int i = 0; i < array.length - 1; i++) 
		{ 
            array[i].teach();
        }
        System.out.println("====================================================");
        System.out.println("REVISED HISTORICAL EVENT:");
        System.out.println("====================================================");
    }
}