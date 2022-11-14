Feature: 登陆测试

  Scenario Outline:
    Given HR-用户打开登陆页面 "<browse>"
    When HR-用户输入用户名 "admin"
    And HR-用户输入密码 "123456"
    Then HR-按登陆

    Examples:
      | browse |
      |chrome|
