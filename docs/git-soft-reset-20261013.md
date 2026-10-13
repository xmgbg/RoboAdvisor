# 源项目最近八次 Git 提交与软回退记录

> 本文保留原始软回退操作及上游改动来源。后续已按用户要求重建独立发布历史，旧备份分支移出当前仓库；完整历史保存在仓库外的 `D:\RAGENT\git-backups\20261013\original-history.bundle`。下文恢复分支命令仅适用于重建前状态，新旧提交对应关系见 [历史重建记录](git-history-rebuild.md)。

记录日期：2026-10-13。
仓库：`D:\RAGENT\ragent`。
回退前 HEAD：`0f4c20bf492e3b9f965ffdfc65b6020745ce2f78`。
软回退目标：`4f8c2ee52095bb29ea2a2dc92f7cdd1a10be6203`。
备份分支：`backup/before-soft-reset-8-20261013`。

范围按最近八条提交记录确定，包含合并提交，不使用 HEAD~8；该目标到原 HEAD 的历史范围正好包含八个提交。
软回退保持原索引和文件内容，提交差异保留在暂存区；回退前已有的 README、忽略规则等本地修改继续保持原来的未暂存状态。

## 每次提交

### 1. 0f4c20bf · docs(readme): 更新 README 以反映 Agentic RAG 项目架构和细节

完整提交：`0f4c20bf492e3b9f965ffdfc65b6020745ce2f78`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-13T16:17:52+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-13T16:17:52+08:00<br>
父提交：b0f27491476a78b718e1ff893fc51cac0eefcb60

原始改动文案：

```text
docs(readme): 更新 README 以反映 Agentic RAG 项目架构和细节

- 替换框架图和模块分层图，展示最新模块和架构优化
- 增加 Agentic RAG 项目定位，突出智能体执行引擎和多技能支持
- 修正模块职责表，调整模块名称和描述，更加清晰准确
- 详细介绍 v1 与 v2 两套提问链路及 Agentic 架构设计理念
- 丰富项目质量章节，增加代码规模、工程质量、可扩展性和生产级特性
- 扩展设计模式说明，补充中间件、适配器和状态机应用场景
- 更新控制台描述，强调 React 控制台的完整功能和用户角色支持
- 对比市面同类项目，突出 Agentic RAG 的智能体功能和工程深度
- 补充学习收益，强调 Agent 智能体实战及全链路能力覆盖
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	README.md
A	assets/ragent-chain-v4.png
A	assets/ragent-framework-v2.png
A	assets/ragent-module-layering-v3.png
```

### 2. b0f27491 · fix(mq): 修复事务消息回查时消息体类型转换异常

完整提交：`b0f27491476a78b718e1ff893fc51cac0eefcb60`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-13T13:17:01+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-13T13:17:01+08:00<br>
父提交：c0704ad6b6cb227163fc54c3c3a70043a7b09052

原始改动文案：

```text
fix(mq): 修复事务消息回查时消息体类型转换异常
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	framework/src/main/java/com/nageoffer/ai/ragent/framework/mq/producer/DelegatingTransactionListener.java
M	framework/src/main/java/com/nageoffer/ai/ragent/framework/mq/producer/TransactionChecker.java
A	framework/src/test/java/com/nageoffer/ai/ragent/framework/mq/producer/DelegatingTransactionListenerTest.java
M	rag/src/main/java/com/nageoffer/ai/ragent/knowledge/mq/KnowledgeBaseCleanupTransactionChecker.java
M	rag/src/main/java/com/nageoffer/ai/ragent/knowledge/mq/KnowledgeDocumentChunkTransactionChecker.java
```

### 3. c0704ad6 · Merge remote-tracking branch 'origin/main'

完整提交：`c0704ad6b6cb227163fc54c3c3a70043a7b09052`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-13T00:30:38+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-13T00:30:38+08:00<br>
父提交：745d8bbdbeca71ffc926531579b7dbf16e38d69f ca93991abe4ffd838e48d600d7ada24e010a884f

原始改动文案：

```text
Merge remote-tracking branch 'origin/main'
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	.gitattributes
```

### 4. 745d8bbd · refactor(retrieval): 根据编排模式控制MCP工具执行行为

完整提交：`745d8bbdbeca71ffc926531579b7dbf16e38d69f`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-13T00:19:57+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-13T00:19:57+08:00<br>
父提交：27366d12fe19c59bee43d51fee83039ca2f21363

原始改动文案：

