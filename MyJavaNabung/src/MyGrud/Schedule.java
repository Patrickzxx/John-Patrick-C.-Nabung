package MyGrud;

/*
 * Schedule Model Class
 * --------------------
 * Ang class na ito ay ginagamit para mag-represent
 * ng isang schedule record sa system.
 * Dito ini-store at mina-manage ang subject, time, task, at deadline.
 */
public class Schedule {

    // Variable na nag-i-store ng pangalan ng subject
    private String subject;

    // Variable na nag-i-store ng oras ng schedule
    private String time;

    // Variable na nag-i-store ng task o gawain
    private String task;

    // Variable na nag-i-store ng deadline ng task
    private String deadline;

    /*
     * Constructor
     * -----------
     * Automatic na tinatawag kapag gumagawa ng Schedule object.
     * Inilalagay dito ang initial values ng subject, time, task, at deadline.
     */
    public Schedule(String subject, String time, String task, String deadline) {
        this.subject = subject;
        this.time = time;
        this.task = task;
        this.deadline = deadline;
    }

    /*
     * getSubject()
     * ------------
     * Ibinabalik ang kasalukuyang subject value.
     */
    public String getSubject() {
        return subject;
    }

    /*
     * setSubject()
     * ------------
     * Ina-update ang subject value.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /*
     * getTime()
     * ---------
     * Ibinabalik ang oras ng schedule.
     */
    public String getTime() {
        return time;
    }

    /*
     * setTime()
     * ---------
     * Ina-update ang oras ng schedule.
     */
    public void setTime(String time) {
        this.time = time;
    }

    /*
     * getTask()
     * ---------
     * Ibinabalik ang description ng task.
     */
    public String getTask() {
        return task;
    }

    /*
     * setTask()
     * ---------
     * Ina-update ang task description.
     */
    public void setTask(String task) {
        this.task = task;
    }

    /*
     * getDeadline()
     * -------------
     * Ibinabalik ang deadline ng task.
     */
    public String getDeadline() {
        return deadline;
    }

    /*
     * setDeadline()
     * -------------
     * Ina-update ang deadline ng task.
     */
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
}
