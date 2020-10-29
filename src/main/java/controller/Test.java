package controller;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

public class Test {
     public static void main(String[] args) {
          /*
          * 短信验证
          * */
          DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAI4FzvFzUATfExZWqfwZ2K", "RlXtVe77Ew7UH03QeDI2njrRFNIbzm");
          IAcsClient client = new DefaultAcsClient(profile);

          CommonRequest request = new CommonRequest();
          request.setSysMethod(MethodType.POST);
          request.setSysDomain("dysmsapi.aliyuncs.com");
          request.setSysVersion("2017-05-25");
          request.setSysAction("SendSms");
          request.putQueryParameter("RegionId", "cn-hangzhou");
          //手机号
          request.putQueryParameter("PhoneNumbers", "13294250799");
          request.putQueryParameter("SignName", "ABC商城");
          request.putQueryParameter("TemplateCode", "SMS_204465950");
          //填写要发送的短信信息
          request.putQueryParameter("TemplateParam", "{'code':'152'}");
          try {
               CommonResponse response = client.getCommonResponse(request);
               System.out.println(response.getData());
          } catch (ServerException e) {
               e.printStackTrace();
          } catch (ClientException e) {
               e.printStackTrace();
          }
     }
}
