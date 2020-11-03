package main.java.poc;

public class Root{
  public String defaultBranch;
  public String id;
  public Object isFork;
  public String name;
  public Object parentRepository;
  public Project project;
  public String remoteUrl;
  public int size;
  public String sshUrl;
  public String url;
  public Object validRemoteUrls;
  public String webUrl;

  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Object getIsFork() {
    return isFork;
  }

  public void setIsFork(Object isFork) {
    this.isFork = isFork;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Object getParentRepository() {
    return parentRepository;
  }

  public void setParentRepository(Object parentRepository) {
    this.parentRepository = parentRepository;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public String getRemoteUrl() {
    return remoteUrl;
  }

  public void setRemoteUrl(String remoteUrl) {
    this.remoteUrl = remoteUrl;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getSshUrl() {
    return sshUrl;
  }

  public void setSshUrl(String sshUrl) {
    this.sshUrl = sshUrl;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Object getValidRemoteUrls() {
    return validRemoteUrls;
  }

  public void setValidRemoteUrls(Object validRemoteUrls) {
    this.validRemoteUrls = validRemoteUrls;
  }

  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }
}
