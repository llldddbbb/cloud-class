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
