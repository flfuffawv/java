Feature: 基础资料－公司
  Scenario Outline:新增删除公司

    Given HR-用户打开登陆页面 "<browse>"
    When HR-用户输入用户名 "admin"
    And HR-用户输入密码 "123456"
    Then HR-按登陆
    When HR-点击基本资料
    When HR-点击公司
    When HR-新增公司"<cd>""<name>""<期望保存成功>"
    When HR-删除公司"<c_cd>"



    Examples:
      | browse |cd|name|期望保存成功|c_cd|
      |chrome|FWGJT| 骏达公司|保存成功！|FWGJT|
      |chrome|FWJT1| 骏达#|保存成功！|FWGJT1|
      |chrome|JT_2| 骏达147_147|保存成功！|JT_2|
      |chrome|JT/2| 骏达147_147|保存成功！|JT/2|
      |chrome|abcdefg/2| 骏达147_147|保存成功！|abcdefg/2|
      |chrome|abcdefg---2| 骏达147_147|保存成功！|abcdefg---2|
