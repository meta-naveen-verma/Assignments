let getParent=(currentNode)=>{
    let parent = currentNode;
    while(parent.nodeName != 'DIV'){
        parent = parent.parentNode;
    }
    return parent;

}
let getSiblig=(currentNode)=>{
    let sibling = currentNode.nextSibling;
    while(sibling.nodeName != 'DIV' && sibling.nodeName != 'INPUT' && sibling.nodeName != 'BUTTON' && sibling.nodeName != 'TEXTAREA'){
        console.log(sibling.nodeName);
        sibling = sibling.nextSibling;
        if(sibling == null) return null;
    }
    console.log('----->'+sibling.nodeName);
    return sibling;
}


let handleSubmit=(event)=>{
    let parent = event.path[3];
    console.log(event.path);
    let center = parent.children[0];
    let content = center.children[1];
    content.style.display = 'none';
    if(parent.nextElementSibling==null){
        return
    }
    else{
        parent.nextElementSibling.children[0].children[1].style.display="block";
        console.log(parent.nextElementSibling);
        console.log(parent.nextElementSibling.path);
        console.log(parent.nextElementSibling.children[0]);
        console.log(parent.nextElementSibling.children[0].children[1]);
    }

}