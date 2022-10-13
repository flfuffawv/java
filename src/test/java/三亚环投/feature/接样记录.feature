Feature: 接样记录

  Scenario Outline:接样记录输入
    Given SYHT-用户打开登陆页面 "<browse>"
    When SYHT-用户输入用户名 "DDK"
    And SYHT-用户输入密码 "123456"
    Then SYHT-按登陆
    Then SYHT-点击检测管理
    Then SYHT-点击接样记录
    When SYHT-接样记录-查找接样单"<ord>"
    When SYHT-接样记录-输入接样单内容


    Examples:
      | browse |ord|
      | chrome  |ST20220421|
