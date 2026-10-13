# Git 历史重建记录

日期：2026-10-13。

在源项目重建独立发布历史，统一使用当前 Git 身份。导入提交不代表上游代码由当前作者独立开发；原作者及详细文件变化见 [八次改动记录](git-soft-reset-20261013.md)。

基础初始化提交：`ceca5acc34da527fe494ac4fc431efb533046997`，基线为 `4f8c2ee52095bb29ea2a2dc92f7cdd1a10be6203`。

| 原提交 | 新提交 | 原作者 | 新标题 |
| --- | --- | --- | --- |
| `96c528d0` | `b54f8494` | ding.ma <machen@apache.org> | 添加 Langfuse 本地部署配置 |
| `177108bb` | `ebe8e17d` | ding.ma <machen@apache.org> | 完善 Agent 链路追踪与执行时间线 |
| `27366d12` | `45d57373` | ding.ma <machen@apache.org> | 接入 DeepSeek 模型服务 |
| `745d8bbd` | `f993c9ba` | ding.ma <machen@apache.org> | 调整不同执行模式下的 MCP 工具调用 |
| `ca93991a` | `6a7873fe` | Wu Shuwen <mikewushuwen@outlook.com> | 修复初始化模板换行与校验问题 |
| `c0704ad6` | `de195389` | ding.ma <machen@apache.org> | 合并初始化模板换行规则修复 |
| `b0f27491` | `79ac404f` | ding.ma <machen@apache.org> | 修复 RocketMQ 事务回查消息转换 |
| `0f4c20bf` | `cf5772d1` | ding.ma <machen@apache.org> | 更新项目介绍与架构图 |

最后追加“完善敏感配置隔离”，包括环境变量配置、忽略规则、示例文件、安全说明、企智通 README 和本地启动说明。

完整旧历史、补丁和本地新文件已保存到仓库外的 `D:\RAGENT\git-backups\20261013`。此备份不进入发布历史。

新历史包含一次初始化、原来八次分别重建的提交及一次安全配置提交，共十次。原合并提交保留两个父提交，未将它替换为空提交。

当前工作区文件保留；`.claude/` 和 `frontend/.env` 从所有新提交中排除。移除旧分支、标签及上游跟踪引用，避免推送旧历史。

远端主分支尚未替换。推送需要审阅新历史并核对远端 HEAD，采用明确的 force-with-lease 条件。
