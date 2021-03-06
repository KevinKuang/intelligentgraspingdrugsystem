/**
 * 
 */
package cn.edu.cqupt.nmid.igds.constant;

public enum StatusCodeConstant {
    OK(200,"OK#成功返回"),//成功返回
    CREATED(201,"CREATED#新建或修改资源成功"),//新建或修改资源成功
    NO_CONTENT(204,"NO_CONTENT#删除数据成功"),//删除数据成功
    INVALID_REQUEST(400,"INVALID_REQUEST#请求有误或者参数错误，服务器无法处理"),//请求有误或者参数错误
    UNAUTHORIZED(401,"UNAUTHORIZED#没有权限"),//没有权限
    FORBIDDEN(403,"FORBIDDEN#操作被禁止"),//得到了权限但是被禁止
    NOT_FOUND(404,"NOT_FOUND#找不到相关资源或用户"),//请求了不存在的资源
    NOT_ACCEPTABLE(406,"NOT_ACCEPTABLE#格式无法获取"),//用户请求的格式不可得到
    GONE(410,"GONE#请求的资源已经被删除"),//用户请求资源被永久删除
    UNPROCESABLE_ENTITY(422,"UNPROCESABLE_ENTITY#验证错误"),//创建对象时验证错误
    INTERNAL_SERVER_ERROR(500,"INTERNAL_SERVER_ERROR#服务器内部错误"),//服务器内部错误
    USER_NOT_EXIST(1000,"用户不存在"),
    USER_UNLOGIN(1003,"用户未登录"),
    TOKEN_NOT_EXIST(2000,"token not exist"),
    JSON_PARSE_ERROR(4000,"JSON PARSE ERROR");
    private int code;
    private String message;
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private StatusCodeConstant(int code, String message) {
	this.code = code;
	this.message = message;
    }
}