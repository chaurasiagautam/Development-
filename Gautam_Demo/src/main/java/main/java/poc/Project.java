package main.java.poc;

import java.util.Date;

public class Project{
  public Object abbreviation;
  public Object defaultTeamImageUrl;
  public String description;
  public String id;
  public Date lastUpdateTime;
  public String name;
  public int revision;
  public String state;
  public String url;
  public String visibility;

  public Object getAbbreviation() {
    return abbreviation;
  }

  public void setAbbreviation(Object abbreviation) {
    this.abbreviation = abbreviation;
  }

  public Object getDefaultTeamImageUrl() {
    return defaultTeamImageUrl;
  }

  public void setDefaultTeamImageUrl(Object defaultTeamImageUrl) {
    this.defaultTeamImageUrl = defaultTeamImageUrl;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Date getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(Date lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRevision() {
    return revision;
  }

  public void setRevision(int revision) {
    this.revision = revision;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }
}
