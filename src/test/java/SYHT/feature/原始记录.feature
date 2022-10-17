Feature: 原始记录
  @原始记录输入
  Scenario Outline:原始记录输入
    Given 用户打开登陆页面 "<browse>"
    When 用户正输入用户名 "DDK"
    And 用户正输入密码 "123456"
    Then 按登陆
    Then 原始记录"<ord>"



    Examples:
      | browse |ord|
      | chrome  |OR2022092304|
      | chrome  |OR2022092303|
      | chrome  |OR20220315559|
      | chrome  |OR20220315558|
      | chrome  |OR20220315557|