<?php
/**
 * Copyright © 贝壳找房（北京）科技有限公司.
 * User: lishaoyao001
 * Date: 2019-03-19
 * Time: 11:33
 */
include('./problems/Solution.php');
$N     = $argv[1];
$solution = new Solution();
echo $solution->uniquePaths(2,2);