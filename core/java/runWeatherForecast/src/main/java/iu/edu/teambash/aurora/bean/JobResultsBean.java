package iu.edu.teambash.aurora.bean;

import iu.edu.teambash.aurora.client.sdk.ScheduleStatus;

import java.net.URI;
import java.util.List;

/**
 * Created by janakbhalla on 10/12/16.
 */
public class JobResultsBean {

    private String jobName;

    private ScheduleStatus scheduleStatus;

    private List<URI> imageUrls;

    public JobResultsBean(String jobName, ScheduleStatus scheduleStatus, List<URI> imageUrls) {
        this.jobName = jobName;
        this.scheduleStatus = scheduleStatus;
        this.imageUrls = imageUrls;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

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
}
