let screen=document.getElementById('screen');
let buttons=document.querySelectorAll('button');
let screenValue='';
for(item of buttons){
    
    item.addEventListener('click',(e)=>{
        let  buttontext=e.target.innerText;
        console.log('button text is '+buttontext);
        if(buttontext=='*'){
            screenValue+=buttontext;
            screen.value=screenValue;
        }
        else if(buttontext=='C'){
            screenValue="";
            screen.value=screenValue;
        }
        else if(buttontext=='='){
            screen.value=screenValue+"="+eval(screenValue);
            
        }
        else{
            screenValue+=buttontext;
            screen.value=screenValue;
        }
    })
}