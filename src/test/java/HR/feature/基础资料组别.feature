Feature: 基础资料－组别
  Scenario Outline:先新增组别，再用新增的组别信息查找，最后删除组别

    Given HR-用户打开登陆页面 "<browse>"
    When HR-用户输入用户名 "admin"
    And HR-用户输入密码 "123456"
    Then HR-按登陆
    When HR-用例备注"<remark>"
    When HR-点击基本资料
    When HR-点击组别
    When HR-新增组别"<cd>""<nm>"
    When HR-查找组别"<cd>""<nm>"
    When HR-删除组别



    Examples:
    | remark| browse |cd|nm|
    | 组别为数字且不重覆|ie| 30 |组别为数字且不重覆（若能新增成功后请同时测试修改功能和删除功能）  |
    | 组别为数字+中文|ie| 30上 |组别为数字+中文（若能新增成功后请同时测试修改功能和删除功能）  |
    | 组别为数字+字母|ie| 30A |组别为数字+字母（若能新增成功后请同时测试修改功能和删除功能） |
    | 新增一个重覆的组别|ie| 11|新增一个重覆的组别（若能新增成功后请同时测试修改功能和删除功能） |
