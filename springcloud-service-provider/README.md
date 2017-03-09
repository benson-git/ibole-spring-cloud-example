创建“服务提供方”
---

##集成swagger构建restful api

http://localhost:2222/swagger-ui.html

说明：

- @Api：用在类上，说明该类的作用
- @ApiOperation：用在方法上，说明方法的作用
- @ApiImplicitParams：用在方法上包含一组参数说明
- @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面: </br>
paramType：参数放在哪个地方 </br>
   header-->请求参数的获取：@RequestHeader </br>
   query-->请求参数的获取：@RequestParam </br>
   path（用于restful接口）-->请求参数的获取：@PathVariable  </br>
body（不常用） </br>
form（不常用） </br>
name：参数名 </br>
dataType：参数类型  </br>
required：参数是否必须传  </br>
value：参数的意思 </br>
defaultValue：参数的默认值  </br>
- @ApiResponses：用于表示一组响应
- @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息： </br>
   code：数字，例如400  </br>
   message：信息，例如"请求参数没填好"  </br>
   response：抛出异常的类  </br>
- @ApiModel：描述一个Model的信息 </br>
  （这种一般用在post创建的时候，使用@RequestBody这样的场景，请求参数无法使用@ApiImplicitParam注解进行描述的时候）
- @ApiModelProperty：描述一个model的属性