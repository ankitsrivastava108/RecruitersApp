
package com.khoslalabs.recruiters.models;


import com.google.gson.annotations.Expose;


public class Collection1 {

    @Expose
    private Image image;
    @Expose
    private Name name;
    @Expose
    private String position;
    @Expose
    private String location;
    @Expose
    private String skills;
    @Expose
    private ActiveJobs activeJobs;
    @Expose
    private Integer index;
    @Expose
    private String url;

    /**
     * 
     * @return
     *     The image
     */
    public Image getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The name
     */
    public Name getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The position
     */
    public String getPosition() {
        return position;
    }

    /**
     * 
     * @param position
     *     The position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 
     * @return
     *     The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * 
     * @param location
     *     The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 
     * @return
     *     The skills
     */
    public String getSkills() {
        return skills;
    }

    /**
     * 
     * @param skills
     *     The skills
     */
    public void setSkills(String skills) {
        this.skills = skills;
    }

    /**
     * 
     * @return
     *     The activeJobs
     */
    public ActiveJobs getActiveJobs() {
        return activeJobs;
    }

    /**
     * 
     * @param activeJobs
     *     The activeJobs
     */
    public void setActiveJobs(ActiveJobs activeJobs) {
        this.activeJobs = activeJobs;
    }

    /**
     * 
     * @return
     *     The index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * 
     * @param index
     *     The index
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
