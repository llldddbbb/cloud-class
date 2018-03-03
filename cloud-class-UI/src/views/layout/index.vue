<template>
  <div>
    <!--导航开始-->
    <nav-menu></nav-menu>
    <!--导航结束-->
    <router-view></router-view>
    <!--尾部开始-->
    <footer-side></footer-side>
    <!--尾部结束-->
  </div>
</template>

<script>
import NavMenu from './nav-menu'
import FooterSide from './footer-side'
export default {
  name: 'index',
  components: {
    NavMenu,
    FooterSide
  }
}
</script>

<style scoped>

</style>
