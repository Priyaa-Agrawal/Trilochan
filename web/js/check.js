function check() {
        var checkBox = document.getElementById("Checked");
        var text = document.getElementById("text");
        if (checkBox.checked == true){
            text.style.display = "block";
        } else {
           text.style.display = "none";
        }
        }
      
function other(){
        var o = document.getElementById("others");
        var amt = document.getElementById("amt");
        if (o.checked == true){
            amt.style.display = "block";
        } else {
           amt.style.display = "none";
        }
}        
