function getParent(currentNode){
    var parent = currentNode;
    while(parent.nodeName != 'DIV'){
        parent = parent.parentNode;
    }
    return parent;

}
function getSiblig(currentNode){
    var sibling = currentNode.nextSibling;
    while(sibling.nodeName != 'DIV' && sibling.nodeName != 'INPUT' && sibling.nodeName != 'BUTTON' && sibling.nodeName != 'TEXTAREA'){
        console.log(sibling.nodeName);
        sibling = sibling.nextSibling;
        if(sibling == null) return null;
    }
    console.log('----->'+sibling.nodeName);
    return sibling;
}


function handleSubmit(event){
    var parent = event.path[3];
    console.log(event.path);
    var center = parent.children[0];
    var content = center.children[1];
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
function handleGet(event){
    var parent = event.path[6];
    console.log(event.path);
    console.log(parent);
    var center = parent.children[0];
    console.log(center);
    var content = center.children[1];
    console.log(content);
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