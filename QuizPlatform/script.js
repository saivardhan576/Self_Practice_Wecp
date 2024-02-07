let arr=[]
let count=1;
var number=0;
window.onload=function(){
    setAll(num=0)
    document.getElementById("next").disabled=false;
}
function nextQuestion(){
    var selected=""+document.querySelector('input[name="answer"]:checked').value;
    let index=count-1;
    checkAnswer(index,selected);
    // checkAnswer()
    if(count<arr.length){
    document.getElementById("no").innerText="Q. "+(count+1)+" of 5";
    setAll(count);
   count++;}
   else{
    document.getElementById("next").style.background= "grey" ;
    document.getElementById("next").disabled=true;
    document.getElementById("sub").removeAttribute("disabled");
    document.getElementById("sub").style.background= "red" ;
   }
}
 
function submit(){
   
    window.alert(`Quiz score is :: ${number}/5`);
    window.location.href="quiz.html";
}
 
///
 
function checkAnswer(index,selected){
 
    let correct=""+(arr[index].answer);
    if(correct !== selected){
        document.getElementById("score").innerText=`Score :: ${number}`;
    }
    else{
        number+=1;
        document.getElementById("score").innerText=`Score :: ${number}`;
    }
}
class question{
   
    constructor(question,opt1,opt2,opt3,opt4,answer){
        this.question=question;
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.answer=answer;
    }
}
 
 
function setAll(counter){
    document.getElementById("question").innerText=arr[counter].question;
    document.getElementById("answer1").innerText=arr[counter].opt1;
    document.getElementById("option1").value=arr[counter].opt1;
    //
    document.getElementById("answer2").innerText=arr[counter].opt2;
    document.getElementById("option2").value=arr[counter].opt2;
    //
    document.getElementById("answer3").innerText=arr[counter].opt3;
    document.getElementById("option3").value=arr[counter].opt3;
    //
    document.getElementById("answer4").innerText=arr[counter].opt4;
    document.getElementById("option4").value=arr[counter].opt4;
}
 
 
let question1= new question("what is the capital of bengal","Dhaka","kolkata","Patna","siliguri","kolkata");
let question2= new question("what is the capital of Bihar","Mumbai","Delhi","Patna","Lucknw","Patna");
let question3= new question("what is the capital of Bangladesh","Dhaka","kolkata","bihar","siliguri","Dhaka");
let question4= new question("what is the capital of Uttar Pradesh","Patna","kolkata","gangtok","Lucknow","Lucknow");
let question5= new question("what is the capital of Maharashtra","Mumbai","Nagpur","indore","Delhi","Mumbai");
arr.push(question1);
arr.push(question2);
arr.push(question3);
arr.push(question4);
arr.push(question5);
 