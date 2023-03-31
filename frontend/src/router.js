
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import EmployeeManagementManager from "./components/listers/EmployeeManagementCards"
import EmployeeManagementDetail from "./components/listers/EmployeeManagementDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/employeeManagements',
                name: 'EmployeeManagementManager',
                component: EmployeeManagementManager
            },
            {
                path: '/employeeManagements/:id',
                name: 'EmployeeManagementDetail',
                component: EmployeeManagementDetail
            },



    ]
})
