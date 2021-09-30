<?php
 function test ($a){
    $a = 10;
    echo $a."&nbsp";
    if($a>0){
        test($a*2);
    }
    else{
        test($a/2);
    }
    echo $a."&nbsp";
 }
 ?>