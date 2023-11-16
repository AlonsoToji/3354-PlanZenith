public class ConflictCheck {

    //arrays containing event info. the same index corresponds to the same event in each array
    //as in, events[1] has the date dates[1], the start time starts[1], and so on
    public static String[] events = {"Microsoft Interview", "Drive to Vanscoy", "Invent the Lightbulb", "Charity Work"}; //contains the names of the vents
    public static String[] dates = {"01102024", "05012026", "10221879", "01102024"}; //contains the dates of the events in MMDDYYYY
    public static int[] starts = {1400, 300, 2330, 1900}; //contains the start time in military time (0000 - 2359)
    private static int[] ends = {1500, 2300, 2331, 2100}; //contains the end time in military time (0000 - 2359)

    //the method returns an array containing conflicting events
    public static int[] hasNoConflicts(String name, String date, int start, int end) {
        int[] conflicts = new int[events.length]; //this will contain the indexes of conflicting events
        //it will initialize all values to 0, so we will replace them with -1
        //this is so we do not confuse an empty value with the event at index 0
        for (int i = 0; i < conflicts.length; i++) conflicts[i] = -1;
        //we also make an iterator for conflicts
        int conflit = 0;

        for (int i = 0; i < dates.length; i++) {
            if (dates[i].equals(date)) { //if the events occur on the same day, check times

                //if the new event's start or end time is between the start and end times of the
                //event being checked, there is a conflict
                if (!(starts[i] > end || ends[i] < start))
                    conflicts[conflit++] = i;

            }
        }
        return conflicts;
    }

}
