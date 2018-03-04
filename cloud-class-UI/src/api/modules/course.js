import request from '../request'
import requestUrl from '../requestUrl'

// 获取最近课程列表
export function getRecentCourseList () {
  return request({
    url: requestUrl('course/recent'),
    method: 'get'
  })
}
// 获取精品课程列表
export function getBoutiqueCourseList () {
  return request({
    url: requestUrl('course/boutique'),
    method: 'get'
  })
}
// 获取热门课程列表
export function getHotCourseList () {
  return request({
    url: requestUrl('course/hot'),
    method: 'get'
  })
}
// 根据Id获取课程详情
export function getCourseDetailById (courseId) {
  return request({
    url: requestUrl('course/' + courseId),
    method: 'get'
  })
}

// 根据CourseId获取课程评论
export function listCommentByCourseId (courseId) {
  return request({
    url: requestUrl('course/' + courseId + '/comment'),
    method: 'get'
  })
}

// 根据CourseId获取视频列表
export function listVideoByCourseId (courseId) {
  return request({
    url: requestUrl('course/' + courseId + '/video'),
    method: 'get'
  })
}
