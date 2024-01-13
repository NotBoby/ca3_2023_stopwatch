package at.wifi.stopwatch.models;

import java.util.Date;
public class StopWatch {
    protected Date StartTime;
    protected Date StopTime;
    protected long Difference;

    public StopWatch() {
        this.StartTime = null;
        this.StopTime = null;
        this.Difference = 0;
    }


    public void start(){
        this.StartTime = new Date();
    }

    public void stop(){
        this.StopTime = new Date();
    }

    public void reset(){
        this.StartTime = null;
        this.StopTime = null;
    }

    public long difference(){
        //Nur wenn sowohl Startzeit und Stopzeit gesetz wurde und der Startzeitpunkt vor dem Stoppzeitpunkt liegt
        if(this.StartTime != null && this.StopTime != null && this.StartTime.before(this.StopTime)){
            return (this.StopTime.getTime() - this.StartTime.getTime())/1000;
        }
        return 0;
    }


    public Date getStartTime() {
        return StartTime;
    }

    public Date getStopTime() {
        return StopTime;
    }

    public long getDifference() {
        return Difference;
    }


    @Override
    public String toString() {
        int diff = (int) this.difference();

        int hours = (int) Math.floor (diff / 3600);
        diff = diff - (3600 * hours);
        int min = (int) Math.floor (diff / 60);
        diff = diff - (60 * min);


        return hours + ":" + min + ":" + diff;
    }
}
