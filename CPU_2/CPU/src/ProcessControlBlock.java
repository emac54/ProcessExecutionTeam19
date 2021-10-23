/**
 * Team 19
 */

public class ProcessControlBlock {
    // Variables of ProcessControlBlock include:
    // The name of the process provided,
    public String processName;
    // the arrival time provided,
    public int arrivalTime;
    // the service time provided,
    public int serviceTime;
    // the finish time,
    public int finishTime;
    // the tat,
    public int tat;
    // and the nTAT.
    public double nTAT;

    // The processControlBlock is created with the various variables passed through.
    public ProcessControlBlock(String processName, int arrivalTime, int serviceTime, int finishTime, int tat, double nTAT) {
        super();
        this.processName = processName;
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.finishTime = finishTime;
        this.tat = tat;
        this.nTAT = nTAT;
    }

}

