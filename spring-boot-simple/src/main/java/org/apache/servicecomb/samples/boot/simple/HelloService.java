package org.apache.servicecomb.samples.boot.simple;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.*;

@RestSchema(schemaId = "hello")
@RequestMapping(path = "hello")
public class HelloService {

//	@RequestMapping(path = "hello", method = RequestMethod.GET)
//	@ApiOperation(value = "hello somebody", notes = "你好 哥们")
//	public String sayHello(@RequestParam(name="name") String name) {
//		return "Hello " + name;
//	}


	@RequestMapping(path = "baby", method = RequestMethod.POST)
	@ApiOperation(value = "登录,返回用户和token信息", notes = "登录后返回的accesstoken和refreshtoken用来校验用户，其中accesstoken先过期，过期后发送refreshtoken来刷新token")
	public MessageReponseBase<String> sayBaBy(@ApiParam("request") @RequestBody HelloDto helloDto) {
		MessageReponseBase<String> response = new MessageReponseBase<>();
		response.setData( "Hello " + helloDto.getName());
		return response;
	}
}
