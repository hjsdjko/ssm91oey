(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/shangpinxinxi/add-or-update"],{"1d8b":function(n,e,i){"use strict";i.d(e,"b",(function(){return r})),i.d(e,"c",(function(){return a})),i.d(e,"a",(function(){return t}));var t={wPicker:function(){return Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(i.bind(null,"c2cb"))}},r=function(){var n=this,e=n.$createElement;n._self._c},a=[]},"6eaf":function(n,e,i){"use strict";i.r(e);var t=i("1d8b"),r=i("ba21");for(var a in r)"default"!==a&&function(n){i.d(e,n,(function(){return r[n]}))}(a);i("a863");var u,o=i("f0c5"),s=Object(o["a"])(r["default"],t["b"],t["c"],!1,null,"53b7175e",null,!1,t["a"],u);e["default"]=s.exports},"9ea2":function(n,e,i){"use strict";(function(n){i("a8db");t(i("66fd"));var e=t(i("6eaf"));function t(n){return n&&n.__esModule?n:{default:n}}n(e.default)}).call(this,i("543d")["createPage"])},a863:function(n,e,i){"use strict";var t=i("f6a4"),r=i.n(t);r.a},ba21:function(n,e,i){"use strict";i.r(e);var t=i("ffa3"),r=i.n(t);for(var a in t)"default"!==a&&function(n){i.d(e,n,(function(){return t[n]}))}(a);e["default"]=r.a},f6a4:function(n,e,i){},ffa3:function(n,e,i){"use strict";(function(n){Object.defineProperty(e,"__esModule",{value:!0}),e.default=void 0;var t=r(i("a34a"));function r(n){return n&&n.__esModule?n:{default:n}}function a(n,e,i,t,r,a,u){try{var o=n[a](u),s=o.value}catch(c){return void i(c)}o.done?e(s):Promise.resolve(s).then(t,r)}function u(n){return function(){var e=this,i=arguments;return new Promise((function(t,r){var u=n.apply(e,i);function o(n){a(u,t,r,o,s,"next",n)}function s(n){a(u,t,r,o,s,"throw",n)}o(void 0)}))}}var o=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("c2cb"))}.bind(null,i)).catch(i.oe)},s={data:function(){return{ruleForm:{shangpinmingcheng:"",shangpinleibie:"",xiaoliang:"",fengmian:"",shangpinxinxi:"",dianzhuxingming:"",dianzhuzhanghao:"",shangpinzhuangtai:"",thumbsupnum:"",crazilynum:"",clicktime:"",clicknum:"",price:"",onelimittimes:"",alllimittimes:""},shangpinleibieOptions:[],shangpinleibieIndex:0,shangpinzhuangtaiOptions:[],shangpinzhuangtaiIndex:0,user:{},ro:{shangpinmingcheng:!1,shangpinleibie:!1,xiaoliang:!1,fengmian:!1,shangpinxinxi:!1,dianzhuxingming:!1,dianzhuzhanghao:!1,shangpinzhuangtai:!1,thumbsupnum:!1,crazilynum:!1,clicktime:!1,clicknum:!1,price:!1,onelimittimes:!1,alllimittimes:!1}}},components:{wPicker:o},computed:{},onLoad:function(e){var i=this;return u(t.default.mark((function r(){var a,u,o,s;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return a=n.getStorageSync("nowTable"),r.next=3,i.$api.session(a);case 3:if(u=r.sent,i.user=u.data,i.ruleForm.dianzhuxingming=i.user.dianzhuxingming,i.ruleForm.dianzhuzhanghao=i.user.dianzhuzhanghao,i.shangpinleibieOptions="宠物区,食品区,日用品区".split(","),i.shangpinzhuangtaiOptions="上架,下架".split(","),i.ruleForm.userid=n.getStorageSync("userid"),e.refid&&(i.ruleForm.refid=e.refid,i.ruleForm.nickname=n.getStorageSync("nickname")),!e.id){r.next=17;break}return i.ruleForm.id=e.id,r.next=15,i.$api.info("shangpinxinxi",i.ruleForm.id);case 15:u=r.sent,i.ruleForm=u.data;case 17:if(!e.cross){r.next=84;break}o=n.getStorageSync("crossObj"),r.t0=t.default.keys(o);case 20:if((r.t1=r.t0()).done){r.next=84;break}if(s=r.t1.value,"shangpinmingcheng"!=s){r.next=26;break}return i.ruleForm.shangpinmingcheng=o[s],i.ro.shangpinmingcheng=!0,r.abrupt("continue",20);case 26:if("shangpinleibie"!=s){r.next=30;break}return i.ruleForm.shangpinleibie=o[s],i.ro.shangpinleibie=!0,r.abrupt("continue",20);case 30:if("xiaoliang"!=s){r.next=34;break}return i.ruleForm.xiaoliang=o[s],i.ro.xiaoliang=!0,r.abrupt("continue",20);case 34:if("fengmian"!=s){r.next=38;break}return i.ruleForm.fengmian=o[s],i.ro.fengmian=!0,r.abrupt("continue",20);case 38:if("shangpinxinxi"!=s){r.next=42;break}return i.ruleForm.shangpinxinxi=o[s],i.ro.shangpinxinxi=!0,r.abrupt("continue",20);case 42:if("dianzhuxingming"!=s){r.next=46;break}return i.ruleForm.dianzhuxingming=o[s],i.ro.dianzhuxingming=!0,r.abrupt("continue",20);case 46:if("dianzhuzhanghao"!=s){r.next=50;break}return i.ruleForm.dianzhuzhanghao=o[s],i.ro.dianzhuzhanghao=!0,r.abrupt("continue",20);case 50:if("shangpinzhuangtai"!=s){r.next=54;break}return i.ruleForm.shangpinzhuangtai=o[s],i.ro.shangpinzhuangtai=!0,r.abrupt("continue",20);case 54:if("thumbsupnum"!=s){r.next=58;break}return i.ruleForm.thumbsupnum=o[s],i.ro.thumbsupnum=!0,r.abrupt("continue",20);case 58:if("crazilynum"!=s){r.next=62;break}return i.ruleForm.crazilynum=o[s],i.ro.crazilynum=!0,r.abrupt("continue",20);case 62:if("clicktime"!=s){r.next=66;break}return i.ruleForm.clicktime=o[s],i.ro.clicktime=!0,r.abrupt("continue",20);case 66:if("clicknum"!=s){r.next=70;break}return i.ruleForm.clicknum=o[s],i.ro.clicknum=!0,r.abrupt("continue",20);case 70:if("price"!=s){r.next=74;break}return i.ruleForm.price=o[s],i.ro.price=!0,r.abrupt("continue",20);case 74:if("onelimittimes"!=s){r.next=78;break}return i.ruleForm.onelimittimes=o[s],i.ro.onelimittimes=!0,r.abrupt("continue",20);case 78:if("alllimittimes"!=s){r.next=82;break}return i.ruleForm.alllimittimes=o[s],i.ro.alllimittimes=!0,r.abrupt("continue",20);case 82:r.next=20;break;case 84:i.styleChange();case 85:case"end":return r.stop()}}),r)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},clicktimeConfirm:function(n){console.log(n),this.ruleForm.clicktime=n.result,this.$forceUpdate()},shangpinleibieChange:function(n){this.shangpinleibieIndex=n.target.value,this.ruleForm.shangpinleibie=this.shangpinleibieOptions[this.shangpinleibieIndex]},shangpinzhuangtaiChange:function(n){this.shangpinzhuangtaiIndex=n.target.value,this.ruleForm.shangpinzhuangtai=this.shangpinzhuangtaiOptions[this.shangpinzhuangtaiIndex]},fengmianTap:function(){var n=this;this.$api.upload((function(e){n.ruleForm.fengmian=n.$base.url+"upload/"+e.file,n.$forceUpdate(),n.$nextTick((function(){n.styleChange()}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var n=this;return u(t.default.mark((function e(){return t.default.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!n.ruleForm.xiaoliang||n.$validate.isIntNumer(n.ruleForm.xiaoliang)){e.next=3;break}return n.$utils.msg("销量应输入整数"),e.abrupt("return");case 3:if(!n.ruleForm.thumbsupnum||n.$validate.isIntNumer(n.ruleForm.thumbsupnum)){e.next=6;break}return n.$utils.msg("赞应输入整数"),e.abrupt("return");case 6:if(!n.ruleForm.crazilynum||n.$validate.isIntNumer(n.ruleForm.crazilynum)){e.next=9;break}return n.$utils.msg("踩应输入整数"),e.abrupt("return");case 9:if(!n.ruleForm.clicknum||n.$validate.isIntNumer(n.ruleForm.clicknum)){e.next=12;break}return n.$utils.msg("点击次数应输入整数"),e.abrupt("return");case 12:if(n.ruleForm.price){e.next=15;break}return n.$utils.msg("价格不能为空"),e.abrupt("return");case 15:if(!n.ruleForm.price||n.$validate.isNumber(n.ruleForm.price)){e.next=18;break}return n.$utils.msg("价格应输入数字"),e.abrupt("return");case 18:if(!n.ruleForm.onelimittimes||n.$validate.isIntNumer(n.ruleForm.onelimittimes)){e.next=21;break}return n.$utils.msg("单限应输入整数"),e.abrupt("return");case 21:if(!n.ruleForm.alllimittimes||n.$validate.isIntNumer(n.ruleForm.alllimittimes)){e.next=24;break}return n.$utils.msg("库存应输入整数"),e.abrupt("return");case 24:if(!n.ruleForm.id){e.next=29;break}return e.next=27,n.$api.update("shangpinxinxi",n.ruleForm);case 27:e.next=31;break;case 29:return e.next=31,n.$api.add("shangpinxinxi",n.ruleForm);case 31:n.$utils.msgBack("提交成功");case 32:case"end":return e.stop()}}),e)})))()},optionsChange:function(n){this.index=n.target.value},bindDateChange:function(n){this.date=n.target.value},getDate:function(n){var e=new Date,i=e.getFullYear(),t=e.getMonth()+1,r=e.getDate();return"start"===n?i-=60:"end"===n&&(i+=2),t=t>9?t:"0"+t,r=r>9?r:"0"+r,"".concat(i,"-").concat(t,"-").concat(r)},toggleTab:function(n){this.$refs[n].show()}}};e.default=s}).call(this,i("543d")["default"])}},[["9ea2","common/runtime","common/vendor"]]]);