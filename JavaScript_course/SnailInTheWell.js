function main() {
    var depth = parseInt(readLine(), 10);
    //your code goes here
    var dt = 0;
    for(var i =1; dt < depth; i++){
    	dt += 7;
    	if(dt >= depth){
   
    		break;
    	}
    	dt -= 2;
    }
    
   
    console.log(i);
}
