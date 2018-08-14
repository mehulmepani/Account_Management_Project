import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import addAccounts from '@/components/addAccounts'
import showAccounts from '@/components/showAccounts'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/addAccounts',
      name: 'addAccounts',
      component: addAccounts
    },
    {
      path: '/showAccounts',
      name: 'showAccounts',
      component: showAccounts
    }
  ]
})
