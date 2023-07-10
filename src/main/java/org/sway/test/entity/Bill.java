package org.sway.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import java.util.Date;

//Table - Bill
@Entity
public class Bill {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String title; 
    private String summary;
    private String status;
    private String category;
    private String level;
    private String chamber;
    private String link;
    private String user_vote_path;
    private String audiobucket_path;
    private String audio_byline;

    // Consider a more robust Date format
    private Date date_created;          // date this entity was created??
    private Date date_introduced;       // date bill was introduced 
    private Date date_released;         // uncertain

    private long sponsor_id;
    // private int num_supporters;
    // private int num_opposers;
    // private long external_id;
    // private long firestone_id;

    private boolean is_active;
    private boolean was_tweeted;
    private boolean sent_initial_notification;  // Does 'sent_notif' work?
    
    // Constructors
    protected Bill(){}
    
    public Bill(String name, String title, String summary, String status, String category, String level, String chamber,
            String link, String user_vote_path, String audiobucket_path, String audio_byline, Date date_created,
            Date date_introduced, Date date_released, long sponsor_id, boolean is_active, boolean was_tweeted,
            boolean sent_initial_notification) {
        super();
        this.name = name;
        this.title = title;
        this.summary = summary;
        this.status = status;
        this.category = category;
        this.level = level;
        this.chamber = chamber;
        this.link = link;
        this.user_vote_path = user_vote_path;
        this.audiobucket_path = audiobucket_path;
        this.audio_byline = audio_byline;
        this.date_created = date_created;
        this.date_introduced = date_introduced;
        this.date_released = date_released;
        this.sponsor_id = sponsor_id;
        this.is_active = is_active;
        this.was_tweeted = was_tweeted;
        this.sent_initial_notification = sent_initial_notification;
            }   

    // Getters and Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    public String getChamber() {
        return chamber;
    }
    public void setChamber(String chamber) {
        this.chamber = chamber;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getUser_vote_path() {
        return user_vote_path;
    }
    public void setUser_vote_path(String user_vote_path) {
        this.user_vote_path = user_vote_path;
    }
    public String getAudiobucket_path() {
        return audiobucket_path;
    }
    public void setAudiobucket_path(String audiobucket_path) {
        this.audiobucket_path = audiobucket_path;
    }
    public String getAudio_byline() {
        return audio_byline;
    }
    public void setAudio_byline(String audio_byline) {
        this.audio_byline = audio_byline;
    }
    public Date getDate_created() {
        return date_created;
    }
    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }
    public Date getDate_introduced() {
        return date_introduced;
    }
    public void setDate_introduced(Date date_introduced) {
        this.date_introduced = date_introduced;
    }
    public Date getDate_released() {
        return date_released;
    }
    public void setDate_released(Date date_released) {
        this.date_released = date_released;
    }
    public long getSponsor_id() {
        return sponsor_id;
    }
    public void setSponsor_id(long sponsor_id) {
        this.sponsor_id = sponsor_id;
    }
    public boolean isIs_active() {
        return is_active;
    }
    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }
    public boolean isWas_tweeted() {
        return was_tweeted;
    }
    public void setWas_tweeted(boolean was_tweeted) {
        this.was_tweeted = was_tweeted;
    }
    public boolean isSent_initial_notification() {
        return sent_initial_notification;
    }
    public void setSent_initial_notification(boolean sent_initial_notification) {
        this.sent_initial_notification = sent_initial_notification;
    }

    // toString Method
    @Override
    public String toString() {
        return "Bill [id=" + id + ", name=" + name + ", title=" + title + ", summary=" + summary + ", status=" + status
                + ", category=" + category + ", level=" + level + ", chamber=" + chamber + ", link=" + link
                + ", user_vote_path=" + user_vote_path + ", audiobucket_path=" + audiobucket_path + ", audio_byline="
                + audio_byline + ", date_created=" + date_created + ", date_introduced=" + date_introduced
                + ", date_released=" + date_released + ", sponsor_id=" + sponsor_id + ", is_active=" + is_active
                + ", was_tweeted=" + was_tweeted + ", sent_initial_notification=" + sent_initial_notification + "]";
    }

}
