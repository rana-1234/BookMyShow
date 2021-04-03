package external;


import java.util.Map;

public class Requestor {

  private String url;
  private Map<String, String> headers;
  private Object requestBody;


  public Requestor(String url, Map<String, String> hdrs, Object requestBody){
    this.headers = hdrs;
    this.url = url;
    this.requestBody = requestBody;
  }

}
