class EmployeeDetails{
    name:string;
    mail:string;
    password:string;
    gender:String;
    constructor(){
    }
    checkPasswordStrength() {
            
    }
    isValidName(name){
        console.log("Validating name");
        var regex = /^[A-Za-z ]{2,}$/
        return regex.test(name);
    }
    isValidMail(mail){
        console.log("Validating Mail");
        var regex = /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
        return regex.test(mail);
    }
    isValid(password){
        var regex = /(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}/;
        return regex.test(password);
    }
    isConfirmPassValid(password){
        return this.password == password;
    }
    isValidContact(contact){
        var regex = /^[\d]{8,10}$/
        return regex.test(contact);
    }

    handlePress(event){
        if (!event) event = window.event;
        var keyCode = event.code || event.key;
        if (keyCode == 'Enter'){
            var currentNode = event.target;
            console.log(currentNode.id);
            if(currentNode.id == 'fullName'){
                if(!this.isValidName(currentNode.value)){
                    currentNode.classList.toggle('error');
                    document.getElementById('nameError').style.display="block";
                    return;
                }
                this.name = currentNode.value;
                document.getElementById('nameError').style.display = "none";
            }
            if(currentNode.id == 'email'){
                if(!this.isValidMail(currentNode.value)){
                    currentNode.classList.toggle('error');
                    document.getElementById('mailError').style.display="block";
                    return;
                }
                this.name = currentNode.value;
                document.getElementById('mailError').style.display = "none";
            }
            if(currentNode.id == 'password'){
                //check password strength
                var number = /([0-9])/;
                var alphabets = /([a-zA-Z])/;
                var special_characters = /([@,#,$])/;
                if (currentNode.value.length < 6) {
                    console.log(currentNode.value);
                    currentNode.classList.toggle('weak-password');
                    return;
                } else {
                    currentNode.classList.toggle('weak-password');
                    if (currentNode.value.match(number) && currentNode.value.match(alphabets) && currentNode.value.match(special_characters)) {
                        console.log(currentNode.value);
                    currentNode.classList.toggle('strong-password');
                    } else {
                        console.log(currentNode.value);
                    currentNode.classList.toggle('medium-password');
                    }
                }
                if(!this.isValid(currentNode.value)){
                    currentNode.classList.toggle('error');
                    document.getElementById('passError').style.display="block";
                    return;
                }
                this.password = currentNode.value;
                currentNode.classList.toggle('error');
                document.getElementById('passError').style.display = "none";
            }
            if(currentNode.id == 'confirm password'){
                if(!this.isConfirmPassValid(currentNode.value)){
                    currentNode.classList.toggle('error');
                    document.getElementById('cnpError').style.display="block";
                    return;
                }
                currentNode.classList.toggle('error');
                document.getElementById('cnpError').style.display = "none"; 
            }
            if(currentNode.id == 'contact'){
                if(!this.isValidContact(currentNode.value)){
                    currentNode.classList.toggle('error');
                    document.getElementById('contactError').style.display="block";
                    return;
                }
                currentNode.classList.toggle('error');
                document.getElementById('contactError').style.display = "none";  
            }
            if(currentNode.name == 'gender'){
                this.gender = currentNode.value;
            } 
            var parent;
            var sibling = getSiblig(currentNode);
            if(sibling == null){
                parent =  getParent(currentNode);
                parent.classList.toggle('hide');
                sibling = getSiblig(parent);
            }
            var label = document.getElementById('label-with-name');
            if(currentNode.id == 'fullName'){
                this.name = currentNode.value;
                console.log();
                label.innerText = `Hi ${this.name}, Can I get your ${sibling.id}.`
                label.classList.toggle('hide');
                label.style.display="block";
            }
            else if(sibling.nodeName!='BUTTON'){
                label.innerText = `Please enter your ${sibling.id}` 
            }
            else{
                label.innerText ="";
            }
            currentNode.classList.toggle('hide');
            sibling.classList.toggle('hide');
    
    
          return false;
        }
    }
}