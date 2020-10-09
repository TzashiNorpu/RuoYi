import request from '@/utils/request'


// 证书绑定通知
export function certificateBindNotice(data) {
  return request({
    url: '/operationManage/bindNotice',
    method: 'post',
    data: data
  })
}
