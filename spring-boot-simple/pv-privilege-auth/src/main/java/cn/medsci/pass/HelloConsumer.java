
 package cn.medsci.pass;

 import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
 import org.springframework.web.client.RestTemplate;

 public class HelloConsumer {
     private final RestTemplate restTemplate = RestTemplateBuilder.create();

     public void invokeHello() {
         //service url is : cse://serviceName/operation
         String serviceName = "HelloServiceComb";
         restTemplate.getForObject("cse://" + serviceName + "/hello", String.class);
     }
 }