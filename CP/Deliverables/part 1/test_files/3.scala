sc.range(1,100)
  .filter(i => (i%8 == 0))
  .map(i => (i/4, 2))
  .reduceByKey((a:Int, b:Int) => a+b)
  .collect()