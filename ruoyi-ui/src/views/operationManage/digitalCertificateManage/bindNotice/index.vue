<template>
  <div>
    <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">
      <el-form-item label="绑定通知" prop="field101">
        <el-select v-model="formData.field101" placeholder="请选择下拉选择" clearable :style="{width: '100%'}">
          <el-option v-for="(item, index) in field101Options" :key="index" :label="item.label"
            :value="item.value" :disabled="item.disabled"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item size="large">
        <el-button type="primary" @click="submitForm">提交</el-button>
        <el-button @click="resetForm">重置</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
import { certificateBindNotice } from "@/api/operationManage/digitalCertificateManage/bindNotice/bindNotice";
export default {
  name: "BindNotice",
  components: {},
  props: [],
  data() {
    return {
      formData: {
        field101: 1,
      },
      rules: {
        field101: [{
          required: true,
          message: '请选择下拉选择',
          trigger: 'change'
        }],
      },
      field101Options: [{
        "label": "绑定",
        "value": 1
      }, {
        "label": "撤销",
        "value": 2
      }],
    }
  },
  computed: {},
  watch: {},
  created() {},
  mounted() {},
  methods: {
    submitForm() {
      this.$refs['elForm'].validate(valid => {
        if (!valid) return
        // TODO 提交表单
        certificateBindNotice(this.formData.field101);
        console.warn(this.formData.field101);
      })
    },
    resetForm() {
      this.$refs['elForm'].resetFields()
    },
  }
}

</script>
<style>
</style>
