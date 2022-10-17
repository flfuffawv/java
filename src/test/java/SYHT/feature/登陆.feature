Feature: 登陆测试

  Scenario Outline:
    Given SYHT-用户打开登陆页面 "<browse>"
    When SYHT-用户输入用户名 "admin"
    And SYHT-用户输入密码 "123456789"
    Then SYHT-按登陆

    Examples:
      | browse |
      |ie|
      |ie |
      |ie |
