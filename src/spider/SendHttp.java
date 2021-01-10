//package spider;
//
///**
// * @author 潘勇
// * @date 2021/1/8 9:53
// */
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.CookieStore;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.BasicCookieStore;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.impl.cookie.BasicClientCookie;
//import org.apache.http.util.EntityUtils;
//
//import java.io.IOException;
//
//public class SendHttp {
//
//    public static String post(String urlNameString, String json) {
//        String result = "";
//        CookieStore cookieStore = new BasicCookieStore();
//        CloseableHttpClient httpClient = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
//        try {
//            //解决中文乱码问题
//            StringEntity entity = new StringEntity(json, "utf-8");
//            entity.setContentEncoding("UTF-8");
//            entity.setContentType("application/json");
//            //这里发送post请求
//            HttpPost post = new HttpPost(urlNameString);
//            post.setEntity(entity);
//
//            BasicClientCookie cookie = new BasicClientCookie("JSESSIONID", "C772845B737EE19627AF7901A9F1831A");
//            cookie.setDomain("100.119.114.146");
//            cookie.setPath("/");
//            cookieStore.addCookie(cookie);
//            // 通过请求对象获取响应对象
//            HttpResponse response = httpClient.execute(post);
//            // 判断网络连接状态码是否正常(0--200都数正常)
//            result = EntityUtils.toString(response.getEntity(), "utf-8");
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        return result;
//    }
//
//
//    public static void main(String[] args) throws IOException {
//        //发送 GET 请求
////        String s= SendHttp.sendGet("http://100.119.114.146:8080/intelligentConfig/commit", "key=123&v=456");
////        System.out.println(s);
//
//        String json = "{\n" +
//                "    \"scheduleConfig\":\"{}\",\n" +
//                "    \"deptCode\":\"CC769\",\n" +
//                "    \"beginDate\":\"20210106\",\n" +
//                "    \"endDate\":\"20210106\"\n" +
//                "}";
//
//        //发送 POST 请求
//        String sr = com.sf.eos.grs.util.SendHttp.post("http://100.119.114.146:8080/intelligentConfig/commit", json);
//        System.out.println(sr);
//    }
//}
