import Service.HttpUtil;
import bean.DataMenuBean;
import bean.Utils;
import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * @PackageName:
 * @FileName:
 * @Description:
 * @Author: wangshy
 * @company: 上海势航网络科技有限公司
 * @Date 17/12/18
 */
public class MainJava {
    public static final String DEF_CHATSET = "UTF-8";
    public static final int DEF_CONN_TIMEOUT = 30000;
    public static final int DEF_READ_TIMEOUT = 30000;
    public static String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";

    //配置您申请的KEY
    public static final String APPKEY = "cffb413a02e4a83d97ffeb52321366ee";

    public static void getRequest1() {
        String result = null;
        String url = "http://apis.juhe.cn/cook/query.php";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("menu", "家常菜");//需要查询的菜谱名
        params.put("key", APPKEY);//应用APPKEY(应用详细页查询)
        params.put("dtype", "");//返回数据的格式,xml或json，默认json
        params.put("pn", "1");//数据返回起始下标
        params.put("rn", "30");//数据返回条数，最大30
        params.put("albums", "0");//albums字段类型，1字符串，默认数组

        try {
            result = HttpUtil.net(url, params, "GET");
            DataMenuBean object = JSONObject.parseObject(result, DataMenuBean.class);

            if (object.getError_code() == 0) {
                System.out.println(object.getResult());
            } else {
                System.out.println(object.getError_code() + ":" + object.getReason());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    /**
//     * @param strUrl 请求地址
//     * @param params 请求参数
//     * @param method 请求方法
//     * @return 网络请求字符串
//     * @throws Exception
//     */
//    public static String net(String strUrl, Map params, String method) throws Exception {
//        HttpURLConnection conn = null;
//        BufferedReader reader = null;
//        String rs = null;
//        try {
//            StringBuffer sb = new StringBuffer();
//            if (method == null || method.equals("GET")) {
//                strUrl = strUrl + "?" + urlencode(params);
//            }
//            URL url = new URL(strUrl);
//            conn = (HttpURLConnection) url.openConnection();
//            if (method == null || method.equals("GET")) {
//                conn.setRequestMethod("GET");
//            } else {
//                conn.setRequestMethod("POST");
//                conn.setDoOutput(true);
//            }
//            conn.setRequestProperty("User-agent", userAgent);
//            conn.setUseCaches(false);
//            conn.setConnectTimeout(DEF_CONN_TIMEOUT);
//            conn.setReadTimeout(DEF_READ_TIMEOUT);
//            conn.setInstanceFollowRedirects(false);
//            conn.connect();
//            if (params != null && method.equals("POST")) {
//                try {
//                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
//                    out.writeBytes(urlencode(params));
//                } catch (Exception e) {
//                    // TODO: handle exception
//                }
//            }
//            InputStream is = conn.getInputStream();
//            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
//            String strRead = null;
//            while ((strRead = reader.readLine()) != null) {
//                sb.append(strRead);
//            }
//            rs = sb.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (reader != null) {
//                reader.close();
//            }
//            if (conn != null) {
//                conn.disconnect();
//            }
//        }
//        return rs;
//    }
//
//    //将map型转为请求参数型
//    public static String urlencode(Map<String, Object> data) {
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry i : data.entrySet()) {
//            try {
//                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//        }
//        return sb.toString();
//    }

    public static void main(String[] strings) {
//        getRequest1();
//        getRequest4();
//        Map<String, Integer> hmap = new HashMap<String, Integer>();


        String str = "家常菜";
        System.out.println(Utils.getKey(str));
//        String str = "张三;李四;王五;赵六";
//        String[] strings1 = str.split(";");
//
//        List<String> list = Arrays.asList(strings1);
//        for (String strs : list
//                ) {
//            System.out.println(strs);
//        }

    }

    //4.按菜谱ID查看详细
    public static void getRequest4() {
        String result = null;
        String url = "http://apis.juhe.cn/cook/queryid";//请求接口地址
        Map params = new HashMap();//请求参数
        params.put("id", "2884");//菜谱的ID
        params.put("key", APPKEY);//应用APPKEY(应用详细页查询)
        params.put("dtype", "1");//返回数据的格式,xml或json，默认json

        try {
            result = HttpUtil.net(url, params, "GET");
            JSONObject object = JSONObject.parseObject(result);
            if (object.getIntValue("error_code") == 0) {
                System.out.println(object.get("result"));
            } else {
                System.out.println(object.get("error_code") + ":" + object.get("reason"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
