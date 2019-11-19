import Vue from 'vue';
import Router from 'vue-router';


const Home = () => import('../components/common/Home.vue')
const dashboard = () => import("../components/page/Dashboard.vue")
const logging = () => import("../components/page/logging.vue")
const setting = () => import("../components/page/setting.vue")
const userManager = () => import("../components/page/userManager.vue")
const menuManager = () => import("../components/page/menuManager.vue")

Vue.use(Router);

const routes = [
    {path: '/', redirect: '/dashboard'},
    {
        path: '/',
        component: Home,
        meta: { title: '自述文件' },
        children: [
            {
                path: '/dashboard',
                component: dashboard,
                meta: { title: '系统首页' }
            },
            {
                path: '/logging',
                component: logging,
                meta: { title: '实时日志' }
            },
            {
                path: '/setting',
                component: setting,
                meta: { title: '系统设置' }
            },
            {
                path: '/userManager',
                component: userManager,
                meta: {title: '用户管理'}
            },
            {
                path: '/menuManager',
                component: menuManager,
                meta: { title: '菜单管理' }
            },
        ]
    }

]

export default new Router({
    mode: 'history',
    routes: routes
})
