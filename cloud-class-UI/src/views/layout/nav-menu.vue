<template>
  <div>
    <nav class="navbar navbar-default navbar-fixed-top home-header">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                  data-target="#header-navbar-collapse" aria-expanded="false">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="/">
            <img src="/static/images/logo_02.png">
          </a>
        </div>
        <div class="collapse navbar-collapse" id="header-navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="dropdown">
              <a href="javascript:void(0);" class="dropdown-toggle" data-toggle="dropdown">课程 <span
                class="caret"></span></a>
              <ul class="dropdown-menu">
                <li><a href="courses.html">全部课程</a></li>
                <li><a href="bootcamp.html">免费课程</a></li>
                <li><a href="paths.html">学习路径</a></li>
              </ul>
            </li>
            <li><a href="contests.html">手记</a></li>
            <li><a href="questions.html">问答</a></li>
            <li><a href="vip.html">会员</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right header-sign">
            <li><a class="sign-in" href="#sign-modal" data-toggle="modal">登录</a></li>
            <li><a class="sign-up" href="#sign-modal" data-toggle="modal">注册</a></li>
          </ul>
          <form action="/search" class="navbar-form navbar-right">
            <div class="form-group"><label><i class="fa fa-search"></i></label>
              <input type="text" name="search" autocomplete="off" placeholder="搜索 课程/问答" class="form-control">
            </div>
          </form>
        </div>
      </div>
    </nav>
  </div>
</template>

<script>
export default {
  name: 'nav-menu'
}
</script>
