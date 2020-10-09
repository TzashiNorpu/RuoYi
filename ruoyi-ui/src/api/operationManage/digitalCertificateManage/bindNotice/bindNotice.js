import request from '@/utils/request'


// 新增【请填写功能名称】
export function addTest(data) {
  return request({
    url: '/operation/bindNotice',
    method: 'post',
    data: data
  })
}
