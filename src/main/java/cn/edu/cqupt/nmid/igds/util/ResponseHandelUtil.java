package cn.edu.cqupt.nmid.igds.util;


import cn.edu.cqupt.nmid.igds.constant.StatusCodeConstant;
import cn.edu.cqupt.nmid.igds.model.json.ResponseJson;
import cn.edu.cqupt.nmid.igds.model.page.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by why on 2017/3/12.
 */
public class ResponseHandelUtil {
    public static ResponseJson handleIntCondition(int expectResult, int actualResult, StatusCodeConstant errorCode){
        if(expectResult == actualResult)
            return new ResponseJson(StatusCodeConstant.OK);
        else
            return new ResponseJson(errorCode);
    }

    public static ResponseJson listHandel (List<?> list , Page page){
        Map<String , Object> map = new HashMap<>();
        map.put("list",list);
        map.put("page",page);
        ResponseJson responseJson =new ResponseJson(StatusCodeConstant.OK);
        responseJson.setBody(map);
        return responseJson;
    }
}
