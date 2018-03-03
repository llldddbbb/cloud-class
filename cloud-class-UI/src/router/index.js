import Vue from 'vue'
import Router from 'vue-router'
Vue.use(Router)

// 开发环境不使用懒加载, 因为懒加载页面太多的话会造成webpack热更新太慢, 所以只有正式环境使用懒加载
const _import = require('./import-' + process.env.NODE_ENV)

export default new Router({
  mode: 'hash',
  routes: [
    {
      path: '/',
      component: _import('layout/index'),
      name: 'layout',
      redirect: { name: 'home' },
      desc: '上下布局',
      children: [
        { path: '/home', component: _import('home/index'), name: 'home', desc: '首页' },
        { path: '/course', component: _import('course/index'), name: 'home', desc: '课程详情页' }
      ]
    }
  ]
})
