package wb;

public class DependencyDownloader {
    public boolean downloadDependency(String groupID, String artifactID, String version) {
        StringBuilder url = new StringBuilder();
        url.append("http://repo1.maven.org/maven2/");
        url.append(groupID.replace(".", "/"));
        url.append("/");
        url.append(artifactID.replace(".", "/"));
        url.append("/");
        url.append(version.replace(".", "/"));
        return true;
    }
}
