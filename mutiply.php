<?php
function mutiply(){
    $a = readline('Enter the first number: ');
    $b = readline('Enter the second number: ');
    $muti = bcmul($a ,$b);
    echo $muti;
}
?>
