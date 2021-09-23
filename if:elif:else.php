<?php
// if/elif/else statements
    $a = 55;
    $grade1 = 60;//under 60 = not passed
    $grade2 = 75;// ok
    $grade3 = 85;//good
    if($a<$grade1){
        echo"not passed";
    }elseif($a<$grade2){
        echo"you passed";
    }elseif($a<$grade3){
        echo "good grade!";
    }else{
        echo"perfect";
    }
?>   