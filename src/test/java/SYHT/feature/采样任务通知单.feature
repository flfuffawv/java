Feature: 采样任务通知单
 @内部任务
  Scenario Outline:内部任务=不增删明细

    Given SYHT-用户打开登陆页面 "<browse>""<num>"
    When SYHT-用户输入用户名 "admin"
    And SYHT-用户输入密码 "123456789"
    Then SYHT-按登陆
    Then SYHT-点击检测管理
    When SYHT-点击采样任务通知单
    When SYHY-采样任务-点击新增"<task>"
    When SYHY-采样任务-内部任务"<cust>""<type>"
    When SYHY-采样任务-选择采样人"<person>"
   When SYHY-采样任务-任务提交
    Examples:
     |num | browse |task|cust|type|person|

     |用例1 | chrome  |内部任务|海南天涯水业东部供水有限公司 |日检测（水源水）|化验员1|
     |用例2 | chrome  |内部任务|海南天涯水业东部供水有限公司 |日检测（原水）|化验员1|
     |用例3| chrome  |内部任务|海南天涯水业东部供水有限公司 |日检测（出厂水）|化验员1|
     |用例5 | chrome  |内部任务|海南天涯水业西部供水有限公司 |月检测（水源水）|化验员2|
     |用例6 | chrome  |内部任务|海南天涯水业西部供水有限公司 |月检测（出厂水）|化验员2|
     |用例7| chrome  |内部任务|海南天涯水业西部供水有限公司 |月检测（管网水）|化验员2|

     |用例10 | chrome  |内部任务|水净公司 | 污水日常检测（污水Y|化验员2|
     |用例11| chrome  |内部任务|水净公司 |污水日常检测（污水C）|化验员2|

  @内部任务=增加明细
  Scenario Outline:内部任务=增加明细

    Given SYHT-用户打开登陆页面 "<browse>""<num>"
    When SYHT-用户输入用户名 "admin"
    And SYHT-用户输入密码 "123456789"
    Then SYHT-按登陆
    Then SYHT-点击检测管理
    When SYHT-点击采样任务通知单
    When SYHY-采样任务-点击新增"<task>"
    When SYHY-采样任务-内部任务"<cust>""<type>"
    When SYHY-采样任务-增加采样明细
    When SYHY-采样任务-选择采样人"<person>"

    When SYHY-采样任务-任务提交

    Examples:
      |num | browse |task|cust|type|person|
      | 用例1| chrome  |内部任务|水净公司 |污水日常检测（污水Y）|化验员1|
      | 用例2| chrome  |内部任务|海南二次供水管理有限公司  |日检测（出厂水）|化验员1|
     # | chrome  |内部任务|海南二次供水管理有限公司 |日检测（出厂水）|化验员2|
     # | chrome  |内部任务|海南二次供水管理有限公司 |日检测（水源水）|化验员2|
     # | chrome  |内部任务|海南天涯水业东部供水有限公司 |日检测（原水）|化验员2|
     # | chrome  |内部任务|海南天涯水业东部供水有限公司 |日检测（出厂水）|化验员2|
     # | chrome  |内部任务|海南天涯水业东部供水有限公司 |日检测（水源水）|化验员2|
     # | ie  |内部任务|海南天涯水业西部供水有限公司 |日检测（原水）|化验员2|
     # | chrome  |内部任务|海南天涯水业西部供水有限公司 |日检测（出厂水）|化验员2|
     # | chrome  |内部任务|海南天涯水业西部供水有限公司 |日检测（水源水）|化验员2|
  @内部任务=删除明细
  Scenario Outline:内部任务=删除明细

    Given SYHT-用户打开登陆页面 "<browse>""<num>"
    When SYHT-用户输入用户名 "admin"
    And SYHT-用户输入密码 "123456789"
    Then SYHT-按登陆
    Then SYHT-点击检测管理
    When SYHT-点击采样任务通知单
    When SYHY-采样任务-点击新增"<task>"
    When SYHY-采样任务-内部任务"<cust>""<type>"
    When SYHY-采样任务-增加采样明细
    When SYHY-采样任务-选择采样人"<person>"
   # When 拉滚动条
   # When 删除明细
    When SYHY-采样任务-按保存
    When SYHY-采样任务-任务提交
    Examples:
      |num | browse |task|cust|type|person|
      | 用例1| chrome  |内部任务|水净公司 |污水日常检测（污水Y）|化验员1|
      | 用例2| chrome  |内部任务|海南二次供水管理有限公司  |日检测（出厂水）|化验员1|

@长期委托
  Scenario Outline:长期委托
    Given SYHT-用户打开登陆页面 "<browse>"
    When SYHT-用户输入用户名 "admin"
    And SYHT-用户输入密码 "123456789"
    Then SYHT-按登陆
    Then SYHT-点击检测管理
    When SYHT-点击采样任务通知单
    When SYHY-采样任务-点击新增"<task>"
  When SYHY-采样任务-长期委托"<ord>"
  When SYHY-采样任务-选择采样人"<person>"

    Examples:
      | browse |task|ord|person|
      | chrome  |长期委托|2022091619|化验员1|
      | chrome  |长期委托|2022091620|化验员1|
      | chrome  |长期委托|2022091621|化验员1|
      | chrome  |长期委托|2022091622|化验员1|
      | chrome  |长期委托|2022091623|化验员1|
      | chrome  |长期委托|2022091624|化验员1|
      | chrome  |长期委托|2022091625|化验员1|

