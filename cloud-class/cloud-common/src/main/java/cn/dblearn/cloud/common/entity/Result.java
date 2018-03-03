package cn.dblearn.cloud.common.entity;


import java.util.HashMap;

/**
 * 通用返回数据类
 */
public class Result extends HashMap<String,Object> {

    public Result() {
        put("code",HttpStatus.SC_OK);
    }

    public static Result error(){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,"未知异常，请联系管理员");

    }

    public static Result error(String msg){
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR,msg);
    }

    public static Result error(int code,String msg){
        Result result=new Result();
        result.put("code",code);
        result.put("msg",msg);
        return result;
    }

    public static Result ok(){
        return new Result();
    }

    public static Result ok(String msg){
        Result result=new Result();
        result.put("msg",msg);
        return result;
    }
    public static Result ok(HashMap<String,Object> map){
        Result result=new Result();
        result.putAll(map);
        return result;
    }

    @Override
    public Result put(String key,Object value){
        super.put(key,value);
        return this;
    }

}
