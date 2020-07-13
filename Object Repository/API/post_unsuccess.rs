<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>post_unsuccess</name>
   <tag></tag>
   <elementGuidId>e7da353d-0ff1-458f-824c-56c8a48ba5cc</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;${pwd}\&quot;,\n    \&quot;job\&quot;: \&quot;leader\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://reqres.in/api/users</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <variables>
      <defaultValue>GlobalVariable.uname</defaultValue>
      <description></description>
      <id>9d3bed9f-f3b4-4cb9-9935-b1757562606e</id>
      <masked>false</masked>
      <name>username1</name>
   </variables>
   <variables>
      <defaultValue>'umashravan'</defaultValue>
      <description></description>
      <id>95ca8590-af67-4aab-8f9f-421ec459976a</id>
      <masked>false</masked>
      <name>pwd</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()
//global variable
GlobalVariable.uname
//local variable
def variables = request.getVariables()
def variable = variables.get('pwd')
//contains string

assertThat(response.getResponseText()).contains('leader')
//convert to json obj
def jsonSlurper = new JsonSlurper()

def jsonResponse = jsonSlurper.parseText(response.getResponseText())


//is equal to string 
/*assertThat(response.getResponseText()).isEqualTo(&quot;{
  &quot;name&quot;:&quot;uma@123&quot;,
  &quot;job&quot;:&quot;leader&quot;,
  &quot;id&quot;:&quot;982&quot;,
  &quot;createdAt&quot;:&quot;2020-07-07T11:18:21.009Z&quot;
}
&quot;)*/

//json value check 

WS.verifyElementPropertyValue(response, 'name', &quot;uma@123&quot;)
WS.verifyElementPropertyValue(response, 'job', &quot;leader&quot;)
//content type header checkpoint 

//assertThat(response.getHeaderFields().get('Content-Type').toString()).isEqualTo('[application/json;charset=UTF-8]')

//assertThat(response.getHeaderFields().containsKey('Content-Type')).isTrue()

//status code 


WS.verifyResponseStatusCode(response, 201)

assertThat(response.getStatusCode()).isEqualTo(201)

// status code successfly request 
assertThat(response.getStatusCode()).isIn(Arrays.asList(200, 201, 202))</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
