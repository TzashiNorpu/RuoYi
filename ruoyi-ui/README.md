## 开发

```bash
# 克隆项目
git clone https://gitee.com/y_project/RuoYi-Vue

# 进入项目目录
cd ruoyi-ui

# 安装依赖
npm install

# 建议不要直接使用 cnpm 安装依赖，会有各种诡异的 bug。可以通过如下操作解决 npm 下载速度慢的问题
npm install --registry=https://registry.npm.taobao.org

# 启动服务
npm run dev
```

浏览器访问 http://localhost:80

## 发布

```bash
# 构建测试环境
npm run build:stage

# 构建生产环境
npm run build:prod
```

### My Ref
-  src\router\index.js 中的配置
```
path: '',
component: Layout,
redirect: 'index'
```
将 localhost 的路径映射到 src\views\index.vue 组件上
- 在 src\permission.js 文件中用 导航守卫 router.beforeEach 对这些路径做了处理：next(`/login?redirect=${to.fullPath}`) // 否则全部重定向到登录页
    - 如输入 http://localhost 在 src\router\index.js 中的配置应该是重定向至 http://localhost/index ,然后由导航守卫修改至  http://localhost/login?redirect=%2Findex ，其中 %2F 是 http://localhost/index 中 /index 中的 '/' 符号
- 在 src\main.js 文件中将 src\permission.js 引入