```text
refactor(retrieval): 根据编排模式控制MCP工具执行行为

- 引入OrchestrationProperties配置，根据WORKFLOW模式执行MCP工具调用
- 在AGENT模式下跳过MCP工具执行，避免不必要的调用
- 调用远程工具时传递用户身份信息，保证调用链上下文完整
- 新增单元测试验证不同编排模式下MCP工具调用逻辑的差异
- 重构RetrievalEngine构造器支持注入编排相关配置
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	rag/src/main/java/com/nageoffer/ai/ragent/rag/core/retrieval/RetrievalEngine.java
M	rag/src/test/java/com/nageoffer/ai/ragent/rag/core/retrieval/RetrievalEngineTest.java
```

### 5. ca93991a · fix(initializer): 禁止模板数据的 EOL 转换，修复 Windows 检出 checksum 失配 (#130)

完整提交：`ca93991abe4ffd838e48d600d7ada24e010a884f`。

作者：Wu Shuwen <mikewushuwen@outlook.com><br>
作者时间：2026-09-11T09:33:44+08:00<br>
提交者：GitHub <noreply@github.com><br>
提交时间：2026-09-11T09:33:44+08:00<br>
父提交：27366d12fe19c59bee43d51fee83039ca2f21363

原始改动文案：

```text
fix(initializer): 禁止模板数据的 EOL 转换，修复 Windows 检出 checksum 失配 (#130)

checksums.sha256 逐字节校验 docs/intents/prompts/skills 等模板文件，而 core.autocrlf
（Git for Windows 默认 true）会把检出内容转成 CRLF，导致 InitializeMain / PreflightMain /
ValidateDatasetMain 的预检以「文件 checksum 不一致」失败，且在 Windows 上无法完成初始化。

/resources/initializer/enterprise-knowledge-base/** 标记为 -text，使检出字节与生成基线时
的字节一致；只影响该目录，不改变其他路径的既有 EOL 规则。

Co-authored-by: Claude Code <noreply@anthropic.com>
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	.gitattributes
```

### 6. 27366d12 · feat(deepseek): 新增 DeepSeek 供应商支持及相关测试覆盖

完整提交：`27366d12fe19c59bee43d51fee83039ca2f21363`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-11T08:34:51+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-11T08:34:51+08:00<br>
父提交：177108bb51607bbd54d915040aac835983be3329

原始改动文案：

```text
feat(deepseek): 新增 DeepSeek 供应商支持及相关测试覆盖

- 新增 DeepSeekChatClient 实现，兼容其 thinking 对象方言
- 修改 AgentEngineConfiguration，支持根据供应商设置 DeepSeekFormatter
- 更新配置文件，替换 siliconflow 为 deepseek 并更新模型及端点信息
- 扩展 ModelProvider 枚举，新增 DEEP_SEEK 标识
- 完善深度思考功能的单元测试，覆盖 DeepSeek thinking 对象和开关逻辑
- 调整测试以确保非 DeepSeek 供应商不携带 thinking 对象字段
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/config/AgentEngineConfiguration.java
M	bootstrap/src/main/resources/application.yaml
A	infra-ai/src/main/java/com/nageoffer/ai/ragent/infra/chat/DeepSeekChatClient.java
M	infra-ai/src/main/java/com/nageoffer/ai/ragent/infra/enums/ModelProvider.java
M	infra-ai/src/test/java/com/nageoffer/ai/ragent/infra/chat/ChatRequestThinkingParamTest.java
```

### 7. 177108bb · feat(agent): 接入 LangFuse 链路追踪并完善 ReAct 执行时间线

完整提交：`177108bb51607bbd54d915040aac835983be3329`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-10T23:44:20+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-10T23:44:20+08:00<br>
父提交：96c528d0781e37a699c1a927847949d7f0411d50

原始改动文案：

