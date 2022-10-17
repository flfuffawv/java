Feature: 委托协议
@委托协议输入－采样
Scenario Outline:委托协议输入-采样
Given SYHT-用户打开登陆页面 "<browse>"
When SYHT-用户输入用户名 "DDK"
And SYHT-用户输入密码 "123456"
Then SYHT-按登陆
Then SYHT-点击检测管理
  Then SYHT-点击委托协议
  Then SYHT-委托协议-新增
  Then SYHT-委托协议-输入"<cust>""<typ>"
  Then SYHT-委托协议-保存


Examples:
| browse |cust|typ|
| chrome  |海南天涯水业东部供水有限公司| 日检测（出厂水）|
  @委托协议输入－送样
  Scenario Outline:委托协议输入-采样
    Given SYHT-用户打开登陆页面 "<browse>"
    When SYHT-用户输入用户名 "DDK"
    And SYHT-用户输入密码 "123456"
    Then SYHT-按登陆
    Then SYHT-点击检测管理
    Then SYHT-点击委托协议
    Then SYHT-委托协议-新增
    Then SYHT-委托协议-输入"<cust>""<typ>"
    Then SYHT-委托协议-选择送样
   # Then SYHT-委托协议-保存


    Examples:
      | browse |cust|typ|
      | chrome  |海南天涯水业东部供水有限公司| 日检测（出厂水）|
