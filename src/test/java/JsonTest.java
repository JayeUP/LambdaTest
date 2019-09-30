import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

import cn.hutool.json.JSONUtil;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonTest {
    @Test
    public void JsonTest1() {
        String jsonStr = "{\"payList\":[{\"client\":\"1\",\"payType\":\"2\",\"payConfig\":\"3\"},{\"client\":\"4\",\"payType\":\"5\",\"payConfig\":\"6\"}]}";
        String jsonStr1 = "{\"payList\":[{\"client\":4,\"payType\":2,\"payConfig\":10}]}";
        String jsonStr2 = "{\"client\":4,\"payType\":2,\"payConfig\":10}";
        String jsonList = "[{\"client\":11,\"payType\":3,\"payConfig\":15},{\"client\":4,\"payType\":2,\"payConfig\":10}]";
        JSONObject payTypeConfig = new JSONObject(jsonStr1);
        System.out.println("payTypeConfig = " + payTypeConfig);
        JSONObject payTypeConfig2 = new JSONObject(jsonStr2);
        String client = payTypeConfig2.getStr("client");
        System.out.println("client = " + client);
//        JSONObject jsonListObject = new JSONObject(jsonList);
//        JSONArray objects = JSONUtil.parseArray(jsonStr);
//        ArrayList<Map<String, String>> ts = objects.toList(new HashMap<String, String>() );

        JSONArray objects = new JSONArray(jsonList);
        JSONArray array = new JSONArray();
//        List<PayList> = objects.toList(objects, PayList.class);
        List<JSONObject> payList1 = JSONUtil.toList(JSONUtil.parseArray(jsonList),JSONObject.class);
        List<Map<String, Integer>> payList = payList1.stream().map(jsonObject -> {
            HashMap<String, Integer> payMap = new HashMap<>();
            payMap.put("client",jsonObject.getInt("client"));
            payMap.put("payType",jsonObject.getInt("payType"));
            payMap.put("payConfig",jsonObject.getInt("payConfig"));
            return payMap;
        }).collect(Collectors.toList());
//        ArrayList<Map<String, String>> payList = jsonListObject.toBean(new ArrayList<>());
//        List<Map<String,Integer>> payList = (List<Map<String,Integer>>) payTypeConfig.get("payList");
        System.out.println("payList = " + payList);
       /* List<Map<String, Integer>> collect = payList.stream().filter(payConfigs -> payConfigs.get("client") == 4).collect(Collectors.toList());
        for (Map<String, Integer> stringMap : collect) {
            for (HashMap.Entry<String,Integer> map : stringMap.entrySet() ){
                System.out.println(map.getKey()+ ":" + map.getValue());

            }
        }*/
        //{"payList":[{"client":11,"payType":3,"payConfig":15},{"client":4,"payType":2,"payConfig":10}]}

    }
}

class PayList {
    Integer client;
    Integer payType;
    Integer payConfig;
}
