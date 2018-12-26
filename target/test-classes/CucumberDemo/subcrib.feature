#Auther: hoact3@gmail.com

Feature: UC-FE01 As an end user I want the ability to provide my information,
so that I may receive the newsletters from provider

 Scenario: Show message for Email invalid

 Given I am staying testmaster
 When I provide invalid value for email
 And I do submit button Regis
 Then  I should see "* Email không đúng định dạng"

 Scenario Outline: Show extra information form  For Email valid

 Given I am staying testmaster
 When I enter email as "<email>"
 And I do submit button Regis
 Then I showld see extra information Form

 Examples: 
 |email|
|	test13@gmail.com|


 Scenario Outline: Show message error for fields blank

 Given I am staying testmaster
 When I enter email as "<email>"
 And I do submit button Regis
 And I provide field name is blank
 And I do submit button buttonAllow
 Then I see "This is required field"
 Examples: 
 |email|
 |	test13@viettel.com|
 
Scenario Outline: Default value of Gender is “Không xác định” and Defaul value of NewsType is "Nhận tất cả các loại tin"

 Given I am staying testmaster
 When I enter email as "<email>"
 And I do submit button Regis
 Then I see Gender "<gender>"
 And I see NewsType "<NewsType>"
 Examples: 
 |email					|gender					|	NewsType									|		
 |test13@gm.com	|Không xác định	|	Nhận tất cả các loại tin	|
 
@tag1
Scenario Outline: Show popup message "Bạn đã đăng ký thành công"

	Given I am staying testmaster
 	When I enter email as "<email>"
 	And I do submit button Regis  
 	And I enter Name value
 	And I do submit button Allow
 	Then I see popup message "success"
	Examples: 
 	|email|
 	|	test14@cn.com|
 	
