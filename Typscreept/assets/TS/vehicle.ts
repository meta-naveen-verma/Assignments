class Vehicle {
    name:string;
    type:string;
       vehicleNumber:string;
       employeeId:string;
       identification:string;
       total_bill:number;
    constructor() {
      
    }
  
    setCompanyName(name) {
      this.name = name;
    }
    setType(type) {
      this.type = type;
    }
  
    setVehicleNumber(vehicleNumber) {
      this.vehicleNumber = vehicleNumber;
    }
    setEmployeeId(employeeId) {
      this.employeeId = employeeId;
    }
    setIdentification(identi) {
      this.identification = identi;
    }
    setTotal_5_USD(){
      this.total_bill=5;
      console.log(this.total_bill);
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${5*110.60} YEN`
      label.style.display="block";
    }
    setTotal_100_USD(){
      this.total_bill=100;
      console.log(this.total_bill);
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${100*110.60} YEN`
      label.style.display="block";
    }
    setTotal_500_USD(){
      this.total_bill=500;
      console.log(this.total_bill);
      var label = document.getElementById('label-with-name');
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${500*110.60} YEN`
      label.style.display="block";
    }

    setTotal_10_USD(){
      this.total_bill=10;
      console.log(this.total_bill);
      var label = document.getElementById('label-with-name');
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${10*110.60} YEN`
      label.style.display="block";
    }
    setTotal_200_USD(){
      this.total_bill=200;
      console.log(this.total_bill);
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${200*110.60} YEN`
      label.style.display="block";
    }
    setTotal_1000_USD(){
      this.total_bill=1000;
      console.log(this.total_bill);
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${1000*110.60} YEN`
      label.style.display="block";
    }

    setTotal_20_USD(){
      this.total_bill=20;
      console.log(this.total_bill);
      var label = document.getElementById('label-with-name');
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${20*110.60} YEN`
      label.style.display="block";
    }
    setTotal_3500_USD(){
      this.total_bill=3500;
      console.log(this.total_bill);
      var label = document.getElementById('demoLable');
      label.innerText = `Hi your total bill is ${this.total_bill} USD / ${3500*110.60} YEN`
      label.style.display="block";
    }
    handlePress(event) {
      if (!event) event = window.event;

      var keyCode = event.code || event.key;
      
      if (keyCode == "Enter") {
        var currentNode = event.target;
        if (currentNode.id == "name") 
          this.setCompanyName(currentNode.value);
        else if (currentNode.id == "vehNum")
          this.setVehicleNumber(currentNode.value);
        else if (currentNode.name == "type") 
          this.setType(currentNode.value);
        else if (currentNode.id == "empId") 
          this.setEmployeeId(currentNode.value);
        else if (currentNode.id == "ident")
          this.setIdentification(currentNode.value);

        var parent;
        var sibling = getSiblig(currentNode);
        if (sibling == null) {
          parent = getParent(currentNode);
          parent.classList.toggle("hide");
          sibling = getSiblig(parent);
        }
        currentNode.classList.toggle("hide");
        sibling.classList.toggle("hide");
      }
    }
  }