<template>
  <!--登陆注册模块开始-->
  <div class="modal fade" id="sign-modal" tabindex="-1" role="dialog">
    <div class="modal-dialog modal-sm" role="document">
      <div class="modal-content">
        <button type="button" class="close-modal" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
        </button>
        <div class="modal-body">
          <ul class="nav nav-tabs" role="tablist">
            <li role="presentation" class="active">
              <a href="#signin-form" aria-controls="signin-form" role="tab" data-toggle="tab">登录</a>
            </li>
            <li role="presentation">
              <a href="#signup-form" aria-controls="signup-form" role="tab" data-toggle="tab">注册</a>
            </li>
          </ul>
          <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="signin-form">
              <form action="/login" method="post">
                <input name="_csrf_token" type=hidden
                       value="1493606193##8bd4ea6d5e6c5d3822a330cce83cce0a3c5d38b6">
                <div class="form-group">
                  <div class="input-group">
                    <div class="input-group-addon">
                      <i class="fa fa-envelope" style="margin:0;"></i>
                    </div>
                    <input type="email" name="login" class="form-control" placeholder="请输入邮箱">
                  </div>
                </div>
                <div class="form-group">
                  <div class="input-group">
                    <div class="input-group-addon">
                      <i class="fa fa-lock" style="margin:0;"></i>
                    </div>
                    <input type="password" name="password" class="form-control" placeholder="请输入密码">
                  </div>
                </div>
                <div class="form-inline verify-code-item" style="display:none;">
                  <div class="form-group">
                    <div class="input-group">
                      <input type="text" name="captcha_v" class="form-control" placeholder="请输入验证码">
                    </div>
                  </div>
                  <img class="verify-code" src="" source="/captcha.gif">
                </div>
                <div class="form-group remember-login">
                  <input name="remember" type="checkbox" value="y"> 下次自动登录
                  <a class="pull-right" href="/reset_password">忘记密码？</a>
                </div>
                <div class="form-group">
                  <input class="btn btn-primary" name="submit" type="submit" value="进入实验楼">
                </div>
                <div class="form-group widget-signin">
                  <span>快速登录</span>
                  <a href="/auth/qq?next="><i class="fa fa-qq"></i></a>
                  <a href="/auth/weibo?next="><i class="fa fa-weibo"></i></a>
                  <a href="/auth/weixin?next="><i class="fa fa-weixin"></i></a>
                  <a href="/auth/github?next="><i class="fa fa-github"></i></a>
                  <a href="/auth/renren?next="><i class="fa fa-renren"></i></a>
                </div>
                <div class="form-group error-msg">
                  <div class="alert alert-danger" role="alert"></div>
                </div>
              </form>
            </div>
            <div role="tabpanel" class="tab-pane" id="signup-form">
              <form action="/register" method="post">
                <input name="_csrf_token" type=hidden
                       value="1493606193##8bd4ea6d5e6c5d3822a330cce83cce0a3c5d38b6">
                <div class="form-group">
                  <div class="input-group">
                    <div class="input-group-addon">
                      <i class="fa fa-envelope" style="margin:0;"></i>
                    </div>
                    <input type="email" name="email" class="form-control" placeholder="请输入邮箱">
                  </div>
                </div>
                <div class="form-group">
                  <div class="input-group">
                    <div class="input-group-addon">
                      <i class="fa fa-lock" style="margin:0;"></i>
                    </div>
                    <input type="password" name="password" class="form-control" placeholder="请输入密码">
                  </div>
                </div>
                <div class="form-inline">
                  <div class="form-group">
                    <div class="input-group">
                      <input type="text" name="captcha_v" class="form-control" placeholder="请输入验证码">
                    </div>
                  </div>
                  <img class="verify-code" src="" source="/captcha.gif">
                </div>
                <div class="form-group">
                  <input class="btn btn-primary" name="submit" type="submit" value="注册">
                </div>
                <div class="form-group agree-privacy">
                  注册表示您已经同意我们的<a href="privacy.html" target="_blank">隐私条款</a>
                </div>
                <div class="form-group widget-signup">
                  <span>快速注册</span>
                  <a href="/auth/qq?next="><i class="fa fa-qq"></i></a>
                  <a href="/auth/weibo?next="><i class="fa fa-weibo"></i></a>
                  <a href="/auth/weixin?next="><i class="fa fa-weixin"></i></a>
                  <a href="/auth/github?next="><i class="fa fa-github"></i></a>
                  <a href="/auth/renren?next="><i class="fa fa-renren"></i></a>
                </div>
                <div class="form-group error-msg">
                  <div class="alert alert-danger" role="alert"></div>
                </div>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--登陆注册模块结束-->
</template>

<script>
export default {
  name: 'login-or-register'
}
</script>
