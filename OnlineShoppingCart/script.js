function validate()
{
  let q1 = document.getElementById("item1").value;
  let item1 = document.getElementById("i1").value;
  let q2 = document.getElementById("item2").value;
  let item2 = document.getElementById("i2").value;
  let q3 = document.getElementById("item3").value;
  let item3 = document.getElementById("i3").value;
  let q4 = document.getElementById("item4").value;
  let item4 = document.getElementById("i4").value;
  
  let flag = 0;
  
  
  let reqd;
  
  if(q1 < 0)
  {
    reqd = item1;
  }
  else if(q2<0)
  {
    reqd = item2;
  }
  else if(q3<0)
  {
    reqd = item3;
  }
  else if(q4<0)
  {
    reqd = item4;
  }
  
  if(reqd != undefined)
  {
    document.getElementById("validateError").innerHTML = `Invalid quantity entered for ${reqd}`;
  }
    
  if(q1 > 0 && q2>0 && q3>0 && q4 > 0)
  {
    alert("Proceeding to checkout!Thank you for shopping");
  }
}
