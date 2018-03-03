<template>
  <!--v-cloak解决刷新闪烁-->
  <div v-cloak>
    <!--main开始-->
    <div class="layout layout-margin-top layout-fullscreen">
      <!--轮播开始-->
      <div class="carousel slide" id="carousel-generic" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#carousel-generic" data-slide-to="0" class="active"></li>
          <li data-target="#carousel-generic" data-slide-to="1"></li>
        </ol>
        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img src="../../assets/images/home_banner.png">
            <div class="carousel-caption carousel-intro">
              <div>专业的IT在线学习平台</div>
              <p>随时随地，想学就学</p>
              <a class="home-courses-btn" href="courses.html">开始学习</a>
            </div>
          </div>
          <div class="item">
            <a href="https://www.shiyanlou.comcontests.htmllou6" target="_blank">
              <img src="../../assets/images/home_banner_2.jpg">
            </a>
          </div>
        </div>
        <a class="left carousel-control" href="#carousel-generic" role="button" data-slide="prev">
          <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
          <span class="sr-only">上一个</span>
        </a>
        <a class="right carousel-control" href="#carousel-generic" role="button" data-slide="next">
          <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
          <span class="sr-only">下一个</span>
        </a>
      </div>
      <!--轮播结束-->
      <!--课程开始-->
      <div class="home-section recommend-courses">
        <div class="container">
          <div class="home-section-header">
            <div class="home-section-title">实战课程</div>
            <div class="home-section-desc">300+ 门高质量学习课程，让你的IT技能迅速提升</div>
            <div class="home-section-tabs">
              <ul class="nav nav-tabs">
                <li><a href="#boutique-course" data-toggle="tab">精品课程</a></li>
                <li class="active"><a href="#recent-course" style="margin: 0 60px" data-toggle="tab">最新课程</a></li>
                <li><a href="#hot-course" data-toggle="tab">热门课程</a></li>
              </ul>
            </div>
          </div>
          <div class="tab-content">
            <!--精品课程-->
            <div class="tab-pane fade" id="boutique-course">
              <div class="row">
                <div class="col-md-3" v-for="boutiqueCourse in boutiqueCourseList">
                  <a class="recommend-courses-item" href="courses.html1">
                    <img :src="boutiqueCourse.coverImage" :alt="boutiqueCourse.title">
                    <div class="recommend-courses-content">
                      <div class="recommend-courses-name">{{boutiqueCourse.title}}</div>
                      <div class="recommend-courses-desc">{{boutiqueCourse.description}}</div>
                      <div class="recommend-courses-users">
                        <i class="fa fa-users"></i>{{boutiqueCourse.pageView}}
                      </div>
                    </div>
                  </a>
                </div>
              </div>
              <div class="home-section-footer recommend-courses-footer">
                <a href="courses.html">查看全部</a>
              </div>
            </div>
            <!--最近课程-->
            <div class="tab-pane fade in active" id="recent-course">
              <div class="row">
                <div class="col-md-3" v-for="recentCourse in recentCourseList">
                  <a class="recommend-courses-item" href="#/course/detail">
                    <img :src="recentCourse.coverImage" :alt="recentCourse.title">
                    <div class="recommend-courses-content">
                      <div class="recommend-courses-name">{{recentCourse.title}}</div>
                      <div class="recommend-courses-desc">{{recentCourse.description}}</div>
                      <div class="recommend-courses-users">
                        <i class="fa fa-users"></i>{{recentCourse.pageView}}
                      </div>
                    </div>
                  </a>
                </div>
              </div>
              <div class="home-section-footer recommend-courses-footer">
                <a href="courses.html">查看全部</a>
              </div>
            </div>
            <!--热门课程-->
            <div class="tab-pane fade" id="hot-course">
              <div class="row">
                <div class="col-md-3" v-for="hotCourse in hotCourseList">
                  <a class="recommend-courses-item" href="courses.html1">
                    <img :src="hotCourse.coverImage" :alt="hotCourse.title">
                    <div class="recommend-courses-content">
                      <div class="recommend-courses-name">{{hotCourse.title}}</div>
                      <div class="recommend-courses-desc">{{hotCourse.description}}</div>
                      <div class="recommend-courses-users">
                        <i class="fa fa-users"></i>{{hotCourse.pageView}}
                      </div>
                    </div>
                  </a>
                </div>
              </div>
              <div class="home-section-footer recommend-courses-footer">
                <a href="courses.html">查看全部</a>
              </div>
            </div>
          </div>
        </div>
      </div>
      <!--课程结束-->

      <!--路径开始-->
      <div class="home-section learn-path">
        <div class="container">
          <div class="home-section-header">
            <div class="home-section-title">学习路径</div>
            <div class="home-section-desc">12条完整的职业学习路线图，带你从入门到进阶</div>
          </div>
          <div class="row learn-path-body">
            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlnewhand">
                <img src="../../assets/images/1487741005890.png">
                <div class="learn-path-name">新手入门</div>
                <div class="learn-path-courses">
                  6门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlpython">
                <img src="../../assets/images/1487741028787.png">
                <div class="learn-path-name">Python研发工程师</div>
                <div class="learn-path-courses">
                  77门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlcpp">
                <img src="../../assets/images/1487741048998.png">
                <div class="learn-path-name">C++ 研发工程师</div>
                <div class="learn-path-courses">
                  27门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlbigdata">
                <img src="../../assets/images/1487741070013.png">
                <div class="learn-path-name">大数据工程师</div>
                <div class="learn-path-courses">
                  33门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlsecurity">
                <img src="../../assets/images/1487738666016.png">
                <div class="learn-path-name">信息安全工程师</div>
                <div class="learn-path-courses">
                  35门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmllinuxsys">
                <img src="../../assets/images/1487741143862.png">
                <div class="learn-path-name">Linux运维工程师</div>
                <div class="learn-path-courses">
                  33门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmljava">
                <img src="../../assets/images/1487741175055.png">
                <div class="learn-path-name">Java研发工程师</div>
                <div class="learn-path-courses">
                  24门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlphp">
                <img src="../../assets/images/1487741188918.png">
                <div class="learn-path-name">PHP研发工程师</div>
                <div class="learn-path-courses">
                  32门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlweb">
                <img src="../../assets/images/1487741210305.png">
                <div class="learn-path-name">Web前端工程师</div>
                <div class="learn-path-courses">
                  30门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmllinuxdev">
                <img src="../../assets/images/1487741227106.png">
                <div class="learn-path-name">Linux研发工程师</div>
                <div class="learn-path-courses">
                  26门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlnodejs">
                <img src="../../assets/images/1487738611078.png">
                <div class="learn-path-name">NodeJS研发工程师</div>
                <div class="learn-path-courses">
                  16门课程
                </div>
              </a>
            </div>

            <div class="col-sm-3">
              <a class="learn-path-item" href="paths.htmlmongodb">
                <img src="../../assets/images/1487741270557.png">
                <div class="learn-path-name">MongoDB工程师</div>
                <div class="learn-path-courses">
                  6门课程
                </div>
              </a>
            </div>

          </div>
          <div class="home-section-footer">
            <a href="paths.html">查看全部</a>
          </div>
        </div>
      </div>
      <!--路径结束-->

      <div class="home-features">
        <div class="container">
          <div class="row">
            <div class="col-sm-3">
              <a><img src="../../assets/images/introducecontainer1.gif"></a>
              <div class="home-features-text">丰富全面的计算机实验课程</div>
            </div>
            <div class="col-sm-3">
              <a><img src="../../assets/images/introducecontainer2.gif"></a>
              <div class="home-features-text">在线编程环境，1秒启动</div>
            </div>
            <div class="col-sm-3">
              <a><img src="../../assets/images/introducecontainer3.gif"/></a>
              <div class="home-features-text">每天一个项目课，丰富你的项目经验</div>
            </div>
            <div class="col-sm-3">
              <a><img src="../../assets/images/introducecontainer4.gif"/></a>
              <div class="home-features-text">有效学习时间，真实记录你的代码生涯</div>
            </div>
          </div>
          <div class="home-section-footer home-features-footer">
            <a class="home-courses-btn" href="courses.html">开始学习</a>
          </div>
        </div>
      </div>

    </div>
    <!--main结束-->
    <!--登陆注册模块开始-->
    <login-or-register></login-or-register>
    <!--登陆注册模块结束-->
  </div>
</template>

<script>
import LoginOrRegister from '../../components/login/login-or-register'
import API from '@/api'

export default {
  name: 'index',
  components: {
    LoginOrRegister
  },
  data () {
    return {
      recentCourseList: [],
      boutiqueCourseList: [],
      hotCourseList: []
    }
  },
  methods: {
    getRecentCourseList () {
      API.course.getRecentCourseList().then(({data}) => {
        if (data && data.code === 200) {
          this.recentCourseList = data.recentCourseList
        }
      })
    },
    getBoutiqueCourseList () {
      API.course.getBoutiqueCourseList().then(({data}) => {
        if (data && data.code === 200) {
          this.boutiqueCourseList = data.boutiqueCourseList
        }
      })
    },
    getHotCourseList () {
      API.course.getHotCourseList().then(({data}) => {
        if (data && data.code === 200) {
          this.hotCourseList = data.hotCourseList
        }
      })
    }
  },
  created () {
    this.getRecentCourseList()
    this.getBoutiqueCourseList()
    this.getHotCourseList()
  }
}
</script>
