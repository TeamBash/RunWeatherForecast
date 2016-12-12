package iu.edu.teambash.aurora.bean;

import iu.edu.teambash.aurora.client.sdk.ScheduleStatus;

import java.net.URI;
import java.util.List;

/**
 * Created by janakbhalla on 11/12/16.
 */
public class TaskResultsBean {

    private ScheduleStatus scheduleStatus;

    private List<URI> imageUrls;

    public ScheduleStatus getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(ScheduleStatus scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public List<URI> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<URI> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public TaskResultsBean(ScheduleStatus scheduleStatus, List<URI> imageUrls) {
        this.scheduleStatus = scheduleStatus;
        this.imageUrls = imageUrls;
    }
}
