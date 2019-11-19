import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import router from './router'
import echarts from "echarts";

Vue.config.productionTip = false

Vue.use(ElementUI, {
  size: 'small'
});

// 全局引入echarts
Vue.prototype.$echarts = echarts;

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

