<?php
class Name
{
    function Variable()
    {
        $name = 'Helen';
        $this->$name(); 
    }
    
    function Helen()
    {
        echo "This is Helen";
    }
}

$foo = new Name();
$funcname = "Variable";
$foo->$funcname();  

?>