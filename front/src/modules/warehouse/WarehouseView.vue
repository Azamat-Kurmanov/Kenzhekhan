<template>
  <div>
    <h1>{{ msg }}</h1>
    <h1>{{ greetings }}</h1>
  </div>
</template>

<script>
  export default {
    name: 'WarehouseView',
    props: {
      msg: String
    },
    data() {
      return {
        greetings: 'Hello, Azamat'
      };
    }
  }
  // async mounted() {
  //
  // },
  // methods: {
  //
  // },
  // created(){
  //
  // },
  // computed:{
  //
  // },
  // watch:{
  //
  // }
</script>

<style scoped>

</style>