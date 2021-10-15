public class Process {

    int arrivalTime;
    String processId;
    int serviceTime;
    int priority;

    public Process() {
        arrivalTime = 0;
        processId = "default";
        serviceTime = 0;
        priority = 0;
    }

    public Process(int arrivalTime, String processId, int serviceTime, int priority) {
        this.arrivalTime = arrivalTime;
        this.processId = processId;
        this.serviceTime = serviceTime;
        this.priority = priority;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Process{" +
                "arrivalTime=" + arrivalTime +
                ", processId='" + processId + '\'' +
                ", serviceTime=" + serviceTime +
                ", priority=" + priority +
                '}';
    }
}
