#dev-template
项目开发模板

# 基础开发环境
* JDK: 1.8
* Maven: 3.3+
* MySql: 5.7+ 

# IDE插件
* Lombok Plugin （必装）
* Alibaba Java Coding Guidelines plugin (必须)


# 技术栈
* spring boot 2.1.3
* mybatis-plus 3.3.2
* swagger2
* lombok
* hutool
* Druid

# 开发规范
## 编码规范
参见阿里JAVA开发规范 泰山版
## commit 规范
### 基础用法
```shell script
git commit -m "<type>(<scope>): <subject>"
```
比如以下的实际样例
- 某次commit，我们在开发中是修复了service层中手机号验证的bug，提交信息为
git commit -m "fix(service):手机号验证"
- 某次commit，我们提交 用户注册模块的代码，那么 提交信息为
git commit -m "feat(addition):完成用户注册模块"
- 某次bug修复，我们修复了bug编号为198的bug，功能为修改密码，提交信息为
git commit -m "fix(198):修复修改密码"

或者不写scope部分
### type
```
feat:          新增feature
fix:           修复bug
docs:          仅仅修改了文档，比如README, CHANGELOG, CONTRIBUTE等等            
style:         仅仅修改了空格、格式缩进、标点符号等等，不改变代码逻辑
refactor:      代码重构，没有加新功能或者修复bug
test:          测试用例，包括单元测试、集成测试等            
chore:         改变构建流程、或者增加依赖库、工具等
perf:          优化相关，比如提升性能、体验
revert:        回滚到上一个版本
```
### scope
scope 用于说明 commit 影响的范围，比如数据层、控制层、视图层等等，视项目不同而不同;

如果不确定影响的范围，或者范围过大，可以考虑不写scope

对于type为 fix 的 提交，可以考虑scope 为redmine上的问题编号

