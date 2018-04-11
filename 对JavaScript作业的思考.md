# 对JavaScript作业的思考

这次的两个作业都是关于JS数组方面的考察~~我觉得吧~~

然后第一题没有什么大的知识点，第二题经查阅掌握了相关知识：

1. **使用selectedIndex属性获取当前选项的索引**

   ​	下拉框的选项是一个线性数组，每个选项都有一个索引，selectedIndex表示当前被选中的选项的索引号。结合options属性，可以得到被选中的option对象，从而对其做进一步的处理。当下拉框可多选时，selectedIndex属性返回第一个被选中的索引。
   selectedIndex是个只读的属性，想把通过索引指定的下拉框的项设置为选中状态，可以设置option对象的selected=true来实现。

2. **为select对象添加一个选项**

   ​	new Option(provinceCity[i],provinceCity[i])表示创建一个值为provinceCity[i]，文本为provinceCity[i]的option对象，nCity是页面上的city对象，i+1指定新添选项的位置。

3. **清空一个select对象**

   myselect.length=0;