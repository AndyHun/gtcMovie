<!DOCTYPE html>
<html>
<head>
    <title>Sample View</title>
    <script type="text/javascript" src="/fireday/lib/jquery.js"></script>
</head>
<body>
   This is sample view!
   <br/><br/>
   <a id="getUserByJsonp" href="#">getUserByJsonp</a>
   <br/><br/>
   <a id="getUserListByJson" href="#">getUserListByJson</a>
</body>
<script>
    $("#getUserByJsonp").bind("click",function(e){
        e.preventDefault();
        $.ajax({
            type:"GET",
            url:"http://localhost:8080/fireday/spc/getUser",
            //dataType:"jsonp",
            success: function(obj){
                alert("success:"+obj.userName);
            },
            error: function(obj){
                alert("error:"+obj.userName);
            }
        });
    });

    $("#getUserListByJson").bind("click",function(e){
        e.preventDefault();
        $.ajax({
            type:"GET",
            url:"http://localhost:8080/fireday/spc/getUserList",
            //dataType:"json",
            success: function(objArray){
                alert("success:"+objArray[0].userName);
            },
            error: function(objArray){
                alert("error:"+objArray.length);
            }
        });
    });
</script>
</html>