```text
feat(agent): 接入 LangFuse 链路追踪并完善 ReAct 执行时间线

- 基于 OpenTelemetry 采集 Agent、模型调用和工具执行链路
- 统一工具批次、执行状态及服务端耗时并支持落库
- 扩展 SSE 与前端时间线以展示并行批次、状态和耗时
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
M	agent/pom.xml
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/config/ReActAgentProvider.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/controller/vo/AgentMessageVO.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/dao/entity/AgentMessageDO.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/dto/AgentBlock.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/dto/AgentCompletionPayload.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/dto/AgentConfirmPayload.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/dto/AgentTextBlockSeal.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/dto/AgentToolProgress.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/enums/AgentSSEEventType.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/enums/AgentToolStatus.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/memory/AgentContextChars.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/service/AgentConversationService.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/service/handler/AgentRunHandle.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/service/handler/AgentStreamEventBridge.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/service/impl/AgentChatServiceImpl.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/service/impl/AgentConversationServiceImpl.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/skill/SkillLoadTool.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/tool/AgentToolBatchMiddleware.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/tool/AgentToolExecutionFacts.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/tool/KnowledgeSearchTool.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/tool/McpToolBridge.java
M	agent/src/main/java/com/nageoffer/ai/ragent/agent/tool/MemoryFlushTool.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentErrorTypes.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentRunTracer.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentToolBodyTracer.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceAttributes.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceContextKeys.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceEnrichmentMiddleware.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceProperties.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceSerializer.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/AgentTracingConfiguration.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/GenAiAttributes.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/README.md
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/RagentAttributes.java
A	agent/src/main/java/com/nageoffer/ai/ragent/agent/trace/RagentOtelTracingMiddleware.java
M	agent/src/test/java/com/nageoffer/ai/ragent/agent/config/ReActAgentProviderTest.java
M	agent/src/test/java/com/nageoffer/ai/ragent/agent/service/handler/AgentRunHandleTest.java
M	agent/src/test/java/com/nageoffer/ai/ragent/agent/service/handler/AgentStreamEventBridgeTest.java
M	agent/src/test/java/com/nageoffer/ai/ragent/agent/service/impl/AgentChatServiceImplTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/tool/AgentToolExecutionFactsTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentRunTracerTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentToolBodyTracerCoverageTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentToolBodyTracerTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceEnrichmentMiddlewareTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceExporterLoggingTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceScenarioTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentTraceSerializerTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/AgentTracingConfigurationTest.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/CollectingSpanExporter.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/LangfuseReadbackProbe.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/MutableClock.java
A	agent/src/test/java/com/nageoffer/ai/ragent/agent/trace/RagentOtelTracingMiddlewareTest.java
M	bootstrap/pom.xml
M	bootstrap/src/main/resources/application.yaml
M	frontend/harness/main.tsx
M	frontend/src/components/agent/AgentMessageList.tsx
M	frontend/src/components/agent/AgentTurn.tsx
M	frontend/src/components/agent/AgentWelcomeScreen.tsx
M	frontend/src/hooks/useAgentStream.ts
A	frontend/src/lib/agentTimeline.ts
M	frontend/src/services/agentService.ts
M	frontend/src/stores/agentChatStore.ts
M	frontend/src/styles/globals.css
M	frontend/src/types/agent.ts
A	frontend/tests/agent-timeline.check.mjs
A	frontend/tests/tsconfig.timeline.json
M	pom.xml
M	resources/database/schema_pg.sql
A	resources/database/upgrades/v2.0.0/260909_agent_run_duration.sql
```

### 8. 96c528d0 · chore(docker): 添加 LangFuse v4 本机自托管编排文件及说明文档

完整提交：`96c528d0781e37a699c1a927847949d7f0411d50`。

作者：ding.ma <machen@apache.org><br>
作者时间：2026-09-10T21:36:54+08:00<br>
提交者：ding.ma <machen@apache.org><br>
提交时间：2026-09-10T21:36:54+08:00<br>
父提交：4f8c2ee52095bb29ea2a2dc92f7cdd1a10be6203

原始改动文案：

```text
chore(docker): 添加 LangFuse v4 本机自托管编排文件及说明文档

- 新增 langfuse-stack-v4.compose.yaml，自托管版配置只映射 3000 端口
- 删除所有其他容器对宿主机端口的映射，避免端口冲突
- 配置明文默认密钥及环境变量，适合本机排查使用，禁用遥测
- 各容器内存资源限制明确，保障资源合理分配
- 新增详细 README 介绍启动流程、组件说明及已知限制和注意事项
- 说明 UI 多模态附件预览不可用及批量导出受限的原因
- 提供替换 minio 镜像的方案以防拉取失败
- 介绍应用接入环境变量配置示例及调试方式
- 提示容器健康检查配置及数据清理指令
```

改动文件（合并提交相对第一父提交；A=新增、M=修改、D=删除）：

```text
A	resources/docker/langfuse/README.md
A	resources/docker/langfuse/langfuse-stack-v4.compose.yaml
```

## 回退与恢复

执行命令：

```powershell
git branch backup/before-soft-reset-8-20261013 0f4c20bf492e3b9f965ffdfc65b6020745ce2f78
git reset --soft 4f8c2ee52095bb29ea2a2dc92f7cdd1a10be6203
```

恢复前先确认后续新改动已经保存，恢复原 HEAD 可执行：

```powershell
git reset --soft backup/before-soft-reset-8-20261013
```

本次没有推送，没有更改远端地址，没有取消暂存，也没有修改原文件内容。

后续提交文案约定：中文主要改动标题，空行，编号详细说明；不加 feat/fix/docs 前缀，编号数量按实际改动。
